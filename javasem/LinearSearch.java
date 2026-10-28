public class LinearSearch{
    public static void main(String args[]){
        int arr[]={10,20,30,40,50,60};
        int target=40;
        int len=arr.length;
        for(int i=0;i<len;i++){ 
            if(arr[i]==target){
                System.out.println("element found at index: "+i+" is "+arr[i]);
                return;
            }
        }
        System.out.println("not found");
    }
}