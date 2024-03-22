import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas?");
        int n = sc.nextInt();

        int[] cont = new int[n];
        Pessoa[] pessoa = new Pessoa[n];
        double mediaAltura = 0.0;
        int menorDe16 = 0;

        for(int i : cont){
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.printf("%nAltura: ");
            double altura = sc.nextDouble();
            pessoa[i] = new Pessoa(nome, idade, altura);
        }

        for(int i : cont){
            mediaAltura += pessoa[i].getAltura();
        }

        System.out.print("Altura média: " + mediaAltura / pessoa.length);
        System.out.print("Pessoas com menos de 16 anos: ");
        for(int j : cont){
            menorDe16 = pessoa[j].getIdade();
            if(menorDe16 < 16){

            }
        }


        sc.close();
    }
}