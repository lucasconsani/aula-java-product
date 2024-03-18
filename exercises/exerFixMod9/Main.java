import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int acNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)?");
        char choose = sc.next().charAt(0);

        if (choose == 'y') {
            System.out.print("Enter initial deposit value: ");
            double inicialDeposit = sc.nextDouble();
            account = new Account(acNumber, name, inicialDeposit);

        } else {
            account = new Account(acNumber, name);
        }
        System.out.printf("%nAccount data:%n");
        System.out.println(account);

        System.out.printf("%nEnter a deposit value: ");
        double deposit = sc.nextDouble();
        account.depositValue(deposit);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.printf("%nEnter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdrawValue(withdraw);
        System.out.println("Update account data: ");
        System.out.println(account);
        System.out.println("Do you want to change your name (y/n)?");
        choose = sc.next().charAt(0);
        if (choose == 'y') {
            System.out.print("Enter your name updated: ");
            sc.nextLine();
            String nameU = sc.nextLine();
            account.setName(nameU);
            System.out.println(account);
        } else {
            System.out.printf("Ok %s! Have a nice day!", account.getName());
        }
        sc.close();
    }
}