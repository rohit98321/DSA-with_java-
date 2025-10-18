public class Q5 {
    public static void main(String args[]){
        int []arr={-2,3,-5,-6};

        int sum=arr[0];
        int temp=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>sum) sum=arr[i];
            for(int j=i+1;j<arr.length;j++){
                temp=0;
                    for(int k=i;k<=j;k++){
                        System.out.println(k+" " + arr[k]);
                        temp=temp+arr[k];
                        
                    }
                    System.out.println("temp -->"+temp);
                    if(temp>sum){
                       
                        sum=temp;
                    }
            }
        }
        System.out.println("sum--> "+sum);
    }
}
