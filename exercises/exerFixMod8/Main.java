import java.util.Locale;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("What is the dollar price?");
        CurrencyConverter.price = sc.nextDouble();
        System.out.println("How many dollars will be bought?");
        CurrencyConverter.qty = sc.nextDouble();

        System.out.printf("Amount to be paid in reais: %.2f", CurrencyConverter.calculate());

        sc.close();
    }

}