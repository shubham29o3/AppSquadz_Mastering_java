import java.sql.*;
import java.util.concurrent.atomic.AtomicReference;

public class GetTableName {
    public static void main(String[] args) throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc");
        Statement st = conn.createStatement();
        getTables(conn);
        st.close();
        conn.close();
    }
    public static void getTables(Connection conn) throws Exception{
        String TABLE_NAME = "TABLE_NAME";
        String TABLE_SCHEMA = "TRABLE_SCHEMA";
        //String[] TABLE_TYPES = {"VIEW"};
        String[] TABLE_TYPES = {"TABLE","VIEW"};
        DatabaseMetaData dbmd = conn.getMetaData();

        ResultSet tables = dbmd.getTables(null,null,null,TABLE_TYPES);
        ResultSetMetaData rsmd = tables.getMetaData();
        int count = rsmd.getColumnCount();
        System.out.println(count);
        for (int i=1;i<=count;i++){
            System.out.println(rsmd.getColumnName(i));
            System.out.println(rsmd.getColumnTypeName(i));
        }
        while (tables.next()){
            //System.out.println(tables.getString(TABLE_NAME));
            System.out.println(tables.getString(3));
            //System.out.println(tables.getString(TABLE_SCHEMA) + "schema");
        }
    }
}
