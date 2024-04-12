import java.sql.*;
public class MyUpdatableResultSet1 {
    public static void main(String[] args) {
        Statement st = null;
        ResultSet rs = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc");
            st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery("select accno,bal from bank1");
            while (rs.next())
                if(rs.getInt(1) == 345){
                    rs.updateInt(2,30);
                    rs.updateRow();
                    System.out.println("Record Updated!!");
                }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
