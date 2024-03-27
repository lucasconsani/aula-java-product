import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas voce vai digitar?");
        int n = sc.nextInt();
        int cont = 0;
        String nome1 = "";
        Pessoa[] pessoa = new Pessoa[n];


        for (int i = 0; i < pessoa.length; i++) {
            cont += 1;
            System.out.printf("Digite os dados da %d pessoa:%n", cont);
            sc.nextLine();
            System.out.print("Nome:");
            String nome = sc.nextLine();
            System.out.print("Idade:");
            int idade = sc.nextInt();
            pessoa[i] = new Pessoa(nome, idade);
        }
        cont = 0;
        for (Pessoa value : pessoa) {
            if (cont < value.getIdade()) {
                cont = value.getIdade();
                nome1 = value.getNome();
            }
        }
        System.out.printf("%nPESSOA MAIS VELHA: %s", nome1);


        sc.close();
    }
}

