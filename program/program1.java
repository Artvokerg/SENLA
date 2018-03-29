
package program1;


import java.util.Scanner;
public class program1 {

    public static void main(String[] args) {
        int a, b;
         Scanner in = new Scanner(System.in);
         System.out.println("Введите 2 числа");
         a = in.nextInt();
         b = in.nextInt();
        pol(a, b);
    }
    public static void pol(int a, int b){
        for(int i = a; i<b; i++){
            for(int k = 2; k<=i; k++){
                if((i % k ==0) && (k!=i))
                    break;
                if(k == i)
                  System.out.println(i);   
            }
        }
            
    }
}
