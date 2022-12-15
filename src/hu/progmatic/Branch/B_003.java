package hu.progmatic.Branch;
/*
Kérd be a felhasználó nemét (lehetséges értékek: no/ffi), és a nemének megfelelően üdvözöld őt!
“no” esetében az üdvözlés: “Kezicsókolom!”
“ffi” esetében az üdvözlés: “Jó napot kívánok!”
ha mást ír be a felhasználó, akkor az üdvözlés: “Üdv!”

 */

import java.util.Scanner;

public class B_003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Milyen nemű Ön? (no/ffi");
        String gender = scanner.nextLine();

        System.out.println(sayHi(gender));
    }

    public static String sayHi (String gender){

        if(gender.equalsIgnoreCase("no")){
            return "Kezicsókolom";
        }else if (gender.equalsIgnoreCase("ffi")){
            return "Jó napot kívánok!";
        }else {
            return "Üdv!";
        }
    }



}
