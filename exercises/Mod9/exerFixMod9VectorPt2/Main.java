import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] product = new Product[n];
        double sum = 0.0;

        for (int i = 0; i < product.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextInt();
            product[i] = new Product(name, price);
            sum += product[i].getPrice();

        }

        double avg = sum / product.length;

        System.out.printf("AVERAGE PRICE = %.2f", avg);


        sc.close();
    }
}