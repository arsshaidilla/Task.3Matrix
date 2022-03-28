public class MatrixEx5 {
    public MatrixEx5() {
    }

    public static void main(String[] args) {
        int[][] matrix = new int[10][10];

        int sum;
        int i;
        for(sum = 0; sum < matrix.length; ++sum) {
            matrix[sum][sum] = sum;

            for(i = 0; i < matrix.length; ++i) {
                System.out.print(matrix[sum][i] + "  ");
            }

            System.out.println("");
        }

        sum = 0;

        for(i = 0; i < matrix.length; ++i) {
            sum += matrix[i][i];
        }

        System.out.println("\nSum of diagonal: " + sum);
    }
}
