import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Zadanie17 {
    //Napisz program, który pobierze od użytkownika datę najbliższych Twoich zajęć w SDA i obliczy ile dni do nich pozostało.
    // Podpowiedź: datę wczytaj jako typ String i przeparsuj na LocalDate.
    // Obecną datę pobierz z metody LocalDate.now().
        public static void main(String[] args) {
            LocalDate dataNow = LocalDate.now();
            System.out.println(dataNow.toString());

            Scanner scanner = new Scanner(System.in);
            String dateOfClasses = scanner.nextLine();
            LocalDate localDate = LocalDate.parse(dateOfClasses);
            System.out.println(localDate);
            int roznica = (int) ChronoUnit.DAYS.between(dataNow,localDate);
            System.out.println("Różnica dni to " + roznica);
        }
    }

