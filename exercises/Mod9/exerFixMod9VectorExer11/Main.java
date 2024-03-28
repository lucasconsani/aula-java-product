import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int cont = 0;

        System.out.println("Quantas pessoas serão digitadas?");
        int n = sc.nextInt();
        Pessoa[] pessoa = new Pessoa[n];

        for(int i = 0; i < pessoa.length; i++){
            cont += 1;
            System.out.printf("Genero da %da pessoa: ", cont);
            char genero = sc.next().charAt(0);
            System.out.printf("Altura da %da pessoa: ", cont);
            double altura = sc.nextDouble();
            pessoa[i] = new Pessoa(genero, altura);

        }
        double menorAltura = 3.0;
        double maiorAltura = 0.0;
        double somaAltura = 0.0;
        int contMulher = 0;
        int somaHomem = 0;

        for (int i = 0; i < pessoa.length; i++){
            if(menorAltura > pessoa[i].getAltura()){
                menorAltura = pessoa[i].getAltura();
            }
            if(maiorAltura < pessoa[i].getAltura()){
                maiorAltura = pessoa[i].getAltura();
            }
            if(pessoa[i].getGenero() == 'F'){
                contMulher += 1;
                somaAltura += pessoa[i].getAltura();
            }
            if(pessoa[i].getGenero() == 'M'){
                somaHomem += 1;
            }
        }
        double mediaMulher = somaAltura / contMulher;

        System.out.printf("Menor altura: %.2f%n", menorAltura);
        System.out.printf("Maior altura: %.2f%n", maiorAltura);
        System.out.printf("Media das alturas das mulheres: %.2f%n", mediaMulher);
        System.out.printf("Numero de homens: %d", somaHomem);


        sc.close();
    }
}

