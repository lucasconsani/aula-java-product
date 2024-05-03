import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.println("Enter the number of employees");
        int n =  sc.nextInt();
        for(int i = 1; i <= n; i++ ) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)?");
            char choose = sc.next().charAt(0);
            System.out.print("Name:");
            String name = sc.next();
            System.out.print("Hours:");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (choose == 'y') {
                System.out.print("Additional charge:");
                double addCharge = sc.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, addCharge));
            } else {
                list.add(new Employee(name, hours, valuePerHour));
            }
        }
        System.out.println();
        System.out.println("PAYMENTS:");
        for(Employee x : list) {
            System.out.print(x.getName() + " - $");
            System.out.printf("%.2f %n", x.payment());
        }

        sc.close();

    }
}