import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner imputScanner = new Scanner(System.in);
        System.out.print("Введіть перший розмір многомірної матриці: ");
        int matrixSizeM = imputScanner.nextInt();
        System.out.print("Введіть другий розмір многомірної матриці: ");
        int matrixSizeN = imputScanner.nextInt();
        imputScanner.close();
        int[][] matrixMN = new int[matrixSizeM][matrixSizeN];
        int[][] matrixNM = new int[matrixSizeN][matrixSizeM];
        for (int i = 0; i < matrixMN.length; i++) {
            for (int j = 0; j < matrixMN[i].length; j++) {
                matrixMN[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < matrixNM.length; i++) {
            for (int j = 0; j < matrixNM[i].length; j++) {
                matrixNM[i][j] = matrixMN[j][i];
            }
        }
        System.out.println("Базова матриця:");
        for (int i = 0; i < matrixMN.length; i++) {
            System.out.println(Arrays.toString(matrixMN[i]));
        }
        System.out.println("Транспонована матриця:");
        for (int i = 0; i < matrixNM.length; i++) {
            System.out.println(Arrays.toString(matrixNM[i]));
        }
    }
}
