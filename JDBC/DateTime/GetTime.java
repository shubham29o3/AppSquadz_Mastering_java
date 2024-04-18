import java.sql.*;

public class GetTime {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("driver:oracle:thin:@localhost:1521:xe","system","abc");
        Statement st = conn.createStatement();
        //st.executeUpdate("drop table survey113");
        st.executeUpdate("create table emp113(id number(3),myDate TIMESTAMP)");
        System.out.println("after");
        String INSERT_RECORD = "insert into survey113(id,myDate) values(?,?)";

        PreparedStatement psmt = conn.prepareStatement(INSERT_RECORD);
        psmt.setInt(1,1);
        java.sql.Time sqlDate = new java.sql.Time(new java.util.Date().getTime());
        psmt.setTime(2,sqlDate);

        psmt.executeUpdate();

        ResultSet rs = st.executeQuery("select * from survey113");
        while (rs.next()){
            System.out.println(rs.getTime(2));
        }
        rs.close();;
        st.close();
        conn.close();

    }
}
