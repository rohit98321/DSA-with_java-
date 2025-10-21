import java.util.*;
public class Input {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int row,column;
        System.out.println("enter array size : ");
        row=sc.nextInt();
        System.out.println("enter under element array size : ");
        column=sc.nextInt();
        int arr[][]=new int[row][column];

        System.out.println("enter the elements : ");

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }








        sc.close();
    }
    
}
