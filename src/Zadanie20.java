import java.util.Random;
import java.util.Scanner;

public class Zadanie20 {
    //Napisz program, który będzie z Tobą grał w „za dużo, za mało”. Na początku komputer losuje liczbę z zakresu od 0 do 100
    // (podpowiedź: skorzystaj z metody Random.nextInt())
    // a następnie czeka na podanie liczby przez użytkownika.
    // Jeśli użytkownik poda liczbę większą, niż wylosowana przez komputer, program powinien wypisać „za dużo” i czekać na podanie kolejnej liczby.
    // Jeśli użytkownik poda liczbę mniejszą, program powinien wypisać „za mało” i analogicznie czekać na następną liczbę.
    // Jeśli użytkownik poda odpowiednią wartość, to program powinien wypisać słowo „Bingo!” i zakończyć się.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("Podaj liczbę z zakresu od 0 do 100");
        int randomNumber = ran.nextInt(100);
        int userNumber = -1;
        while (userNumber!=randomNumber) {
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
