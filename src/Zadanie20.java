import java.util.Random;
import java.util.Scanner;

public class Zadanie20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("Podaj liczbę z zakresu od 0 do 100");
        int randomNumber = ran.nextInt(100);
        int userNumber = -1; // nwm czy ta zmienna jest potrzebna ale bez tego program się sypie
        while (!(userNumber == randomNumber)) {
            userNumber = scanner.nextInt();
            if (userNumber < randomNumber) {
                System.out.println("Za mało");
            } else if (userNumber == randomNumber) {
                System.out.println("Bingo");
            } else {
                System.out.println("Za dużo");
            }
        }
    }
}
