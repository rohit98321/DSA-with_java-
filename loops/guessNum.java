package loops;
import java.util.*;

public class guessNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=(int)(Math.floor(Math.random()*100));
        int userNum;
        int attempts=0;
        
        
        do{
            System.out.println("enter your number");
            userNum=sc.nextInt();
            if(userNum>100 || userNum<=0) System.out.println("please enter valid number");
            attempts++;

            if(userNum>n){
                System.out.println("too big try again");
            }
            else if(userNum<n){
                System.out.println("too small try again");
            }
            else{
                System.out.println("victory! "+" no was " + n +" total attempt are "+attempts);
            }

        }while(n != userNum );

        sc.close();
    }
}
