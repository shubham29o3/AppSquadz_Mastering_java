public class A113_Finally {
    static int show()
    {
        try{
            //System.exit(0); // Program terminates normally from this point no instruction to be read from exit point on wards.
            //int x = 10/0; // Not catched by catch block then also the finally block will be executed
            return 20;
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        finally{
            return 40;  // 20 will be stored in a cache memory finally will be given preference and tus output 40
        }
    }

    public static void main(String[] args) {
        int z = show();
        System.out.println(z);
        //finally f1 = null;
        //f1.show();
    }
}
