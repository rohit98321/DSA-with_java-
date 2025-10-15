package Arrays;
import java.util.*;

public class LeftRotaionByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr={10,20,30,40,50};
        int firtsElement;
        
        System.out.println("please enter the shift number :  ");
        int num=sc.nextInt();
        num=num%arr.length;
     
        for(int p=0;p<num;p++){
             firtsElement=arr[0];
            for(int i=0;i<arr.length;i++){
                if(i!=arr.length-1){
                    arr[i]=arr[i+1];
                }
            }
           
            arr[arr.length-1]=firtsElement;
        }

        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }





        sc.close();
    }
}
