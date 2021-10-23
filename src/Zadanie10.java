import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        int x, wynik;

//pobierz wartosc od uzytkownika
        System.out.println("Podaj wartosc x");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();

//oblicz sume cyfr danej liczby calkowitej
        wynik = 0;
        while (x != 0) {
            wynik += x%10;
            x /= 10;
        }

//podaj wynik
        System.out.println("suma cyfr podanej liczby wynosi " + wynik);
    }

}
