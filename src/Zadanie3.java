import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        //ZADANIE 3.
        //Napisz program służący do rozwiązywania równania kwadratowego.
        // Program powinien pobrać trzy liczby całkowite (współczynniki równania kwadratowego a, b, c)
        // i wyliczyć pierwiastki x1, x2 równania
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int b = scanner.nextInt();
        System.out.println("Podaj trzecią liczbę");
        int c = scanner.nextInt();
        int delta = funkcjakwadratowa(a,b,c);
        System.out.println("Twoja delta wynosi " + delta);
        pierwiastkikwadratowe(a,b,c,delta);
    }
    public static int funkcjakwadratowa (int a, int b, int c) {
        int delta1= b*b - 4 * a * c;
        return delta1;
    }
    public static void pierwiastkikwadratowe (int a, int b, int c, int delta) {
        if (delta <0){
            System.out.println("Brak rozwiązań (delta < 0)");
        } else if (delta ==0) {
            int x =-b / (2 * a);
            System.out.printf("Jedno podwójne rozwiązanie x = %f", x);
        } else {
            int x1 = (int) ((-b - Math.sqrt(delta)) / (2 * a));
            int x2 = (int) ((-b + Math.sqrt(delta)) / (2 * a));
            System.out.println ("Pierwiastek jeden to " + x1);
            System.out.println ("Pierwiastek dwa to " + x2);
        }
    }
}

