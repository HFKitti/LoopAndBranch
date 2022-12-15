package hu.progmatic.Loop;

/*
Kérj be a felhasználótól egy pozitív egész számot,
és ezúttal 1-től eddig a számig add össze a számokat!
 */

import java.util.Scanner;

public class L_002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek egy számot!");
        System.out.println(addNumber2(scanner.nextInt(), 0));

    }

    public static int addNumber2(int number, int sum){

        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        return sum;
    }



}
