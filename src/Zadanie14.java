import java.util.Scanner;

public class Zadanie14 {

    //Napisz program, który pobierze od użytkownika dwie małe litery alfabetu łacińskiego (typ char)
    // i wyliczy, ile znaków stoi w alfabecie pomiędzy podanymi literami.
    // Podpowiedź – skorzystaj z tablicy kodów ASCII i traktuj znaki jak liczby int.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj literę:");
        String userChar1 = scanner.next();

        System.out.println("podaj literę:");
        String userChar2 = scanner.next();


        for (int i = 0; i < userChar1.length(); i++) {
            char character = userChar1.charAt(i);
            int ascii = (int) character;
            System.out.println(character + " = " + ascii);

            char character1 = userChar2.charAt(i);
            int ascii1 = (int) character1;
            System.out.println(character1 + " = " + ascii1);

            int result = Math.abs(ascii1 - ascii);
            System.out.println(result);
        }

    }
}