class Throwable extends Object{
    String s;
    public String toString(){
        return s;
    }
}
class Exception extends Throwable{
    Exception(String s){
        this.s = s;
    }
}

public class A121_Throwable {
    public static void main(String[] args) {
        Exception e = new Exception("hello");
        System.out.println(e);
    }
}
