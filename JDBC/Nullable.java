import java.sql.*;

public class Nullable {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abc");
        Statement st = conn.createStatement();
        //st.execute("drop table user11");
        String sql = "create table user11(id number(11) NOT NULL, username varchar(20))";
        st.execute(sql);
        ResultSet result1 = st.executeQuery("select id, username from user11");
        ResultSetMetaData metaData = result1.getMetaData();
        int nullability = metaData.isNullable(1);

        if (nullability == ResultSetMetaData.columnNullable) {
            System.out.println("Columns ID can have a null value");
        } else if (nullability == ResultSetMetaData.columnNullableUnknown) {
            System.out.println("Columns ID nullability is not known");
        } else if (nullability == ResultSetMetaData.columnNoNulls) {
            System.out.println("Columns ID does not allowed to have null value");
        }
    }
}