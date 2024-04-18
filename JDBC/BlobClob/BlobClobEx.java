import java.sql.*;
import java.io.*;

//BLOB's (Binary Large OBject) store binary files: pictures, text, audio files, word documents, etc
//CLOB's (Character Large OBjects) store character data. They are often used to store XML docs, JSON's or just large blocks of formatted or unformatted text.
public class BlobClobEx {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc");
        Statement stmt = conn.createStatement();
        createBlobClobTables(stmt);

        PreparedStatement pstmt = conn.prepareStatement("INSERT INTO BlobClob VALUES(40,?,?)");

        File file = new File("blob.txt");
        FileInputStream fis = new FileInputStream(file);
        pstmt.setBinaryStream(1,fis,(int)file.length());

        file = new File("clob.txt");
        fis = new FileInputStream(file);
        pstmt.setAsciiStream(2,fis, (int) file.length());
        fis.close();

        pstmt.execute();
        ResultSet rs = stmt.executeQuery("select * from BLOBCLOB WHERE id = 40");
        rs.next();

        java.sql.Blob blob = rs.getBlob(2);
        java.sql.Clob clob = rs.getClob(3);

        byte blobVal[] = new byte[(int) blob.length()];
        InputStream blobIs = blob.getBinaryStream();
        blobIs.read(blobVal);
        String s = new String (blobVal);
        System.out.println(s);
        blobIs.close();

        char clobVal[] = new char[(int) clob.length()];
        Reader r = clob.getCharacterStream();
        r.read(clobVal);

        String sw = new String(clobVal);
        System.out.println(sw);

        r.close();
        conn.close();
    }
    public static void createBlobClobTables(Statement stmt) throws Exception{
        String sql = "create table BlobClob(Id NUMBER(3) , b BLOB, c CLOB)";
        try{
            stmt.executeUpdate("drop table BlobClob");
        }catch (SQLException se){
            if (se.getErrorCode() == 942)
                System.out.println("Error dropping BlobClob table: " +se.getMessage());
        }
        if (stmt.executeUpdate(sql) ==0)
            System.out.println("BlobClob table created......");
    }
}
