package u8t2.lab2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        testSumForRow();
        testSumForColumn();
        testReplaceEvensWithZero();
        testFindStringsOfLength();
        testClassAverage();
        testConsecutive();
        testMagicSquare();
    }

    private static void testSumForRow() {
        System.out.println("Test sumForRow");
        int[][] testArr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {4, 6, 8, 3, 5}};
        System.out.println(Algorithm2DArrays.sumForRow(testArr, 0));
        System.out.println(Algorithm2DArrays.sumForRow(testArr, 1));
        System.out.println(Algorithm2DArrays.sumForRow(testArr, 2));
        System.out.println();
        int[][] testArr2 = {{3, 4, 5}, {8, 9, 10}, {8, 3, 5}, {1, 2, 3}};
        System.out.println(Algorithm2DArrays.sumForRow(testArr2, 0));
        System.out.println(Algorithm2DArrays.sumForRow(testArr2, 1));
        System.out.println(Algorithm2DArrays.sumForRow(testArr2, 2));
        System.out.println(Algorithm2DArrays.sumForRow(testArr2, 3));
        System.out.println("\n");
    }

    private static void testSumForColumn() {
        System.out.println("Test sumForColumn");
        int[][] testArr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {4, 6, 8, 3, 5}};
        System.out.println(Algorithm2DArrays.sumForColumn(testArr, 0));
        System.out.println(Algorithm2DArrays.sumForColumn(testArr, 1));
        System.out.println(Algorithm2DArrays.sumForColumn(testArr, 2));
        System.out.println(Algorithm2DArrays.sumForColumn(testArr, 3));
        System.out.println(Algorithm2DArrays.sumForColumn(testArr, 4));
        System.out.println();
        int[][] testArr2 = {{3, 4, 5}, {8, 9, 10}, {8, 3, 5}, {1, 2, 3}};
        System.out.println(Algorithm2DArrays.sumForColumn(testArr2, 0));
        System.out.println(Algorithm2DArrays.sumForColumn(testArr2, 1));
        System.out.println(Algorithm2DArrays.sumForColumn(testArr2, 2));        
        System.out.println("\n");
    }

    private static void testReplaceEvensWithZero() {
        System.out.println("Test replaceEvensWithZero");
        int[][] testArr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {4, 6, 8, 3, 5}};
        int changes = Algorithm2DArrays.replaceEvensWithZero(testArr);
        System.out.println("Number of changes: " + changes);
        System.out.println("2D Array modified:");
        for (int[] row : testArr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        int[][] testArr2 = {{2, 2, 4, 4}, {6, 8, 8, 10}, {4, 6, 8, 2}, {4, 2, 4, 6}};
        changes = Algorithm2DArrays.replaceEvensWithZero(testArr2);
        System.out.println("\nNumber of changes: " + changes);
        System.out.println("2D Array modified:");
        for (int[] row : testArr2) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        int[][] testArr3 = {{1, 3, 5}, {7, 5, 9}};
        changes = Algorithm2DArrays.replaceEvensWithZero(testArr3);
        System.out.println("\nNumber of changes: " + changes);
        System.out.println("2D Array not modified:");
        for (int[] row : testArr3) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    private static void testFindStringsOfLength() {
        System.out.println("Test findStringsOfLength");
        String[][] words = {{"hi", "bye", "stuff", "goo"}, {"time", "up", "you", "map"}, {"good", "low", "bow", "mom"}};
        ArrayList<String> returnedList = Algorithm2DArrays.findStringsOfLength(words, 3);
        System.out.println(returnedList);
        ArrayList<String> returnedList2 = Algorithm2DArrays.findStringsOfLength(words, 4);
        System.out.println(returnedList2);
        ArrayList<String> returnedList3 = Algorithm2DArrays.findStringsOfLength(words, 5);
        System.out.println(returnedList3);
        ArrayList<String> returnedList4 = Algorithm2DArrays.findStringsOfLength(words, 6);
        System.out.println(returnedList4);
        System.out.println();
        String[][] words2 = {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}, {"j", "k", "l"}};
        returnedList = Algorithm2DArrays.findStringsOfLength(words2, 1);
        System.out.println(returnedList);
        returnedList2 = Algorithm2DArrays.findStringsOfLength(words2, 2);
        System.out.println(returnedList2);
        System.out.println("\n");
    }

    private static void testClassAverage() {
        System.out.println("Test classAverage");
        Student s1 = new Student("Abby", 95);
        Student s2 = new Student("Barb", 98);
        Student s3 = new Student("Cole", 91);
        Student s4 = new Student("Dave", 92);
        Student s5 = new Student("Ellie", 98);
        Student s6 = new Student("Frank", 87);
        Student s7 = new Student("George", 93);
        Student s8 = new Student("Jim", 92);
        Student s9 = new Student("Kara", 95);
        Student s10 = new Student("Lenny", 98);
        Student s11 = new Student("Mona", 100);
        Student s12 = new Student("Nancy", 99);
        Student[][] chart = {{s1, s2, s3}, {s4, s5, s6}, {s7, s8, s9}, {s10, s11, s12}};
        double avg = Algorithm2DArrays.classAverage(chart);
        System.out.println(avg);
        Student[][] chart2 = {{s1, s2}, {s4, s5}, {s8, s9}};
        avg = Algorithm2DArrays.classAverage(chart2);
        System.out.println(avg);
        Student[][] chart3 = {{s6}};
        avg = Algorithm2DArrays.classAverage(chart3);
        System.out.println(avg);
        System.out.println("\n");
    }

    private static void testConsecutive() {
        System.out.println("Test consecutive");
        int[][] testArr1 = { // true
            {1, 2, 3, 4},
            {1, 3, 4, 5},
            {3, 4, 5, 6}
        };
        int[][] testArr2 = { // true
            {1, 2, 3, 4},
            {2, 3, 4, 6},
            {3, 4, 5, 6}
        };
        int[][] testArr3 = { // true
            {7, 7, 3, 4},
            {2, 3, 4, 5},
            {3, 4, 5, 6}
        };
        int[][] testArr4 = { // true
            {1, 2, 3, 4},
            {2, 3, 4, 5},
            {3, 4, 2, 2}
        };
        int[][] testArr5 = { // true
            {1, 2, 3, 4, 5},
            {2, 3, 9, 5, 6},
            {3, 4, 9, 6, 7},
            {4, 5, 6, 7, 8}
        };
        int[][] testArr6 = { // true
            {1, 2, 3, 4, 5},
            {2, 3, 4, 5, 6},
            {3, 4, 1, 1, 7},
            {4, 5, 6, 7, 8}
        };
        int[][] testArr7 = { // true
            {1, 2, 3, 4, 5},
            {2, 3, 4, 5, 6},
            {3, 4, 5, 6, 8},
            {4, 5, 6, 7, 8}
        };
        int[][] testArr8 = { // true
            {1, 2, 3, 4, 5},
            {2, 3, 4, 5, 6},
            {3, 4, 5, 6, 7},
            {4, 5, 6, 8, 8}
        };
        int[][] testArr9 = { // false
            {1, 2, 3, 4},
            {2, 3, 4, 5},
            {3, 4, 5, 6}
        };
        int[][] testArr10 = { // false
            {1, 2, 3, 4, 5},
            {2, 3, 4, 5, 6},
            {3, 4, 5, 6, 7},
            {4, 5, 6, 7, 8}
        };
        boolean test1 = Algorithm2DArrays.consecutive(testArr1);
        System.out.println(test1);
        boolean test2 = Algorithm2DArrays.consecutive(testArr2);
        System.out.println(test2);
        boolean test3 = Algorithm2DArrays.consecutive(testArr3);
        System.out.println(test3);
        boolean test4 = Algorithm2DArrays.consecutive(testArr4);
        System.out.println(test4);
        boolean test5 = Algorithm2DArrays.consecutive(testArr5);
        System.out.println(test5);
        boolean test6 = Algorithm2DArrays.consecutive(testArr6);
        System.out.println(test6);
        boolean test7 = Algorithm2DArrays.consecutive(testArr7);
        System.out.println(test7);
        boolean test8 = Algorithm2DArrays.consecutive(testArr8);
        System.out.println(test8);
        boolean test9 = Algorithm2DArrays.consecutive(testArr9);
        System.out.println(test9);
        boolean test10 = Algorithm2DArrays.consecutive(testArr10);
        System.out.println(test10);
        if (test1 && test2 && test3 && test4 && test5 && test6 && test7 && test8 && !test9 && !test10) {
            System.out.println("\n--- ALL TESTS PASS! ---");
        } else {
            System.out.println("\n!!!!!! TEST FAIL!!!!!!!");
        }
        System.out.println("\n");
    }

    private static void testMagicSquare() {
        System.out.println("Test magicSquare");
        int[][] testArr1 = {{7, 2, 3}, {0, 4, 8}, {5, 6, 1}};
        int[][] testArr2 = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
        int[][] testArr3 = {{2, 16, 13, 3}, {11, 5, 8, 10}, {7, 9, 12, 6}, {14, 4, 1, 15}};
        int[][] testArr4 = {{1, 23, 16, 4, 21}, {15, 14, 7, 18, 11}, {24, 17, 13, 9, 2}, {20, 8, 19, 12, 6}, {5, 3, 10, 22, 25}};
        int[][] testArr5 = {{2, 16, 13, 3}, {11, 5, 8, 10}, {7, 9, 12, 15}, {14, 4, 1, 6}};
        int[][] testArr6 = {{2, 16, 13, 3}, {11, 5, 8, 10}, {7, 9, 12, 6}, {14, 4, 1, 8}};
        int[][] testArr7 = {{7, 3, 2}, {0, 4, 8}, {5, 6, 1}};
        int[][] testArr8 = {{3, 3, 3}, {3, 3, 3}, {3, 3, 3}};
        int[][] testArr9 = {{1, 2, 3}, {2, 3, 1}, {3, 1, 2}};
        int[][] testArr10 = {{0, 4, 8}, {7, 2, 3}, {5, 6, 1}};
        int[][] testArr11 = {{1, 23, 16, 4, 21}, {15, 14, 7, 18, 11}, {24, 26, 13, 9, 2}, {20, 8, 19, 12, 6}, {5, -6, 10, 22, 25}};
        int[][] testArr12 = {{1, 23, 16, 4, 21}, {15, 14, 7, 18, 11}, {24, 27, 13, -1, 2}, {20, 8, 19, 12, 6}, {5, 3, 10, 22, 25}};;
        int[][] testArr13 = {{1, 2, 9}, {4, 15, -7}, {7, -5, 10}};
        int[][] testArr14 = {{2, 7, 6}, {9, 5, 1}, {4, 3, 5}};

        boolean test1 = Algorithm2DArrays.magicSquare(testArr1);
        System.out.println(test1);
        boolean test2 = Algorithm2DArrays.magicSquare(testArr2);
        System.out.println(test2);
        boolean test3 = Algorithm2DArrays.magicSquare(testArr3);
        System.out.println(test3);
        boolean test4 = Algorithm2DArrays.magicSquare(testArr4);
        System.out.println(test4);
        boolean test5 = Algorithm2DArrays.magicSquare(testArr5);
        System.out.println(test5);
        boolean test6 = Algorithm2DArrays.magicSquare(testArr6);
        System.out.println(test6);
        boolean test7 = Algorithm2DArrays.magicSquare(testArr7);
        System.out.println(test7);
        boolean test8 = Algorithm2DArrays.magicSquare(testArr8);
        System.out.println(test8);
        boolean test9 = Algorithm2DArrays.magicSquare(testArr9);
        System.out.println(test9);
        boolean test10 = Algorithm2DArrays.magicSquare(testArr10);
        System.out.println(test10);
        boolean test11 = Algorithm2DArrays.magicSquare(testArr11);
        System.out.println(test11);
        boolean test12 = Algorithm2DArrays.magicSquare(testArr12);
        System.out.println(test12);
        boolean test13 = Algorithm2DArrays.magicSquare(testArr13);
        System.out.println(test13);
        boolean test14 = Algorithm2DArrays.magicSquare(testArr14);
        System.out.println(test14);
        if (test1 && test2 && test3 && test4 && !test5 && !test6 && !test7 && !test8 && !test9 && !test10 && !test11 && !test12 && !test13 && !test14) {
            System.out.println("\n--- ALL TESTS PASS! ---");
        } else {
            System.out.println("\n!!!!!! TEST FAIL!!!!!!!");
        }
        System.out.println("\n");
    }
}