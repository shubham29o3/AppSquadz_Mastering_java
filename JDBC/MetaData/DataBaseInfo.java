import java.sql.*;
public class DataBaseInfo {
    public static void main(String[] args)  throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abc");
        DatabaseMetaData mtdt = conn.getMetaData();
        System.out.println("URL in Use: " +mtdt.getURL());
        System.out.println("User name: " +mtdt.getUserName());
        System.out.println("DBMS name: " +mtdt.getDatabaseProductName());
        System.out.println("DBMS Version: " +mtdt.getDatabaseProductVersion());
        System.out.println("Driver name: " +mtdt.getDriverName());
        System.out.println("Driver version: " +mtdt.getDriverVersion());
        System.out.println("supp. SQL Keywords: " +mtdt.getSQLKeywords());
        conn.close();
    }
}
