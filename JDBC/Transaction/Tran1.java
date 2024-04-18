import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Tran1 {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc");
            Statement s = c.createStatement();
            c.setAutoCommit(false);
            int x = s.executeUpdate("update emp101 set name = 'manisha' where salary ='2017'");
            ResultSet result1 = s.executeQuery("select * from emp101 where salary='2017'");
            while (result1.next()){
                System.out.println("name " +result1.getString(1));
                System.out.println("salary " +result1.getString(2));
            }
            c.rollback();
            System.out.println("after rollback");
            ResultSet result2 = s.executeQuery("select * from emp101 where salary='2017'");
            while (result2.next()){
                System.out.println("name " + result2.getString(1));
                System.out.println("salary " + result2.getString(2));
            }
            c.commit();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
