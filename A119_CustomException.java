public class A119_CustomException {
    int age;
    void get(int age) throws AgeException{
        if(age<18){
            throw new AgeException("This is Invalid Age");
        }
        else {
            this.age = age ;
        }
    }

    public static void main(String[] args) {
        A119_CustomException e1 = new A119_CustomException();
        try{
            e1.get(10);
        }
        catch (AgeException e){
            System.out.println(e);
        }
    }
    class AgeException extends Exception{
        AgeException(String s){
            super(s);
        }
    }
}
