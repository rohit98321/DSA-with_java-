package Arrays;

import java.util.*;

public class leftRotation3 {
    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void reverse(int[] arr, int i, int end) {
        int temp;
        while (i < end) {
            temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
            end--;
            i++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 10, 20, 30, 40, 50 };

        System.out.println("enter the rotation number : ");
        int num = sc.nextInt();
        num = num % arr.length;

        reverse(arr, 0, num - 1);
        reverse(arr, num, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        display(arr);

        sc.close();
    }

}
