package Arrays;
import java.util.*;

public class leftRotation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []arr={10,20,30,40,50};
        int []temp=new int[arr.length];
        System.out.println("enter the rotation number  : ");
        int num=sc.nextInt();
        num=num%arr.length;

        for(int i=0;i<arr.length;i++){
            temp[i]=arr[(i+num)%arr.length];
        }

        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
        








        sc.close();
    }
}
