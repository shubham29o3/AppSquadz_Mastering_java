import java.sql.*;
public class MyUpdatableResultSet {
    public static void main(String[] args) {
        Statement st = null;
        ResultSet rs = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc");
            st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery("select accno,bal from bank1");
            rs.next();
            rs.deleteRow();
            System.out.println("record Deleted");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
