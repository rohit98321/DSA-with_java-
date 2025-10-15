package Arrays;
import myUtils.ArrayHelper;

public class basic {
    public static void main(String[] args) {
        
        int []arr={10,20,30,40};
        arr[3]=34;
        ArrayHelper.push(arr,100);
        ArrayHelper.printArray(arr);
        

    }
}
