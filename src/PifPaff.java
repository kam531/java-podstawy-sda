import java.util.Scanner;

public class PifPaff {
    //zadanie 4
    public static void main(String[] args) {
        System.out.println("Podaj dodatnią liczbę");
        play();
    }
    public static void play () {
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= number ; i++) {
            if (i % 21 == 0) {
                System.out.println("PifPaf");
            }else if (i % 3 == 0) {
                System.out.println("Pif");
            } else if (i % 7 == 0) {
                System.out.println("Paf");
            } else {
                System.out.println(i);
            }
        }
    }
}
