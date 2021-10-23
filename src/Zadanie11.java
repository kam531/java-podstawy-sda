import java.util.Scanner;

public class Zadanie11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zdanie");
        String end = "Starczy";
        String zdanie= "";
        String najDluzszy = "";
        while(!zdanie.equals(end)) {
            zdanie = scanner.nextLine();
            if (najDluzszy.length()<zdanie.length()) {
                najDluzszy = zdanie;
            }
        }
        System.out.println("Najdłuższy tekst to " + najDluzszy + " a jego liczba znaków to: "+ najDluzszy.length());

    }
}
