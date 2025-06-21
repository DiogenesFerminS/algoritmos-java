import java.util.Scanner;

public class MatrizSimetrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño N de la matriz cuadrada (NxN): ");
        int n = scanner.nextInt();

        double[][] matriz = new double[n][n];

        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\nMatriz ingresada:");
        mostrarMatriz(matriz);

        if (esSimetrica(matriz)) {
            System.out.println("\nLa matriz ES simétrica.");
        } else {
            System.out.println("\nLa matriz NO es simétrica.");
        }
    }

    private static boolean esSimetrica(double[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void mostrarMatriz(double[][] matriz) {
        for (double[] fila : matriz) {
            for (double elemento : fila) {
                System.out.printf("%8.2f", elemento);
            }
            System.out.println();
        }
    }
}