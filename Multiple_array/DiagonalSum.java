public class DiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {
                { 5, 2, 3 },
                { 4, 6, 6,9 },
                { 7, 8, 9 }
        };
        int rightDiagonalSum = 0;
        int leftDiagonalSum = 0;
      

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i + j) == arr.length-1) {
                    System.out.println("dfdf"+arr[i][j]);
                    rightDiagonalSum += arr[i][j];
                }

                if (i == j) {
                    System.out.println(arr[i][j]);
                    leftDiagonalSum += arr[i][j];
                }
            }
        }

        System.out.println("rightDiogonalSum == " + rightDiagonalSum + " and leftDiagonalSum == " + leftDiagonalSum);
    }
}
