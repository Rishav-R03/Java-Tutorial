import java.util.Scanner;

public class columnMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the dimensions of the matrix
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Create the matrix
        int[][] matrix = new int[rows][cols];

        // Prompt the user to enter the elements of the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Perform multiplication for each column
        for (int j = 0; j < cols; j++) {
            int columnProduct = 1;
            for (int i = 0; i < rows; i++) {
                columnProduct *= matrix[i][j];
            }
            System.out.println("Product of column " + (j + 1) + ": " + columnProduct);
        }

        scanner.close();
    }
}
