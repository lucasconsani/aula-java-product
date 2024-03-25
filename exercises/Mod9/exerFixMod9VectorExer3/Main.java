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

        Pessoa[] pessoa = new Pessoa[n];
        double mediaAltura = 0.0;
        int cont0 = 0;
        int cont = 0;

        for (int i = 0; i < pessoa.length; i++) {
            cont += 1;
            System.out.printf("%nDados da %d° pessoa:", cont);
            System.out.printf("%nNome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            pessoa[i] = new Pessoa(nome, idade, altura);
        }


        for (Pessoa value : pessoa) {
            mediaAltura += value.getAltura();
        }

        System.out.printf("%nAltura média: %.2f", mediaAltura / pessoa.length);
        System.out.printf("%nPessoas com menos de 16 anos: ");
        for (Pessoa value : pessoa) {
            if (value.getIdade() < 16) {
                cont0 += 1;
            }
        }
        double porcentagem = (double) cont0 * 100 / pessoa.length;
        System.out.printf("%.1f", porcentagem);
        System.out.print("%");
        for (Pessoa teste : pessoa) {
            if (teste.getIdade() < 16) {
                System.out.printf("%n%s ", teste.getNome());
            }
        }

        sc.close();
    }
}

