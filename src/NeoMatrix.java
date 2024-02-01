import java.util.Arrays;

public class NeoMatrix {

    public static void main(String[] args) {
        
        int matrixSize = 8;

    
        int[][] trainingMatrix = createTrainingMatrix(matrixSize);

        
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




