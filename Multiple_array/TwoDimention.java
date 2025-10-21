class TwoDimention{
    public static void main(String args[]){
        int [][]arr=new int[3][4];

        arr[0][0]=10;
        arr[0][1]=20;
        arr[1][0]=30;
        arr[1][1]=40;
       System.out.print("[ ");
        for(int i=0;i<arr.length;i++){
            System.out.print("[");
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("] ");
            
           
        }
        System.out.print(" ]");
    }
}