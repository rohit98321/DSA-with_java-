public class Q2 {
    static void display(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int []arr={1,0,5,0,3,0,45,656,0,2};
        int temp;

        for(int i=0;i<arr.length;i++){
            
            if(arr[i]==0){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]!=0){
                        temp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                        break;
                    }
                }

            }
           
        }
        display(arr);
    }
}
