public class A115_ThrowExample {
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
        new A115_ThrowExample().getAge(10);
    }
}
