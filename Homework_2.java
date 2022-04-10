import java.util.Random;

public class HomeWork_2 {
    private int minNumber = -99;
    private int maxNumber = 99;

    private void fillArray(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(this.maxNumber - this.minNumber) + this.minNumber;
            }
        }
    }

    private void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("[" + matrix[i][j] + "], ");
            }
            System.out.print("]");
            System.out.println();
        }
    }

    private void printMaxValue(int[][] matrix) {
        int maxValue = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (maxValue < matrix[i][j]) {
                    maxValue = matrix[i][j];
                }
            }
        }
        System.out.println("Max value is - " + maxValue);
    }

    public void createMatrix(int length, int columns) {
        int matrix[][] = new int[length][columns];
        this.fillArray(matrix);
        this.printMatrix(matrix);
        this.printMaxValue(matrix);
    }
}