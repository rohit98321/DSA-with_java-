import java.util.*;

public class Q4 {

    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 5, 6, 12, 5, 2 };
        display(arr);
        System.out.println("enter modification Number : ");
        int k = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] - k) <= 0) {
                arr[i] = arr[i] + k;
            } else {
                arr[i] = arr[i] - k;
            }
        }

        display(arr);
        int largest = 0;
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }

        }

        System.out.println("the difference between tallest tower and smallest tower --> " + (largest - smallest));

        sc.close();
    }
}
