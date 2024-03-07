import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product;
        char choose;
        int qtde;
        Scanner sc = new Scanner(System.in);

        product = new Product();

        System.out.print("Write the product name: ");
        product.name = sc.next();
        System.out.print("Write the price: ");
        product.price = sc.nextDouble();
        System.out.print("Write the quantity: ");
        product.qnty = sc.nextInt();

        product.ShowResult();

        System.out.println("Do you want to add more quantities on stock? (s/n)");
        choose = sc.next().charAt(0);

        if (choose == 's'){

            System.out.println("Enter the quantity wich you need to add: ");
            qtde = sc.nextInt();
            product.addProducts(qtde);
            product.ShowResult();
        }

        System.out.println("Do you want to remove quantities on stock? (s/n)");
        choose = sc.next().charAt(0);

        if (choose == 's'){
                System.out.println("Enter the quantity wich you need to remove: ");
                qtde = sc.nextInt();
                product.removeProducts(qtde);
                product.ShowResult();

        }

        sc.close();
    }

}