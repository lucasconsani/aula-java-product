import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws DomainException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Room Number: ");
            int roomNumnber = sc.nextInt();
            System.out.print("Check-in date (dd/mm/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/mm/yyyy): ");
            Date checkOut = sdf.parse(sc.next());
            Reservation reservation = new Reservation(roomNumnber, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println("\nEnter data to update the reservation: ");
            System.out.print("Check-in date (dd/mm/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/mm/yyyy): ");
            checkOut = sdf.parse(sc.next());
            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        } catch (ParseException e) {
            System.out.println("Invalid date format");
        } catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (RuntimeException e){
            System.out.println("Unexpected error.");
        }

        sc.close();
    }
}