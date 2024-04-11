import java.sql.*;
public class FetchSize {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc");
        Statement stmt = conn.createStatement();
        int fetchSize = stmt.getFetchSize();
        System.out.println(fetchSize);

        stmt.setFetchSize(100);
        fetchSize= stmt.getFetchSize();
        System.out.println(fetchSize);

        ResultSet result1 = stmt.executeQuery("select * from bank1");
        fetchSize = result1.getFetchSize();
        System.out.println(fetchSize+ " via result1 before");
        result1.setFetchSize(200);
        fetchSize= result1.getFetchSize();
        System.out.println(fetchSize+ " via result1 after");
        stmt.setFetchSize(500);
        fetchSize =result1.getFetchSize();
        System.out.println(fetchSize+ "via resultset after changing in Statement");
    }
}
