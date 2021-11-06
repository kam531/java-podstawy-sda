import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        pobierzDane();
        //Napisz program, który pobierze od użytkownika 10
        // dowolnie dużych liczb (zmiennych typu int) i wypisze te, które wystąpiły minimum dwukrotnie.
    }

    public static void pobierzDane() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj 10 liczb: ");

        final List<Integer> arrayUserInt = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayUserInt.add(scanner.nextInt());
        }

        final List<Integer> listaZPowtorzeniami = new ArrayList<>();

        for (int i = 0; i < arrayUserInt.size(); i++) {
            for (int j = 0; j < arrayUserInt.size(); j++) {
                // sprawdzam czy jest powtórzenie
                final Integer a = arrayUserInt.get(i);
                final Integer b = arrayUserInt.get(j);
                if (i != j && a.equals(b)) {
                    //sprawdzenie czy powtórzona liczba jest w liście z powtórzeniami
                    if (!listaZPowtorzeniami.contains(a)) {
                        listaZPowtorzeniami.add(a);
                    }
                }
            }
        }
        listaZPowtorzeniami.forEach(System.out::println);
    }
}

