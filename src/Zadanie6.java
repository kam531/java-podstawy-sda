import java.util.Scanner;

public class Zadanie6 {
    //Napisz program, który pobierze od użytkownika liczbę n (typu int)
    // i obliczy sumę szeregu harmonicznego od 1 do n, zgodnie ze wzorem poniżej:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double sum = 0;
        for (int i = 1; i <number ; i++) {
            sum = sum + (1/(double)i);
            System.out.println(sum);
        }
    }
}
