import java.sql.*;
public class UpperLower {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc");
            int t1 = 123;
            String t2 = "lalu";
            Statement s = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            int x = s.executeUpdate("update Employee SET empName = UPPER(empName)");
            //int x = s.executeUpdate("update Employee SET empName = LOWER(empName)");
        }catch (SQLException e){
            System.out.println(e);
        }catch (Exception i){
            System.out.println(i);
        }
    }
}
