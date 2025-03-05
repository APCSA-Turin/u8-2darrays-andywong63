package u8t2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        traversing2DArrays();
        System.out.println("\n");
        testAverage();
        System.out.println("\n");
        testEdgeSum();
        System.out.println("\n");
        testIndexFound();
        System.out.println("\n");
        testSplit();
        System.out.println("\n");
        testInvert();
    }

    public static void traversing2DArrays() {
        /* --- PROBLEM 1 --- */
        System.out.println("PROBLEM 1:");
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};

        System.out.println("---------");
        // write code below that uses nested ENHANCED for loops
        // to print each element in nums in ROW-MAJOR order again;
        // print all the numbers in a row on the same line
        // with a space in between

        for (int[] row : nums) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // now, write code below that uses nested INDEX-BASED for loops
        // to print each element in nums in ROW-MAJOR order;
        // print all the numbers in a row on the same line
        // with a space in between

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("---------");
        // finally, write code below that uses nested for loops
        // to print each element in nums in COLUMN-MAJOR order;
        // print all the numbers in a COLUMN on the same line
        // with a space in between

        for (int i = 0; i < nums[i].length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[j][i] + " ");
            }
            System.out.println();
        }

        /* --- PROBLEM 2 --- */
        System.out.println("---------");
        System.out.println("PROBLEM 2:");

        String[][] animals = {
            {"anteater", "bird"},
            {"camel", "dog"},
            {"elephant", "giraffe"},
            {"hyena", "jackal"}
        };
    
        // write code below using a nested loop to update each element
        // in animals to its plural form, e.g. bird --> birds;
        // (no printing yet)

        for (int i = 0; i < animals.length; i++) {
            for (int j = 0; j < animals[i].length; j++) {
                animals[i][j] += "s";
            }
        }

        // next, write code below to print out the 2D
        // array in column-major order, showing each
        // animal in inside a bracketed "enclosure"
        // using "|" (like fences separating animal pens
        // in a zoo)

        for (int i = 0; i < animals[i].length; i++) {
            System.out.print("\n|");
            for (int j = 0; j < animals.length; j++) {
                System.out.print(animals[j][i] + "|");
            }
        }
        System.out.println();
    }

    public static void testAverage() {
        int[][] testArr1 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(FunWith2DArrays.average(testArr1));
        int[][] testArr2 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
        System.out.println(FunWith2DArrays.average(testArr2));
        int[][] testArr3 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
        System.out.println(FunWith2DArrays.average(testArr3));
        int[][] testArr4 = {{4}, {7}, {8}, {2}};
        System.out.println(FunWith2DArrays.average(testArr4));
        int[][] testArr5 = {{4}};
        System.out.println(FunWith2DArrays.average(testArr5));
    }

    public static void testEdgeSum() {
        int[][] numbers = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(FunWith2DArrays.edgeSum(numbers));
        int[][] numbers2 = {{1, 2, 3}, {5, 6, 7}, {9, 10, 11}, {13, 14, 15}, {18, 19, 20}};
        System.out.println(FunWith2DArrays.edgeSum(numbers2));
        int[][] numbers3 = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        System.out.println(FunWith2DArrays.edgeSum(numbers3));
        int[][] numbers4 = {{1, 2}, {5, 6}};
        System.out.println(FunWith2DArrays.edgeSum(numbers4));
    }

    public static void testIndexFound() {
        System.out.println("--------------");
        String[][] letters = {{"a", "b", "c"}, {"c", "d", "e"}};
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(letters, "c")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(letters, "a")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(letters, "e")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(letters, "g")));
        System.out.println("--------------");
        String[][] words = {{"hi", "time", "stuff", "hi"}, {"bye", "hi", "time", "up"}, {"time", "low", "time", "hi"}};
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "time")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "hi")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "up")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "cat")));
        System.out.println("--------------");

        String[][] words2 = {{"time", "up", "bye"}};
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "time")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "up")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "bye")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "cat")));
    }

    public static void testSplit() {
        System.out.println("-------test1--------");
        int[][] testArr6 = {{1, 2, 3}, {4, 5, 6}};
        int[][] t1 = FunWith2DArrays.split(testArr6, 1, 1);
        for (int[] row : t1) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("-------test2--------");
        int[][] testArr7 = {{10, 11, 12, 13}, {20, 21, 22, 23}, {30, 31, 32, 33}};
        int[][] t2 = FunWith2DArrays.split(testArr7, 2, 1);
        for (int[] row : t2) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("-------test3--------");
        int[][] testArr8 = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24}
        };
        int[][] t3 = FunWith2DArrays.split(testArr8, 3, 2);
        for (int[] row : t3) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("-------test4--------");
        int[][] t4 = FunWith2DArrays.split(testArr8, 2, 5);
        for (int[] row : t4) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("-------test5--------");
        int[][] t8 = FunWith2DArrays.split(testArr8, 0, 4);
        for (int[] row : t8) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("-------test6--------");
        int[][] t9 = FunWith2DArrays.split(testArr8, 0, 0);
        for (int[] row : t9) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("-------test7--------");
        int[][] t5 = FunWith2DArrays.split(testArr8, 3, 5);
        for (int[] row : t5) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("-------test8--------");
        int[][] t10 = FunWith2DArrays.split(testArr8, 3, 0);
        for (int[] row : t10) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("-------test9--------");
        int[][] t6 = FunWith2DArrays.split(testArr8, 4, 2);
        for (int[] row : t6) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("-------test10-------");
        int[][] t7 = FunWith2DArrays.split(testArr8, 2, 6);
        for (int[] row : t7) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void testInvert() {
        System.out.println("---invert test1---");
        int[][] test1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] ts1 = FunWith2DArrays.invert(test1);
        for (int[] row : ts1) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("orig array not modified:");
        for (int[] row : test1) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("\n---invert test2---");
        int[][] test2 = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24}
        };
        int[][] ts2 = FunWith2DArrays.invert(test2);
        for (int[] row : ts2) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("\n---invert test3---");
        int[][] test3 = {{10}};
        int[][] ts3 = FunWith2DArrays.invert(test3);
        for (int[] row : ts3) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}