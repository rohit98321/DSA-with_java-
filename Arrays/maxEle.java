package Arrays;

public class maxEle {
    public static void main(String[] args) {
        int[] arr={60,444,555,40};
        int big=0;
        int secondbigger=0;

        if(arr[0]>arr[1]){
            big=arr[0];
            secondbigger=arr[1];
        }
        else{
            big=arr[1];
            secondbigger=arr[0];
        }

        for(int i=2;i<arr.length;i++){
            if(arr[i]>big){
                secondbigger=big;
                big=arr[i];
            }
            else if(arr[i]>secondbigger)
            {
                secondbigger=arr[i];
            }
        }

        
        System.out.println("big number is "+big);
        System.out.println("Secondbigger number is "+secondbigger);
    } 
}
