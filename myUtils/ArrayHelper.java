package myUtils;  // <- Yeh declare karna mandatory hai

public class ArrayHelper {

    // method to print array
    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }

    public static int[] push(int[] arr, int value) {
        int newSize = arr.length + 1;
        int[] newArr = new int[newSize];

        // copy all elements
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        // add new element at last
        newArr[arr.length] = value;

        return newArr;
    }
}
