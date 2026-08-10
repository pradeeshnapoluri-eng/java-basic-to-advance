public class prime_num {
    public static void main(String[] args) {
        for (int i=0;i<=100;i++) { // Loop through numbers from 0 to 100
            int count=0;
            for (int j=1;j<=i;j++) { // Loop through numbers from 1 to i
                if (i%j==0) {  //
                    count++;
                }
            }
            if (count==2) {
                System.out.println("the prime nums are:"+i);
            } else {
                System.out.println("the non-prime nums are:"+i);
            }
        }
    }
    
}
