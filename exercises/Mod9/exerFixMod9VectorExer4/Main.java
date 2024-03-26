import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você irá digitar?");
        int n = sc.nextInt();
        int[] numero = new int[n];
        int contador = 0;

        for (int i = 0; i < n; i++) {
            contador += 1;
            System.out.printf("Digite o %d número:", contador);
            numero[i] = sc.nextInt();
        }

        System.out.println("Numeros Pares:");
        for (int i = 0; i < n; i++) {
            if (numero[i] % 2 == 0) {
                System.out.printf("%d ", numero[i]);
            }
        }
        System.out.printf("%nQuantidade de números pares: ");
        contador = 0;
        for (int value : numero) {
            if (value % 2 == 0) {
                contador += 1;
            }
        }
        System.out.print(contador);

        sc.close();
    }
}

