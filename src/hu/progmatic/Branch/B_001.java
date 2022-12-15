package hu.progmatic.Branch;

/*
Kérj be a felhasználótól egy számot, és állapítsd meg,
hogy páros-e vagy páratlan az a szám!
Írd ki a képernyőre az eredményt.
 */

import java.util.Scanner;

public class B_001 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek egy számot!");

        System.out.println(pozitivOrNot(scanner.nextInt()));

    }

    public static String pozitivOrNot(int number) {
        if (number % 2 == 0) {
            return "Ez a szám pozitív!";
        } else {
            return "Ez a szám negatív!";
        }
    }
}
