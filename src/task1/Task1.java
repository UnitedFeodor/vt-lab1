package task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        double x,y,res;
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("enter x: ");
            x = sc.nextDouble();
            System.out.println("enter y: ");
            y = sc.nextDouble();
            res = (1 + Math.sin(x+y)*Math.sin(x+y)) / (2+Math.abs(x- ((2*x)/(1+x*x*y*y))))+x;
            System.out.println("res = " + res);
        }
    }
}
