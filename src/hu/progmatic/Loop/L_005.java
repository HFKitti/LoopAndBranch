package hu.progmatic.Loop;

/*
Adott az alábbi két szám:
int base = 5;
int exponent = 3;
Emeld a base nevű változó értékét exponent kitevőre (azaz hatványozd)!
A megoldáshoz használj ciklust, és ne a Math.pow()-ot!
A megoldásod nem negatív egész számokra működjön mindenképpen!
Az eredménynek 125-nek kell lennie, mert 53 = 5 * 5 * 5 = 125.
Teszteld a megoldásodat úgy is, hogy az exponent értéke 0! Ebben az esetben az eredmény 1, mert 50 = 1
 */

public class L_005 {
    public static void main(String[] args) {
        int result = addNumber5(5,3);
        System.out.println(result);
    }

    public static int addNumber5(int base, int exponent){

        int result = 1;

        for(int i =1; i<= exponent; i++){
            result*=base;
        }
        return result;
    }
}
