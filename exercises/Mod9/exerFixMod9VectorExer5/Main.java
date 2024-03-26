import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int n = sc.nextInt();
        double maior = 0;
        int posicaoMaior = 0;
        double[] numero = new double[n];

        for(int i = 0; i < numero.length ; i++){
            System.out.print("Digite um número: ");
            numero[i] = sc.nextDouble();
            if (maior < numero[i]) {
                maior = numero[i];
                if(numero[i] == numero[0]){
                    posicaoMaior = 0;
                }else{
                    posicaoMaior += 1;
                }
            }
        }
        System.out.print("MAIOR VALOR = " + maior);
        System.out.printf("%nPOSICAO DO MAIOR VALOR = %d", posicaoMaior);


      sc.close();
    }
}

