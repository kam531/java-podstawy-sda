import java.util.Scanner;

public class Zadanie12 {
    //Napisz program, który pobierze od użytkownika tekst (zmienną typu String) i
    // policzy jakim procentem wszystkich znaków tekstu był znak spacji, czyli
    // liczba spacji/liczba znaków *100
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            String [] words = str.split (" ");
            System.out.println("spacje" + words.length);
            System.out.println("długość litery " + str.length());
            int dlugosctekstu = words.length *100/str.length();
            System.out.println("Procent w tekście " + dlugosctekstu);
        }
    }

