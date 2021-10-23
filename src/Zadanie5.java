import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Wprowadź zakres: ");
        int zakres = input.nextInt();

        String liczbyPierwsze = wyznaczLiczbyPierwsze(zakres);
        System.out.printf("Liczby pierwsze dla n = %d: %s", zakres, liczbyPierwsze);
    }

    public static String wyznaczLiczbyPierwsze(int zakres) {
        StringBuilder wynik = new StringBuilder();

        for (int i = 1; i <= zakres; i++) {
            int licznik = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    licznik = licznik + 1;
                }
            }
            if (licznik == 2) {
                wynik.append(i).append(" ");
            }
        }
        return wynik.toString();
    }
}


