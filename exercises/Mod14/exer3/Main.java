import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " data: ");
            System.out.print("Common, used or imported (c/u/i)?");
            char choose = sc.next().charAt(0);

            switch (choose) {
                case 'c':
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    Product product = new Product(name, price);
                    list.add(product);
                    break;

                case 'i':
                    System.out.print("Name: ");
                    name = sc.next();
                    System.out.print("Price: ");
                    price = sc.nextDouble();
                    System.out.print("Customs fee: ");
                    double customsFee = sc.nextDouble();
                    product = new ImportedProduct(name, price, customsFee);
                    list.add(product);
                    break;

                case 'u':
                    System.out.print("Name: ");
                    name = sc.next();
                    System.out.print("Price: ");
                    price = sc.nextDouble();
                    System.out.print("Manufacture Date (DD/MM/YYYY): ");
                    Date date = df.parse(sc.next());
                    product = new UsedProduct(name, price, date);
                    list.add(product);
                    break;

                default:
                    System.out.println("Invalid answer");
                    break;
            }
        }
        System.out.println("\nPRICE TAGS");
        for (Product p : list) {
            System.out.println(p.priceTag());
        }


        sc.close();

    }
}