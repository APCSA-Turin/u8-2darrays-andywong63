package u8t2.lab2;

import java.util.ArrayList;

public class Algorithm2DArrays {
    /**
     * Return the sum of all elements of arr that are in the one particular row,
     * specified by the row parameter
     *
     * PRECONDITION: 0 <= row < arr.length (i.e. row is guaranteed to be valid)
     *
     * @param arr 2D array of ints
     * @param row the row to add up
     * @return the sum of all elements in row
     * 
     */
    public static int sumForRow(int[][] arr, int row) {
        int total = 0;
        for (int num : arr[row]) {
            total += num;
        }
        return total;
    }

    /**
     * Return the sum of all elements of arr that are in the one particular column
     *
     * PRECONDITION: 0 <= col < arr[0].length (i.e. col is valid)
     *
     * @param arr 2D array of ints
     * @param col the column to add up
     * @return the sum of all elements in column
     */
    public static int sumForColumn(int[][] arr, int col) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i][col];
        }
        return total;
    }

    /**
     * Replaces all even integers in arr with 0; all odd integers are unchanged.
     * It then returns the number of changes that were made.
     *
     * POSTCONDITION: this method modifies the original 2D array referenced by arr
     *
     * @param arr 2D array of ints
     * @return the number of changes made
     */
    public static int replaceEvensWithZero(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    arr[i][j] = 0;
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Searches through the 2D array wordChart and finds all strings with
     * length len; these strings are added to an ArrayList and returned.
     * If no strings have that length, return an empty ArrayList
     *
     * @param wordChart 2D array of Strings
     * @parram len the length of strings to search for
     * @return an ArrayList containing all strings in wordChart with length len
     */
    public static ArrayList<String> findStringsOfLength(String[][] wordChart, int len) {
        ArrayList<String> result = new ArrayList<>();
        for (String[] row : wordChart) {
            for (String word : row) {
                if (word.length() == len) {
                    result.add(word);
                }
            }
        }
        return result;
    }

    /**
     * calculates and returns the average class grade as a double for a
     * all Students in the 2D array seatingChart
     *
     * PRECONDITION: seatingChart contains at least one element with at least
     * one student (i.e. no need to worry about division by 0)
     * 
     * @param seatingChart 2D array of Student objects
     * @return the average grade of all Students in seatingChart, as a double
     */
    public static double classAverage(Student[][] seatingChart) {
        double total = 0;
        int count = 0;
        for (Student[] row : seatingChart) {
            for (Student student : row) {
                total += student.getGrade();
                count++;
            }
        }
        return total / count;
    }

    /**
     * Returns true if any two consecutive elements (2 of the same elements next to
     * each other), horizontally or vertically, are equal, or false otherwise.
     *
     * @param arr 2D array of ints
     */
    public static boolean consecutive(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j < arr[i].length - 1) {
                    // If not the last column, check the value to the right
                    if (arr[i][j] == arr[i][j + 1])
                        return true;
                }
                if (i < arr.length - 1) {
                    // If not the last row, check the value below
                    if (arr[i][j] == arr[i + 1][j])
                        return true;
                }
            }
        }
        return false;
    }

    /**
     * Check if a value is a magic square (all elements are unique, and all rows,
     * columns, and diagonals add up to the same total)
     * 
     * PRECONDITION: arr is a square 2D array with the same number of rows and
     * columns
     * 
     * @param arr 2D array of ints
     */
    public static boolean magicSquare(int[][] arr) {
        ArrayList<Integer> valuesUsed = new ArrayList<>();
        int magicSum = -1;
        for (int i = 0; i < arr.length; i++) {
            // Check if all values are unique, and check row totals
            int total = 0;
            for (int j = 0; j < arr[i].length; j++) {
                // Check if value is unique
                for (int num : valuesUsed) {
                    if (num == arr[i][j]) {
                        return false;
                    }
                }
                valuesUsed.add(arr[i][j]);
                total += arr[i][j];
            }
            if (i == 0) {
                // First row, use this total as magic sum
                magicSum = total;
            } else if (total != magicSum) {
                // Total is not equal to magic sum
                return false;
            }
        }
        for (int i = 0; i < arr[0].length; i++) {
            // Check column totals
            int total = 0;
            for (int j = 0; j < arr.length; j++) {
                // No need to check for duplicate values, already checked all of them in previous loop
                total += arr[j][i];
            }
            if (total != magicSum) {
                return false;
            }
        }

        // Check diagonal totals
        int topLeftBottomRightTotal = 0;
        int topRightBottomLeftTotal = 0;
        for (int i = 0; i < arr.length; i++) {
            topLeftBottomRightTotal += arr[i][i];
            topRightBottomLeftTotal += arr[i][arr.length - i - 1];
        }
        if (topLeftBottomRightTotal != magicSum || topRightBottomLeftTotal != magicSum) {
            return false;
        }

        return true;
    }
}