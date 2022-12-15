package hu.progmatic.Branch;

/*
Kérj be a felhasználótól két számot, valamint egy matematikai műveleti jelet.
Ez utóbbi lehetséges értékei: + - * /
A megadott jelnek megfelelően végezd el a műveletet a két számmal, és az eredményt írd ki a képernyőre!
Például: ha a felhasználó által megadott adatok ezek: 10 5 / , akkor az eredmény 2 (mert 10 / 5 = 2)
Ügyelj arra, hogy ha a felhasználó második számnak a 0-t (nullát) adja meg,
akkor osztás nem végezhető! (A program ebben az esetben hibát generál.)
 */

import java.util.Scanner;

public class B_005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem az első számot!");
        int number1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kérem a második számot!");
        int number2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Válassz egy műveletet! (+-/*)");
        String operator = scanner.nextLine();

        System.out.println(addNumber(number1,number2,operator));
    }

    public static int addNumber(int number1, int number2, String operator) {

        switch (operator) {
            case "-" :
                System.out.println( number1 - number2);
                break;
            case "+" :
                System.out.println( number1 + number2);
                break;
            case "*" :
                System.out.println( number1 * number2);
                break;
            case "/" :
                System.out.println( number1 / number2);
                break;
        };
        return 0;
    }
}
