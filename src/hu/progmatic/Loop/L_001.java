package hu.progmatic.Loop;

/*
Add össze a számokat 1 és 10 között (beleértve az 1-et és a 10-et is).
Használj a megoldáshoz ciklust!

 */

public class L_001 {
    public static void main(String[] args) {

        System.out.println(addNumber(10,0));
    }

  public static int addNumber(int number,int sum){

         for (int i = 1; i<=number; i++){
             sum += i;
         }
        return sum;
  }
}
