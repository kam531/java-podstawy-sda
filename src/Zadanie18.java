import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie18 {
    //Napisz program, który pobierze od użytkownika tekst (zmienna typu String) i sprawdzi, czy użytkownik kichnął,
    // tzn. czy w podanym tekście znajduje się tekst „aaaa psik” z dowolnie wieloma, ale minimum jedną literą ‘a’ na początku wyrażenia
    // (czyli kichnięciem jest zarówno „a psik”, jak i „aaaaaaaaaa psik”).
    // Podpowiedź: użyj wyrażenia regularnego z odpowiednim kwantyfikatorem.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        boolean userSneeze = doesUserSneeze(userInput);
        if(userSneeze){
            System.out.println("Użytkownik kichnął.");
        } else{
            System.out.println("Użytkownik NIE kichnął");
        }
            scanner.close();
    }

private static boolean doesUserSneeze(String userInput){
    Pattern sneezePatern = Pattern.compile("a+ psik");
    Matcher matcher = sneezePatern.matcher(userInput);
    return matcher.find();
}
}
