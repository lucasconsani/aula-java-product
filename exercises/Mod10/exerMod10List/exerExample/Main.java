import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();

        System.out.println("How many employees will be registered?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1));
            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(employeeList, id)) {
                System.out.println("You can't write the same id was write before, please write the id again:");
                System.out.print("Id: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            employeeList.add(new Employee(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int employeeId = sc.nextInt();
        Employee findEmp = employeeList.stream().filter(x -> x.getIdEmployee() == employeeId).findFirst().orElse(null);
        if (findEmp == null) {
            System.out.println("This id don't exists");
        } else {
            System.out.print("Enter the percentage:");
            double percent = sc.nextDouble();
            findEmp.increaseSalary(percent);
        }

        System.out.println("List of employess:");
        for (Employee x : employeeList) {
            System.out.println(x);
        }

        sc.close();
    }

    public static boolean hasId(List<Employee> employeeList, int employeeId) {
        Employee findEmp = employeeList.stream().filter(x -> x.getIdEmployee() == employeeId).findFirst().orElse(null);
        return findEmp != null;
    }

}