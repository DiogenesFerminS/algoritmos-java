import java.util.Arrays;

public class MatrizBurbujaParesImpares {
    public static void main(String[] args) {
        int[][] matriz = {
                {5, 8, 3},
                {2, 9, 4},
                {1, 7, 6}
        };

        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[] lineal = new int[filas * columnas];

        int index = 0;
        for (int[] fila : matriz) {
            for (int num : fila) {
                lineal[index++] = num;
            }
        }

        // Burbuja
        for (int i = 0; i < lineal.length - 1; i++) {
            for (int j = 0; j < lineal.length - 1 - i; j++) {
                if (lineal[j] > lineal[j + 1]) {
                    int temp = lineal[j];
                    lineal[j] = lineal[j + 1];
                    lineal[j + 1] = temp;
                }
            }
        }

        System.out.println("Matriz ordenada con método burbuja:");
        for (int i = 0; i < lineal.length; i++) {
            System.out.print(lineal[i] + " ");
            if ((i + 1) % columnas == 0) System.out.println();
        }

        System.out.println("Números pares:");
        Arrays.stream(lineal).filter(x -> x % 2 == 0).forEach(System.out::println);
        System.out.println("Números impares:");
        Arrays.stream(lineal).filter(x -> x % 2 != 0).forEach(System.out::println);
    }
}