//Creating a Database:
//-------------------------------------------------------im MySQL
//create database helloshubham;
//CREATE USER 'helloshubham'@'localhost'IDENTIFIED BY'helloshubham';
//GRANT ALL PRIVILEGES ON *.* TO 'helloshubham'@'localhost'WITH GRANT OPTION;




import java.sql.*;
import java.io.*;
public class MySQL {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/helloshubham", "root","svt");
            String t1 = "lalu";
            int t2 = 123;
            Statement s = c.createStatement();
            s.executeUpdate("create table emp123(name varchar(20),salary int)");
            s.close();
            PreparedStatement ps = c.prepareStatement("insert into emp123 values(?,?)");
            ps.setString(1, t1);
            ps.setInt(2, t2);
            ps.executeUpdate();
            ps.close();
            ps = c.prepareStatement("select * from emp123 where salary=?");
            ps.setString(1, t1);
            ResultSet result1 = ps.executeQuery();
            while (result1.next()) {
                System.out.println("name "+result1.getString(1));
                System.out.println("salary "+result1.getInt(2));
            }
        }
        catch(SQLException e){System.out.println(e);}
        catch(Exception i){System.out.println(i);}
    }
}
