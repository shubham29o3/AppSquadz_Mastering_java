import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Tran {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc");
            Statement s = c.createStatement();
            c.setAutoCommit(false);
            int x = s.executeUpdate("update emp101 set NAME = 'rabri' where SALARY='2018'");
            ResultSet resul1 = s.executeQuery("select * from emp101 where SALARY = '2018'");
            while(resul1.next()){
                System.out.println("name "+resul1.getString(1));
                System.out.println("salary "+resul1.getString(2));
            }
            c.commit();
            //c.commit();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
