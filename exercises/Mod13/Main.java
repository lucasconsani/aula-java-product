import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        String dept = sc.next();
        System.out.println("Enter Worker data: ");
        System.out.print("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.next();
        System.out.print("Base Salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(dept));
        System.out.println("How many contracts to this worker? ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date data = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double value = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = sc.nextInt();
            HourContract contract = new HourContract(data, value, duration);
            worker.addContract(contract);
        }
        System.out.println();
        System.out.print("Enter month and yeah to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(month, year)));


        sc.close();
    }

}