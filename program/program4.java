
package program4;

import java.util.Scanner;


public class program4 {

    
    public static void main(String[] args) {
        int a, b, nod1, nok1;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        nod1 = nod(a, b);
        System.out.println("НОД = " + nod1);
        nok1 = nok(a, b);
        System.out.println("НОK = " + nok1);
    }
    public static int nod(int a, int b){
        if(b == 0)
            return a;
            else
         return nod(b, a % b);
    }
    public static int nok(int a, int b){
        return a * b / nod(a, b);
    }
}
