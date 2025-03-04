package u8t1;

public class FunWith2DArrays {
    public static int totalElements(int[][] arr) {
        int count = 0;
        for (int[] row : arr) {
            for (int num : row) {
                count++;
            }
        }
        return count;
    }

    public static void fourCorners(String[][] arr) {
        System.out.println(arr[0][0]);
        System.out.println(arr[0][arr[0].length - 1]);
        System.out.println(arr[arr.length - 1][0]);
        System.out.println(arr[arr.length - 1][arr[0].length - 1]);
    }

    public static void swapFrontAndBackRows(String[][] arr) {
        String[] temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
    }
}