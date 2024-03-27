import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serão digitados?");
        int n = sc.nextInt();
        Aluno[] aluno = new Aluno[n];

        int cont = 0;
        for (int i = 0; i < aluno.length; i++) {
            cont += 1;
            System.out.printf("Digite o nome, primeira e segunda nota do %d° aluno:%n", cont);
            sc.nextLine();
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            aluno[i] = new Aluno(nome, nota1, nota2);
        }
        System.out.println("ALUNOS APROVADOS:");
        for (Aluno value : aluno) {
            double media = (value.getNota1() + value.getNota2()) / 2;
            if (media >= 6.0) {
                System.out.println(value.getNome());
            }
        }


        sc.close();
    }
}

