package hu.progmatic.Branch;

/*
Kérj be a felhasználótól két számot, és állapítsd meg, hogy a második szám osztója-e az elsőnek!
Egy szám akkor osztója egy másiknak, ha maradék nélkül osztható vele.
Ügyelj arra, hogy ha a felhasználó második számnak a 0-t (nullát) adja meg, akkor osztás nem végezhető!
(A program ebben az esetben hibát generál.)
 */

import java.util.Scanner;

public class B_002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem az első számot!");
        int number1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kérem az második számot!");
        int number2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println(divisor(number1,number2));

    }

    public static String divisor(int number1, int number2){

        if(number2 == 0){
            return "Nullával nem osztunk!";
        }else if(number1%number2 == 0){
            return "A második szám (" +number2+ ") osztója az első számnak (" +number1+ ").";
        }else{
            return "A második szám (" +number2+ ") nem osztója az első számnak (" +number1+ ").";
        }
    }

}
