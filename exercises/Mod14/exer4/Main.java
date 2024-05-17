import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Tax payer #" + (i+1) + " data: ");
            System.out.print("Individual or Company (i/c)? ");
            char choose = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income:");
            double rendaAnual = sc.nextDouble();
            if(choose == 'i'){
                System.out.print("Health expenditures: ");
                double gastoComSaude = sc.nextDouble();
                Pessoa pessoa = new PessoaFisica(name, rendaAnual, gastoComSaude);
                list.add(pessoa);
            } else if (choose == 'c') {
                System.out.print("Number of employees: ");
                int numeroDeFuncionarios = sc.nextInt();
                Pessoa pessoa = new PessoaJuridica(name, rendaAnual, numeroDeFuncionarios);
                list.add(pessoa);
            }
        }
        System.out.println();
        System.out.println("TAXES PAID:");
        for(Pessoa pessoa : list){
            System.out.printf("%s: $ %.2f%n", pessoa.getNome(), pessoa.calcularImposto());
        }
        System.out.printf("%nTOTAL TAXES: $ ");
        double soma = 0.0;
        for(Pessoa pessoa : list){
            soma += pessoa.calcularImposto();
        }
        System.out.printf("%.2f", soma);

        sc.close();
    }
}