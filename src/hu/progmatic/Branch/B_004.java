package hu.progmatic.Branch;

/*
Kérd be a felhasználó nemét (lehetséges értékek: no/ffi) és a testmagasságát centiméterben,
majd állapítsd meg, hogy a felhasználó az átlagnál alacsonyabb, magasabb, vagy éppen átlagos.
Írd ki a képernyőre az eredményt.
A férfiak átlagmagassága 176 cm, a nőké pedig 164 cm.

 */

import java.util.Scanner;

public class B_004 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a nemét. (no/ffi)");
        String gender = scanner.nextLine();

        System.out.println("Kérem a magasságát!");
        int height = scanner.nextInt();
        scanner.nextLine();

        System.out.println(averageHeight(gender,height));
    }

    public static String averageHeight(String gender, int height) {

        if (gender.equalsIgnoreCase("no")) {
            if (height < 164) {
                return "Ön alacsonyabb az átlagnál!";
            } else if (height > 164) {
                return "Ön magasabb az átlagnál!";
            } else {
                return "Önnek átlag magassága van!";
            }
        } else if (gender.equalsIgnoreCase("ffi")) {
            if (height < 176) {
                return "Ön alacsonyabb az átlagnál!";
            } else if (height > 176) {
                return "Ön magasabb az átlagnál!";
            } else {
                return "Önnek átlag magassága van!";
            }
        }else{
            return "Válassz a két nem közül, kérlek, ez csak egy feladat :)";
        }

    }
}
