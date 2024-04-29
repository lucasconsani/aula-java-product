import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParseException {
        Account acc = new Account(1001, "Alex", 1000.0);
        acc.withdraw(200.0);
        System.out.println(acc.getBalance());

        Account acc1 = new SavingsAccount(1002,"Maria", 1000.0, 0.01);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new BusinessAccount(1003, "Paulo", 1000.0, 200.0);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());


    }
}