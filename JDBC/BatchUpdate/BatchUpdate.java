import java.sql.*;
public class BatchUpdate {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc");
            Statement s = c.createStatement();
            String s1="update emp101 set name='lalau2' where pass='Gadar2'";
            String s2 = "insert into emp101 values('12april','12april')";
            String s3 = "delete from emp101 where pass='19oct'";
            s.addBatch(s1);
            s.addBatch(s2);
            s.addBatch(s3);
            s.executeBatch();
            ResultSet result1 = s.executeQuery("select * from emp101");
            while(result1.next()){
                System.out.println("name " +result1.getString(1));
                System.out.println("pass " +result1.getString(2));
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
