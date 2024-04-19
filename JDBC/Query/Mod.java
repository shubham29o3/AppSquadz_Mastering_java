import java.sql.*;
public class Mod {
    public static void main(String[] args) {
        try{
            Class.forName ("oracle.jdbc.driver.OracleDriver");
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc");
            Statement s = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet result1 = s.executeQuery("SELECT * FROM Employee WHERE MOD(empSalary,2100)=0");
            while(result1.next()){
                System.out.println(result1.getString(1));
                System.out.println(result1.getString(2));
            }
        }catch (SQLException e){
            System.out.println(e);
        }catch(Exception i){
            System.out.println(i);
        }
    }
}
