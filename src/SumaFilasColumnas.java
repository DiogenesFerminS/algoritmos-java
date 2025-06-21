import java.util.Scanner;

public class SumaFilasColumnas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas: ");
        int n = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int m = scanner.nextInt();

        int[][] matriz = new int[n][m];
        int[] sumaFilas = new int[n];
        int[] sumaColumnas = new int[m];

        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                sumaFilas[i] += matriz[i][j];
                sumaColumnas[j] += matriz[i][j];
            }
        }

        System.out.println("Suma de cada fila:");
        for (int i = 0; i < n; i++) {
            System.out.println("Fila " + i + ": " + sumaFilas[i]);
        }

        System.out.println("Suma de cada columna:");
        for (int j = 0; j < m; j++) {
            System.out.println("Columna " + j + ": " + sumaColumnas[j]);
        }
        scanner.close();
    }
}