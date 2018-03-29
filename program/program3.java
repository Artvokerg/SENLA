
package program3;

import java.util.Scanner;


public class program3 {

    
    public static void main(String[] args) {
        double ax1, ay1, ax2, ay2, bx1, by1, by2, bx2;
        System.out.println("Введите координаты точек:");
        Scanner in = new Scanner(System.in);
        ax1 = in.nextDouble();
        ay1 = in.nextDouble();
        ax2 = in.nextDouble();
        ay2 = in.nextDouble();
        bx1 = in.nextDouble();
        by1 = in.nextDouble();
        bx2 = in.nextDouble();
        by2 = in.nextDouble();
        
        if(doom(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2)== true)
            System.out.println("Линии пересекаются.");
        else
            System.out.println("Линии не пересекаются.");
    }
    public static boolean doom(double ax1,double ay1,double ax2,
                            double ay2,double bx1,double by1,
                            double bx2,double by2){
        double r,t,y,u;
        r = (bx2-bx1)*(ay1-by1)-(by2-by1)*(ax1-bx1);
        t = (bx2-bx1)*(ay2-by1)-(by2-by1)*(ax2-bx1);
        y = (ax2-ax1)*(by1-ay1)-(ay2-ay1)*(bx1-ax1);
        u = (ax2-ax1)*(by2-ay1)-(ay2-ay1)*(bx2-ax1);
        return (r*t<0) && (y*u<0);
    }
    
}
