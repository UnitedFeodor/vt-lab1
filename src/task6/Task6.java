package task6;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int size = 10;
        Random ran = new Random();
        var arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(11) - 0;
        }

        var matrix = ArrayToMatrix.arrToMat(arr);
        for (int[] ints : matrix) {
            for (int number : ints) {
                System.out.print(number + " ");

            }
            System.out.println();
        }
    }
}
