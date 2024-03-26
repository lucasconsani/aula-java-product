import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor?");
        int n = sc.nextInt();
        double[] vector = new double[n];
        double soma = 0.0;


        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite um número:");
            vector[i] = sc.nextDouble();
        }
        System.out.printf("%nMEDIA DO VETOR = ");
        for (double v : vector) {
            soma += v;
        }
        double media = soma / vector.length;
        System.out.printf("%.3f%n", media);

        System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
        for (double valor : vector) {
            if (valor < media) {
                System.out.println(valor);
            }
        }

        sc.close();

    }
}

