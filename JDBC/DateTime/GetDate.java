import java.sql.*;
public class GetDate {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("driver:oracle:thin:@localhost:1521:xe","system","abc");
        Statement st = conn.createStatement();
        st.executeUpdate("drop table survey16");
        st.executeUpdate("create table emp116(id number(3),myDate DATE DEFAULT (sysdate))");
        String INSERT_RECORD = "insert into survey16(id,myDate) values(?,?)";

        PreparedStatement psmt = conn.prepareStatement(INSERT_RECORD);
        psmt.setInt(1,1);
        System.out.println(new java.util.Date().getTime());
        java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
        psmt.setDate(2,sqlDate);

        psmt.executeUpdate();

        ResultSet rs = st.executeQuery("select * from survey16");
        while (rs.next()){
            System.out.println(rs.getDate(2));
        }
        rs.close();;
        st.close();
        conn.close();

    }
}
