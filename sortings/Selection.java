public class Selection {

    static void dislay(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int[] arr = { 50, 2, 6, 0, 23, 85, 152 };

        int temp;
        int small;
        for (int i = 0; i < arr.length; i++) {
            small = i;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[small] > arr[j]) {
                    small = j;
                }

            }
            
            if(i!=small){
                temp=arr[small];
                arr[small]=arr[i];
                arr[i]=temp;
            }
        }
        dislay(arr);

    }
}