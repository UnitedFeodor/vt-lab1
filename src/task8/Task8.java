package task8;

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        int size1 = 10;
        int size2 = 15;
        Random ran = new Random();
        var arr1 = new int[size1];
        var arr2 = new int[size2];
        System.out.println("sequence 1:");
        System.out.print(arr1[0] + " ");
        for (int i = 1; i < arr1.length; i++) {
            arr1[i] = ran.nextInt(11) + arr1[i-1];
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\nsequence 2:");
        System.out.print(arr2[0] + " ");
        for (int i = 1; i < arr2.length; i++) {
            arr2[i] = ran.nextInt(11) + arr2[i-1];
            System.out.print(arr2[i] + " ");
        }




        int[] newSequence = Sequence.mergeArrays(arr1, arr2);
        System.out.println("\nnew sequence:");
        for (int num : newSequence) {
            System.out.print(num + " ");
        }
    }




}
