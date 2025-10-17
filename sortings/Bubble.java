// in the inner loop this arr[j] is actual bubble which behave like bubble last element sorted itself thats why outer loop run till n-1

import java.util.*;
public class Bubble{
    static void dislay(int []arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int []arr={5,10,3,45,9,12,20};
        int n=arr.length;
        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        dislay(arr);
    }
}