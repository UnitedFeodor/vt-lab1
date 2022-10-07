package task3;

import java.util.Scanner;

public class Task3 {
    /*
    Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
представить в виде таблицы, первый столбец которой – значения аргумента, второй -
соответствующие значения функции.
F(x) = tg(x)

     */
    public static void main(String[] args) {
        double a,b,h;
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("enter a: ");
            a = sc.nextDouble();
            System.out.println("enter b: ");
            b = sc.nextDouble();
            System.out.println("enter h: ");
            h = sc.nextDouble();
            calculateTg(a,b,h);
        }
    }
    static void calculateTg(double a, double b, double h) {
        int size = (int)Math.floor(Math.abs(b-a)/h)+1;
        double[] args = new double[size];
        double[] funcs = new double[size];
        double cur = a;
        int i = 0;
        while(cur<=b) {
            args[i] = cur;
            funcs[i] = Math.tan(cur);
            i++;
            cur+=h;
        }
        System.out.println("arguments:");
        for (int j = 0; j < size; j++) {
            System.out.print(args[j] + " ");

        }

        System.out.println("\n\nresults:");
        for (int j = 0; j < size; j++) {
            System.out.print(funcs[j] + " ");

        }

    }
}
