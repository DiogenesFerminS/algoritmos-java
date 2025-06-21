import java.util.Scanner;

public class DivisionVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] I = new double[30];
        System.out.println("Ingrese 30 números reales distintos de cero:");

        for (int i = 0; i < I.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            I[i] = scanner.nextDouble();
            while (I[i] == 0) {
                System.out.println("El número no puede ser cero. Ingrese otro:");
                I[i] = scanner.nextDouble();
            }
        }

        System.out.print("Ingrese el valor de k (distinto de cero): ");
        double k = scanner.nextDouble();
        while (k == 0) {
            System.out.println("k no puede ser cero. Ingrese otro valor:");
            k = scanner.nextDouble();
        }

        double[] Q = new double[30];
        for (int i = 0; i < Q.length; i++) {
            Q[i] = I[i] / k;
        }

        System.out.println("\nVector original I:");
        mostrarVector(I);

        System.out.println("\nVector resultante Q (I/k):");
        mostrarVector(Q);
    }

    private static void mostrarVector(double[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Elemento %2d: %.2f\n", i + 1, vector[i]);
        }
    }
}