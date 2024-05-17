import java.util.*;

public class Main {
    public static void main(String[] args) throws DomainException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Inicial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double limit = sc.nextInt();
            Account acc = new Account(number, holder, balance, limit);
            System.out.println("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error.");
        }catch (DomainException e){

        }






        sc.close();
    }
}