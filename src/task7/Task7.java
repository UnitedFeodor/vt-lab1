package task7;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int size = 10;
        Random ran = new Random();
        var arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(11) - 0;
            System.out.print(arr[i] + " ");
        }
        ShellSort.sort(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
