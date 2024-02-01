import java.util.Arrays;

public class NeoMatrix {

    public static void main(String[] args) {
        // Розмір матриці (8x8)
        int matrixSize = 8;

        // Створюємо матрицю
        int[][] trainingMatrix = createTrainingMatrix(matrixSize);

        // Виводимо матрицю з квадратними скобками
        for (int i = 0; i < matrixSize; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(trainingMatrix[i][j]);
                if (j < matrixSize - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" ]");
        }
    }

    // Функція для створення тренувальної бойової матриці
    private static int[][] createTrainingMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = j + 1;
                } else {
                    matrix[i][j] = size - j;
                }
            }
        }
        return matrix;
    }
}




