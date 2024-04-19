import java.sql.*;
public class MinMax {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc");
            int t1 = 123;
            String t2 = "lalu";
            Statement s = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet result1 = s.executeQuery("select MIN(employee.empSalary) from Employee employee");
            //ResultSet result1 = s.executeQuery("select MAX(employee.empSalary) from Employee employee");
            while (result1.next()){
                System.out.println(result1.getString(1));
            }
        }catch (SQLException e){
            System.out.println(e);
        }catch (Exception i){
            System.out.println(i);
        }
    }
}
