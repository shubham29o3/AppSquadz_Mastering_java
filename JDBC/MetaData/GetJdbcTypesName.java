import java.sql.*;
import java.lang.*;
public class GetJdbcTypesName {
    public static void main(String[] args)  throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc");
        DatabaseMetaData dbmd = conn.getMetaData();
        ResultSet resultSet = dbmd.getTypeInfo();
        while (resultSet.next()){
            String typeNmae = resultSet.getString("TYPE_NAME");
            short dataType = resultSet.getShort("DATA_TYPE");
            System.out.println(typeNmae+ "=" +dataType);
        }
    }
}
