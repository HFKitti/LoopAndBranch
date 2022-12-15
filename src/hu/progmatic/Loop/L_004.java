package hu.progmatic.Loop;

/*
Módosítsd az előző feladat megoldását úgy, hogy megkérdezed a felhasználótól:
a páros vagy a páratlan számokat add-e össze.
A felhasználó válaszának megfelelően add össze a kért számokat,
és az eredményt írd ki a képernyőre!
 */

import java.util.Scanner;

public class L_004 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy számot!");
        int z = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Páratlan (x) vagy a Páros(y) számokat adjuk össze?");
        String choose = scanner.nextLine();

        System.out.println(addNumber3(z, 0));
    }

    public static int addNumber3(int number, int sum){

       String choose = "";

       if(choose.equalsIgnoreCase("x")){
           for(int i=0; i<=number; i+=2){
            sum+=i;
        }return sum;
    }else{
           for(int i=1; i<=number; i+=2){
               sum+=i;
           }return sum;
       }
}}
