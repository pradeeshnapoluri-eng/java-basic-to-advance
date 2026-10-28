public class BinarySearch{
    public static void main(String args[]){
        int arr[]={10,20,30,40,50,60,70};
        int low=0;
        int high=arr.length-1;
        int target=50;
        while (low <= high){
            int mid= (low + high)/2;
            if (arr[mid]==target){
                System.out.println("element found at: "+ mid+" is "+arr[mid]);
                return;
            }
            else if(arr[mid] > target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println("element not found");

    }
}