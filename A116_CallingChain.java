public class A116_CallingChain {
    void show(){
        int x = 10/0;
        //System.out.println("show");
    }
    void display(){
        //System.out.println("display");
        show();
    }
    void xyz(){
        //System.out.println("xyz");
        display();
    }

    public static void main(String[] args) {
        try{
            new A116_CallingChain().xyz();
        }
        catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
