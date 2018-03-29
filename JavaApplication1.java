/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Пользователь
 */
import java.util.Scanner;
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
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
