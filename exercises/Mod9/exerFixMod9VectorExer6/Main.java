import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);

     System.out.println("Quantos valores terá cada vetor?");
     int n = sc.nextInt();
     int[] vectorA = new int[n];
     int[] vectorB = new int[n];
     int[] vectorC = new int[n];

     System.out.printf("%nDigite os valores do vetor A:%n");
     for (int i = 0; i < vectorA.length; i++){
         System.out.print("Digite um número: ");
         vectorA[i] = sc.nextInt();
     }
        System.out.printf("%nDigite os valores do vetor B:%n");
     for(int i = 0; i < vectorB.length; i++){
         System.out.print("Digite um número: ");
         vectorB[i] = sc.nextInt();
     }
        System.out.printf("%nValor Resultante:");
     for (int i = 0; i < vectorC.length; i++){
         vectorC[i] = vectorA[i] + vectorB[i];
         System.out.println(vectorC[i]);
     }

        System.out.println();

     sc.close();

    }
}

