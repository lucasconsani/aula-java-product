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
        int[] rooms = new int[n];
        Student[] student = new Student[9];


        for (int i = 0; i < rooms.length; i++) {
            cont += 1;
            System.out.printf("#rent %d%n", cont);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            student[room] = new Student(name, email, room);
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < student.length; i++) {
            if (student[i] != null) {
                System.out.printf("%d: ", student[i].getRoom());
                System.out.printf("%s, ", student[i].getName());
                System.out.printf("%s%n", student[i].getEmail());
            }
        }
        sc.close();
    }
}

