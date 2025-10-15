//all zero move to left and 1 move to right
package Arrays;

public class zeroOne {
    public static void main(String[] args) {
        int []arr={1,0,1,1,1,0,1,0,1,0,1,0};
        int i=0,j=0;
        while(i<arr.length){
            if(arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
            i++;

        }
        for(int k=0;k<arr.length;k++){
            System.out.print(" "+arr[k]);
        }
    }
}
