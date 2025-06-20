import java.util.ArrayList;
import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {

        String confirm;
        Scanner scanner = new Scanner(System.in);

        do{
            ArrayList<Float> numeros = new ArrayList<>();
            float suma = 0;

            System.out.println("Ingrese la cantidad de numeros que sea sacarle la media Aritmetica");
            int n = scanner.nextInt();
            scanner.nextLine();

            for(int i = 1; i <= n; i++){
                System.out.println("Ingrese el numero " + i + ": " );
                float num = scanner.nextInt();
                scanner.nextLine();
                numeros.add(num);
                suma = suma + num;
            };

            float mediaAritmetica = suma/n;
            System.out.println("La media aritmetica es de : " + mediaAritmetica);

            for(int i = 0; i < numeros.size(); i++){
                if (numeros.get(i) > mediaAritmetica){
                    System.out.println("El numero " + numeros.get(i) + " es mayor a la media Aritmetica");
                };
            };

            System.out.println("Desea reiniciar el Programa? S/N");
            confirm = scanner.nextLine();

        }while (!confirm.equalsIgnoreCase("N"));

        System.out.println("El programa ha finalizado");
        scanner.close();

    }
}