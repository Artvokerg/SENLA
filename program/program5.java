
package program5;

import java.util.Scanner;


public class program5 {

    
    public static void main(String[] args) {
        int k = 0;
        String s;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        System.out.println(s);
        int l = s.length();
        for(int i = 0; i<l; i++, l--){
            char a=s.charAt(i);
            char b=s.charAt(l-1);
            if(a != b){
                k = 1;
                break;
            }
        }
        if(k == 0)
            System.out.println("Палиндром");
        else
            System.out.println("Не палиндром");
    }
    
}
