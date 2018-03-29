
package program6;


import java.util.Scanner;
public class program6 {
    public static void main(String[] args) {
        String s;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        System.out.println(s);
        
        
       for(int i = 0; i<s.length(); i++){
           char a=s.charAt(i);
           if(a-48<=9 && a-48>=0){//по unicode
            System.out.println(a);
            String c = s.substring(i+1, s.length());
            s = s.substring(0, i);
            s = s.concat(c);
            i--;
           }
       }
        System.out.println(s);
    }
    
}
