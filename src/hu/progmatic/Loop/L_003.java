package hu.progmatic.Loop;

/*
Kérj be a felhasználótól egy pozitív egész számot, és add össze a páros számokat 1-től eddig a számig!
Például, ha a felhasználó száma 11, akkor az eredmény: 2 + 4 + 6 + 8 + 10 = 30
 */

import java.util.Scanner;

public class L_003 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy számot!");

        System.out.println(addNumber3(scanner.nextInt(), 0));
    }

    public static int addNumber3(int number, int sum){

        for(int i=0; i<=number; i+=2){
            sum+=i;
        }
        return sum;
    }
}
