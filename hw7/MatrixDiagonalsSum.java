//Ունեք nxn չափի մատրիցա, n-ը որոշեք դուք։
//Պետքա գրել ծրագիր, որը կհաշվի մատրիցայի անկյունագծերի վրայի թվերի գումարը։
//2

package HW7;
public class MatrixDiagonalsSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 5, 78, 5},
                {1, 20, 1, -2},
                {0, -5, 10, -25},
                {-2, 40, 81, -20}

        };
        System.out.println("Sum of matrix main diagonal equals " + printMainDiagonalsSumOfMatrix(matrix));
        System.out.println("Sum of matrix second diagonal equals " + printSecondDiagonalsSumOfMatrix(matrix));
    }

    static int printMainDiagonalsSumOfMatrix(int[][] matrix) {
        int sumOfMainDiagonal = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    sumOfMainDiagonal += matrix[i][j];
                }
            }
        }
        return sumOfMainDiagonal;
    }
    static int printSecondDiagonalsSumOfMatrix(int[][] matrix) {
        int sumOfSecondDiagonal = 0;
        for (int i = 0; i < matrix.length; i++) {
                sumOfSecondDiagonal += matrix[i][matrix.length-i-1];


    }

        return sumOfSecondDiagonal;
    }
}
