import java.sql.*;
public class TestRetrive 
{
    public static void main(String []ss) 
	{
        try
		{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abc");
            Statement s = c.createStatement();
            ResultSet result1 = s.executeQuery("select * from emp101");

            while(result1.next()){
                System.out.println(result1.getString("NAME")+ "=" + result1.getString(2));
            }
			//System.out.println("All record printed");
        }
        catch (SQLException e){
            System.out.println(e);
        }
        catch (Exception i){
            System.out.println(i);
        }
    }
}
