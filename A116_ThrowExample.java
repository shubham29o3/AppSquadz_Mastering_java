public class A116_ThrowExample {
    int age;
    void getAge(int age){
        if(age<18){
            try{
                throw new ArithmeticException("Invalid age");
            }
            catch (ArithmeticException e){
                System.out.println(e.getMessage());
                System.out.println(e);
            }
        }
        else
            this.age = age;
    }

    public static void main(String[] args) {
        new A116_ThrowExample().getAge(10);
    }
}
