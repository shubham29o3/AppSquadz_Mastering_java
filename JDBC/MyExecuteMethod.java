import java.sql.*;
public class MyExecuteMethod {
    public static void main(String[] args) {
        Connection conn = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc");
            Statement stmt = conn.createStatement();
			//execute() the query can be update query or can be select query

            String update = "update emp101 set name='csk' where salary = '7777'";
            String query = "select * from emp101";
            boolean status1 = stmt.execute(update);
            //int count = stmt.executeUpdateCount();
            //System.out.println("Total records updated: " + count);
            boolean status = stmt.execute(query);
            if(status){
                ResultSet rs = stmt.getResultSet();
                while (rs.next()){
                    System.out.println(rs.getString(1));
                    System.out.println(rs.getString(2));
                }
                rs.close();
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
