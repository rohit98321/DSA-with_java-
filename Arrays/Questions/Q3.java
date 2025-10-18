// Given an array arr[] consisting of n integers, find all the array elements which occurs more than floor(n/3) times



public class Q3 {
    public static void main(String args[]) {
        int[] arr = { 2, 2, 3, 2, 3, 2, 2, 1 };

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

            }
            if (count > arr.length / 3) {

                System.out.print(arr[i] + " ");
                count = 0;
            }

        }

    }
}
