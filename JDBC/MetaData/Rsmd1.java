import java.sql.*;
public class Rsmd1 {
    public static void main(String[] args) throws Exception {
        Connection conn = getOracleConnection();
        Statement st = conn.createStatement();
        st.executeUpdate("drop table survey");
        st.executeUpdate("create table survey (id number(4),name varchar(30))");
        st.executeUpdate("insert into survey (id,name) values(9,'messa')");
        ResultSet rs = st.executeQuery("SELECT * FROM survey");
        ResultSetMetaData rsMetaData = rs.getMetaData();
        int numberOfColumns = rsMetaData.getColumnCount();
        System.out.println("resultSet MetaData column Count = " +numberOfColumns);

        for (int i=1;i<=numberOfColumns;i++){
            System.out.println("column MetaData ");
            System.out.println("column MetaData " + i);
            //indicates the designated column's normal maximum width in Character
            System.out.println(rsMetaData.getColumnDisplaySize(i));
            //gets the designated column's suggested title for the use in printouts and display
            System.out.println(rsMetaData.getColumnLabel(i));
            //get the designated column's name
            System.out.println(rsMetaData.getColumnName(i));

            //get the designated column's SQL type.
            System.out.println(rsMetaData.getColumnTypeName(i)); // (Types.INTEGER ==z)

            //get the designated column's SQL type name.
            System.out.println(rsMetaData.getColumnClassName(i));

            //get the designated column's table name.
            System.out.println(rsMetaData.getTableName(i));

            //get the designated column's number of decimal digits.
            System.out.println(rsMetaData.getPrecision(i));

            //gets the designated column's number of digits to right of the decimal point
            System.out.println(rsMetaData.getScale(i));

            //indicates whether the designated column is automatically numbered, thus read-only.
            System.out.println(rsMetaData.isAutoIncrement(i));

            //indicates whether the designated column is a cash value.
            System.out.println(rsMetaData.isCurrency(i));

            //indicates the nuli1bility of values in the designated column
            System.out.println(rsMetaData.isNullable(i));

            //indicates wheteher the designated column is definitely not writable.
            System.out.println(rsMetaData.isReadOnly(i));

            //indicates whether a column's case matters in the designated column.
            System.out.println(rsMetaData.isCaseSensitive(i));

            //indicates ehether a column's case matters in the designated column.
            System.out.println(rsMetaData.isSearchable(i));

            //indicates whether values in the designated column are signed numbers.
            System.out.println(rsMetaData.isSigned(i));

            //Gets the designated column's tables catalog name.
            System.out.println("Catelog Name: " + rsMetaData.getCatalogName(i));

            //Gets the designated columns table's schema name.
            System.out.println("schema name: " + rsMetaData.getSchemaName(i));
        }
        st.close();
        conn.close();
    }
    public static Connection getOracleConnection() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc");
        return c;
    }
}
