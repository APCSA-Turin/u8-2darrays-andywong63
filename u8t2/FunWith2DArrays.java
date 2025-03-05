package u8t2;

public class FunWith2DArrays {
    public static double average(int[][] arr) {
        double count = 0;
        int total = 0;
        for (int[] row : arr) {
            for (int num : row) {
                total += num;
                count++;
            }
        }
        return total / count;
    }

    public static int edgeSum(int[][] arr) {
        int lastRow = arr.length - 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || i == lastRow) {
                for (int j = 0; j < arr[i].length; j++) {
                    sum += arr[i][j];
                }
            } else {
                sum += arr[i][0];
                sum += arr[i][arr[i].length - 1];
            }
        }
        return sum;
    }

    public static int[] indexFound(String[][] arr, String target) {
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i].equals(target)) {
                    int[] result = {j, i};
                    return result;
                };
            }
        }
        int[] result = {-1, -1};
        return result;
    }

    public static int[][] split(int[][] arr, int row, int column) {
        if (row >= arr.length || column >= arr[0].length) return new int[0][0];
        int[][] newArr = new int[row + 1][column + 1];
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= column; j++) {
                newArr[i][j] = arr[i][j];
            }
        }
        return newArr;
    }

    public static int[][] invert(int[][] arr) {
        int[][] newArr = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                newArr[i][j] = arr[j][i];
            }
        }
        return newArr;
    }
}