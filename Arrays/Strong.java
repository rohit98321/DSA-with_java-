package Arrays;
import java.util.*;
public class Strong {
    static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }

        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int ans=0;
        int temp;
        System.out.println("enter the number");
        int n=sc.nextInt();
        temp=n;


        while(n>0){
            int rem=n%10;
            System.out.println(rem);

            ans=ans+factorial(rem);

             n=n/10;
             System.out.println(n);
            
        }
       
        if(temp==ans){
            System.out.println("this is strong number");
        }
        else{
            System.out.println("this is not strong number");
        }

       
        
        
        
        sc.close();
    }
}
