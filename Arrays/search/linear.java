package Arrays.search;

import java.util.*;

public class linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 10, 20, 30, 40, 50, 60 };
        System.out.println("enter the target value : ");
        int target = sc.nextInt();
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }

        }
        if(index!=-1){
            System.out.println("element founded at "+index+" index");
        }
        else{
            System.out.println("not found this target element");
        }

        sc.close();

    }
}
