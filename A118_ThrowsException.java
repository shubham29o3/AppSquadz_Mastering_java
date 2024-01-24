import java.io.IOException;

public class A118_ThrowsException {
    static void show() throws IOException{
        throw new IOException("This is throws example");
    }

    public static void main(String[] args) //throws IOException
    {
        try{
            show();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
