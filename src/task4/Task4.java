package task4;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    /*
    Задан целочисленный массив размерности N. Есть ли среди элементов массива простые числа?
Если да, то вывести номера этих элементов.

     */
    public static void main(String[] args) {
        int N;
        int[] arr;
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the size of the array: ");
            N = sc.nextInt();
            arr = new int[N];
            Random ran = new Random();
            System.out.println("the array: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = ran.nextInt(1000) - 100;
                System.out.print(arr[i] + " ");
            }
            System.out.println("\nthe prime indexes:");
            primeNumbers(arr);
        }
    }
    static void primeNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(isPrime(arr[i])) {
                System.out.print(i + " ");
            }
        }
    }
    static  boolean isPrime(int num) {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }
}
