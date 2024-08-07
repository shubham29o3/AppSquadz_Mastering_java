//Seeing External Changes

//Only a scroll-sensitive result set can see external changes to the underlying database, and it can only see the changes from external UPDATE operations. Changes from external DELETE or INSERT operations are never visible.


import java.sql.*;
public class SensitiveResultSet {
    public static void main(String[] args) {
        Statement st = null;
        Statement st1=null;
        ResultSet rs = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abc");
            DatabaseMetaData dbmd = conn.getMetaData();
            System.out.println("Support HOLD_CURSORS_OVER_COMMIT?" + dbmd.supportsResultSetHoldability(ResultSet.HOLD_CURSORS_OVER_COMMIT));
            boolean b = dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE);
            System.out.println(b);
            st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            st1 = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            st.setFetchSize(1);

            MyThread1 t1 = new MyThread1(st, st1);
            t1.start();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}


class MyThread1 extends Thread{
    Statement st;
    Statement st1;
    ResultSet rs;
    MyThread1(Statement st, Statement s1){
    this.st =st;
    this.st1 = st;
    }
    public void run() {
        try {
            rs = st.executeQuery("select accno,bal from bank1");
            while (rs.next()) {
                System.out.println("accno : " + rs.getString(1) + "=");
                System.out.println("bal: " + rs.getString(2));
                System.out.println(" ");
            }
            MyThread2 t2 = new MyThread2(st1);
            t2.start();
            try {
                t2.join();
            } catch (Exception e) {
            }
            rs.beforeFirst();
            System.out.println(" ");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class MyThread2 extends Thread{
    Statement st;
    MyThread2(Statement st){
        this.st = st;
    }
    public void run(){
        try {
            st.execute("UPDATE bank1 SET bal = bal+500");
            st.execute("COMMIT");
            st.close();
            System.out.println("record Updated");
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}