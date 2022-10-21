package task6;

import java.util.Arrays;

public class task6 {
    public static void main(String[] args) {
        buildMatrix(createArr());
    }

    private static double[] createArr() {
        double[] arr = new double[]{2.3, 268, 2.35, 5.656, 3.241, 7, 4.36, 55.3, 1.35, 7.77};
        return arr;
    }

    private static void buildMatrix(double[] arr){
        double[][] matrix = new double[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            matrix[i] = arr;
            double elementToShift = arr[0];
            arr = Arrays.copyOfRange(arr, 1, arr.length + 1);
            arr[arr.length - 1] = elementToShift;
        }
        Arrays.stream(matrix).map(Arrays::toString).forEach(System.out::println);
    }
}
