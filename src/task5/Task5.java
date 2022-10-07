package task5;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    /*
    Дана целочисленная таблица А[n]. Найти наименьшее число K элементов, которые можно
выкинуть из данной последовательности, так чтобы осталась возрастающая
подпоследовательность.

        5 4 2 3 5 6 7 4 8
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
                arr[i] = ran.nextInt(11) - 0;
                System.out.print(arr[i] + " ");
            }
            System.out.println("\n amount to delete for inc sequence is " + (arr.length-LIS.longestIncreasingSubsequenceLength(arr)));
        }
    }

}
