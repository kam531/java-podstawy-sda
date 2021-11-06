import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie16 {
    //Napisz program, który pobierze od użytkownika 10 liczb (zmiennych typu int) i
    // wypisze długość najdłuższego takiego podciągu tych liczb, który jest rosnący.
    // Przykładowo, dla liczb: „1, 3, 8, 4, 2, 5, 6, 11, 13, 7” program powinien wypisać „5”
    // jako długość najdłuższego rosnącego podciągu (w przykładzie podkreślonego).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj 10 liczb: ");

        final List<Integer> arrayUserInt = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayUserInt.add(scanner.nextInt());
        }
        int max = 0;
        for (int i = 0; i < arrayUserInt.size(); i++) {
            // tworzę nową listę rozpoczynająca się od indexu równego "i", aż do końca głównej listy
            final List<Integer> subList = arrayUserInt.subList(i, arrayUserInt.size());
            final int maxPodciagu = znajdzMaksymalnyCiag(subList);
            if (max < maxPodciagu) {
                max = maxPodciagu;
            }
        }
        System.out.println(max);
    }

    private static int znajdzMaksymalnyCiag(List<Integer> subList) {
            int result = 0;
            int poprzedniaLiczba = 0;
            int akutalnaLiczba = 0;
            int i = 0;
            while (i < subList.size()) {
                akutalnaLiczba = subList.get(i);
                if (akutalnaLiczba > poprzedniaLiczba) {
                    result += 1;
                } else {
                    break;
                }
                poprzedniaLiczba = subList.get(i);
                i++;
            }

            return result;
        }
}
