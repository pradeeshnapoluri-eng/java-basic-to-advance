public class FizzBuzz {
    public static void main(String[] args) {
        for(int i=0;i<=100;i++){
             if (i % 3 == 0 && i % 5 ==0) {
                System.out.println("FizzBuzz nums are: "+i);
             }
             else if (i % 3 == 0) {
                System.out.println("Fizz nums are: "+i);
             }
             else if (i % 5 ==0 ) {
                System.out.println("Buzz nums are: "+i);
             }
             else {
                System.out.println("these "+i+" are non FB nums.");
             }
        }
    }
}
