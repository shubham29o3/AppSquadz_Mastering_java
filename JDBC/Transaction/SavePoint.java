import java.sql.*;

public class SavePoint {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc");
            Statement s = c.createStatement();
            c.setAutoCommit(false);
            int x = s.executeUpdate("update emp101 set name ='radhe' where salary = '2016'");
            s.executeUpdate("insert into emp101 values('dhoni','7777')");
            Savepoint savept = c.setSavepoint("aaa");
            int x1 = s.executeUpdate("delete from emp101 where salary = '2015'");
            s.executeUpdate("insert into emp101 values('Maxwell','234')");
            c.rollback(savept);
            //c.releaseSavepoint(savept);
            c.commit();
            ResultSet result1 = s.executeQuery("select * from emp101");
            while(result1.next()){
                System.out.println("name: "+result1.getString(1));
                System.out.println("salary: "+result1.getString(2));
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
