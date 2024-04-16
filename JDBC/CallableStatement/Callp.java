import java.sql.*;
import java.io.*;
public class Callp {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc");
            Statement s = conn.createStatement();
            CallableStatement cs = conn.prepareCall("{call recins88(?,?)}");
            cs.setInt(1,41);
            cs.setString(2,"12april");

            cs.executeUpdate();

            ResultSet result1 = s.executeQuery("select * from emp65");
            while(result1.next()){
                System.out.println(result1.getString(1));
                System.out.println(result1.getString(2));
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
