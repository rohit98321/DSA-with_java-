package Arrays.search;
import java.util.*;

public class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr={10,20,30,40,50,60};
        System.out.println("enter the target element : ");
        int target=sc.nextInt();
        int i=0;
        int j=arr.length-1;
        int mid;
        int index=-1;
        
        for(int k=0;k<j;k++){
            mid=(i+j)/2;
            if(arr[mid]==target){
                index=mid;
                break;
            }
            else if(target>arr[mid]){
                i=mid;
            }
            else if(target<arr[mid]){
                j=mid;
            }
        }
        if(index!=-1){
            System.out.println("found at "+index);
        }
        else{
            System.out.println("not found");
        }




        sc.close();
    }
}
