class AgeException extends Exception{
    AgeException(String message){
        super(message);
    }
}
class Test{
    public static void main(String[] args){
        int age=15;
        try {
            if (age < 18){
                throw new AgeException("invalid age");
            }
            System.out.println("valid age");
         }
        catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
