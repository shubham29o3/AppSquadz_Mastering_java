import java.sql.*;
public class MyBatchCallableStatement {
    public static void main(String[] args) {
        CallableStatement callSt = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc");
            Statement s = conn.createStatement();
            callSt = conn.prepareCall("call recins88(?,?)}");
            callSt.setInt(1,7);
            callSt.setString(2,"cheeta1");
            callSt.addBatch();
            callSt.setInt(1,8);
            callSt.setString(2,"chheta2");
            callSt.addBatch();
            int[] updateCounts = callSt.executeBatch();
            ResultSet result1 = s.executeQuery("select*from emp65");
            while(result1.next()){
                System.out.println("ID "+result1.getString(1));
                System.out.println("Name "+result1.getString(2));
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
