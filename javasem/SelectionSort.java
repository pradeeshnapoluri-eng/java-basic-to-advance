public class SelectionSort {
    public static void main(String args[]){
        int[] arr={3,6,4,1,2,5};
        int len=arr.length;
        // nested loop(outer loop)
        for (int i=0;i < len;i++){
            int mini=i; //declaring variable mini by storing i value.

            for(int j=i+1;j < len;j++){
                if (arr[mini]>arr[j]){ //here checking if mini is greater than j(we are checking whole arr sso we used j)
                    mini=j;
                }
            }
            // swapping elements...temp==arr[i]==arr[mini]==temp..
            int temp=arr[i];
            arr[i]=arr[mini];
            arr[mini]=temp;
        // get out of loops and write for loop for whole code above 
        }
        for(int x:arr)
            System.out.print(x+" "); 
    }
}
    