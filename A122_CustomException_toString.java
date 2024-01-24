public class A122_CustomException_toString {
        int age;
        void get(int age) throws AgeException {
            if(age<18){
                throw new AgeException("This is Invalid Age");
            }
            else {
                this.age = age ;


            }
        }

        public static void main(String[] args) {
            A122_CustomException_toString e1 = new A122_CustomException_toString();
            try{
                e1.get(10);
            }
            catch (AgeException e){
                System.out.println(e);
            }
        }
        class AgeException extends Exception{
            String s;
            AgeException(String s){
                this.s = s;
            }
            public String toString(){
                return s;
            }
        }

}
