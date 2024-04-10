import java.util.*;
import java.sql.*;
public class TestUpdate {
    public static void main(String[] args) {
        try {
            Driver d = new oracle.jdbc.driver.OracleDriver();
            Properties dbProp = new Properties();
            dbProp.put("user", "system");
            dbProp.put("password", "abc");
           Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", dbProp);
            String z = "durga";
            String t4 = "ram";
            Statement s = c.createStatement();
            int z1 = s.executeUpdate("update emp101 set NAME='" + z + "'where NAME='"+ t4 +"'");
            System.out.println(z1);
            ResultSet result1 = s.executeQuery("select * from emp101");
            while (result1.next()) 
			{
                System.out.println(result1.getString(1));
                System.out.println(result1.getString(2));
            }
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception i) {
            System.out.println(i);
        }
    }
}
