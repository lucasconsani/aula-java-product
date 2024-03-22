import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double soma = 0.0;

        System.out.println("Quantos números você irá digitar?");
        int n = sc.nextInt();

        double[] numero = new double[n];

        for (int i = 0; i < numero.length; i++) {
            System.out.print("Digite um número: ");
            numero[i] = sc.nextDouble();
        }
        System.out.print("VALORES: ");
        for (double v : numero) {
            System.out.printf("%.1f ", v);
        }

        for (double s : numero) {
            soma += s;
        }
        System.out.printf("%nSOMA: %.2f%n", soma);

        double avg = soma / numero.length;
        System.out.printf("MEDIA: %.2f", avg);


        sc.close();

    }
}