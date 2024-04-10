import java.sql.*;
import java.io.*;
import java.util.*;
public class TestRetrive2 {
    public static void main(String[] args)
    {
        try {
            FileInputStream fn = new FileInputStream("dp.properties");
            Properties pr = new Properties();
            pr.load(fn);
            String driver = pr.getProperty("driver");
            String url = pr.getProperty("url");
            String user = pr.getProperty("user");
            String pass = pr.getProperty("pass");
            Class.forName(driver);

            Connection c = DriverManager.getConnection(url,user,pass);
            Statement s = c.createStatement();
            ResultSet result1 = s.executeQuery("select * from emp101");

            while (result1.next()){
                //System.out.println(result1.getString(1)+"="+ result1.getString(2));
				System.out.println(result1.getString("NAME")+"="+ result1.getString(2));
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        catch (Exception i){
            System.out.println(i);
        }
    }
}
