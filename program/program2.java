
package program2;

import java.util.Scanner;
public class program2 {

    public static void main(String[] args) {
        int n, b;
        System.out.println("Введите число N");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(int i=1; i<n; i++){
        b = los(i);
        if(b > n)
            break;
        System.out.println(i + " = "+ b);
        }
    }
    public static int los(int n){
        if(n == 1 || n==2)
            return 1;
        else
            return los(n-1)+los(n-2);
    }
    
}
