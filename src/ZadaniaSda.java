import java.util.Scanner;

public class ZadaniaSda {
    public static void main(String[] args) {
        System.out.println();
        //2. ZADANIE 2.
        //Napisz program obliczający BMI (Body Mass Index) i sprawdzający, czy jest ono w normie.
        // Program powinien wczytywać od użytkownika dwie zmienne: wagę w kilogramach (typ float) oraz wzrost w centymetrach (typ int).
        // BMI powinno zostać wyliczone zgodnie z poniższym wzorem:
        //Optymalny zakres BMI wynosi od 18.5 do 24.9, wartości mniejsze lub większe są wartościami nieoptymalnymi. Twój program powinien wypisać „BMI optymalne” lub „BMI nieoptymalne”, zgodnie z powyższymi założeniami.
        System.out.println("Witaj w programie do obliczenia Twojego BMI");
        System.out.println("Podaj wagę");
        Scanner scanner = new Scanner(System.in);
        float scales = scanner.nextFloat();
        System.out.println("Podaj wzrost");
        float increase = scanner.nextFloat();
        float results = calc (increase,scales);
    }

    public static float calc(float increase, float scales) {
        float exponentiation = (float) Math.pow(increase, 2);
        float BMI = scales / (exponentiation);
        return BMI;
    }
}
