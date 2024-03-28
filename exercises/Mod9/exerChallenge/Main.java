import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rooms will be rented?");
        int n = sc.nextInt();
        while (n > 9 || n < 0) {
            System.out.println("Please write a number between 1 and 10!");
            n = sc.nextInt();
        }
        int cont = 0;
        Student[] student = new Student[10];


        for (int i = 0; i < n; i++) {
            cont += 1;
            System.out.printf("%n#rent %d%n", cont);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            student[room] = new Student(name, email, room);
        }

        System.out.printf("%nBusy rooms:%n");
        for (int i = 0; i < student.length; i++) {
            if (student[i] != null) {
                System.out.println(student[i].toString());
            }
        }
        sc.close();
    }
}

