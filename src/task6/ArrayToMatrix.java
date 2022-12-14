package task6;

public class ArrayToMatrix {
    public static int[][] arrToMat(int[] array) {
        int offset = 0;
        int[][] result = new int[array.length][];

        for (int i = 0; i < array.length; i++) {
            result[i] = new int[array.length];
            for (int j = 0; j < array.length; j++) {
                var index = (j + offset) % array.length;
                result[i][j] = array[index];
            }
            offset++;
        }

        return result;

    }
}
