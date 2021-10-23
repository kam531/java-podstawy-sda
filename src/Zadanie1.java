import java.util.Scanner;
public class Zadanie1 {
    public static void main(String[] args) {
        //1.Napisz program, który pobierze od użytkownika średnicę okręgu
        // (zmienną typu float) i obliczy obwód tego okręgu. Do obliczeń przyjmij najpierw π = 3.14,
        // a następnie skorzystaj z wbudowanej klasy Math i znajdującej się tam stałej PI.

        Scanner scanner = new Scanner (System.in);
        System.out.println("Podaj średnicę okręgu,żeby obliczyć jego obwód");
        float diamter = scanner.nextFloat();
        final double Pi1 = 3.14;
        double PI = Math.PI;
        float circumferenceofacircle= (float) (diamter * PI);
        System.out.println("Obwodkoła wynosi " + circumferenceofacircle);

    }
}
