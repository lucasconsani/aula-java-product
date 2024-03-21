import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números voce vai digitar?");
        int n = sc.nextInt();

        while (n > 10) {
            System.out.println("Por favor, digite um número menor ou igual a 10");
            System.out.println("Quantos números voce vai digitar?");
            n = sc.nextInt();
        }

        int[] numero = new int[n];

        for (int i = 0; i < numero.length; i++) {
            System.out.print("Digite um numero:");
            numero[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for (int j : numero) {
            if (j < 0) {
                System.out.println(j);
            }
        }

        sc.close();

    }
}