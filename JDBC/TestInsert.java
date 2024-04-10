import java.sql.*;
public class TestInsert {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abc");
            String t1 = "Raghu";
            String t2 = "1997";
            Statement s = c.createStatement();
            int x = s.executeUpdate("insert into emp101 values'" + t1 + "' , '" + t2 + "')");
            System.out.println(x);
            ResultSet result1 = s.executeQuery("select * from emp101");
            while (result1.next()) {
                System.out.println(result1.getString(1));
                System.out.println(result1.getString(2));
            }
        }
        catch (SQLException e){
            System.out.println(e);
        }
        catch (Exception i){ System.out.println(i);}
        }
    }
