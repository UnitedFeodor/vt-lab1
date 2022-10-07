package task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        *
        * x: -4 to 4 with y: 0 to 5
        * x: -6 to 6 with y: -3 to 0
        *
         */
        double x,y;
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("enter x: ");
            x = sc.nextDouble();
            System.out.println("enter y: ");
            y = sc.nextDouble();
            System.out.println("res = " + isInArea(x,y));
        }
    }
    static boolean isInArea(double x, double y) {
        if ((y>=0 && y<=5 && x>=-4 && x<=4) || (y>=-3 && y<=0 && x>=-6 && x<=6)) {
            return true;
        }
        return false;
    }

}
