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
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite um número:");
            vector[i] = sc.nextInt();
        }

        int soma = 0;
        int cont = 0;
        for (int j : vector) {
            if (j % 2 == 0) {
                soma += j;
                cont += 1;
            }
        }
        double media = (double) soma / cont;
        if (soma == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            System.out.printf("%nMEDIA DOS PARES = %.1f", media);
        }

        sc.close();
    }
}

