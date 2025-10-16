package Arrays;

public class reverse {
    public static void main(String[] args) {
        int a = 7 / 2;
        int[] arr = {10,20,30,40,-50,60,70,-80,90,100};
        int temp = 0;
        int end = arr.length - 1;

        System.out.println("before reverse");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
        for (int i = 0; i < (arr.length / 2); i++) {

            if (i < end) {
                
                temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
            }
            end--;

        }
        
        System.out.println("after reverse");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
