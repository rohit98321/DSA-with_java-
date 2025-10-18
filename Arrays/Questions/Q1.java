// Given an array arr[] of size n, find the element that appears more than ⌊n/2⌋ times

public class Q1 {
    public static void main(String args[]) {
        int[] arr = { 2, 2, 2, 2, 2, 2, 3, 3, 3, 2, 2, 3, 3 };
        int n=arr.length/2;
       
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            count=1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                   
                }
               
            }
            if (count > n) {
                System.out.println(arr[i] + " is fullfill the condition ");
                System.out.println("total number of this element : "+count);
                break;
            }

        }
       
        if(count<n){
            System.out.println("no element is there");
    };

    }
}