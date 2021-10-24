import java.util.Scanner;

public class Zadanie13 {

        public static void main(String[] args) {

//    Napisz program, który „się jąka", to znaczy pobiera użytkownika tekst (zmienną typu String),
//    a następnie wypisuje podany tekst, w którym każde słowo wypisane jest po dwa razy.
//    Przykładowo, dla wejścia: „To jest mój test" program powinien wypisać „To To jest jest mój mój test test".

            Scanner scanner = new Scanner(System.in);
            System.out.println("podaj tekst:");
            String userString = scanner.nextLine();


            String[] actualValue = userString.split(" ");


            for (int i = 0; i < actualValue.length; i++) {

                actualValue[i] +=" "+ actualValue[i]+" ";

                System.out.print(actualValue[i]);
            }
        }

    }