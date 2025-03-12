package frq;

public class ItemGridTester {
    public static void main(String[] args) {
        Item item0_0 = new Item("acorn", 7);
        Item item0_1 = new Item("book", 10);
        Item item0_2 = new Item("carrot", 8);
        Item item0_3 = new Item("desk", 9);
        Item item1_0 = new Item("egg", 5);
        Item item1_1 = new Item("flag", 8);
        Item item1_2 = new Item("globe", 8);
        Item item1_3 = new Item("harp", 9);
        Item item2_0 = new Item("island", 7);
        Item item2_1 = new Item("jacket", 19);
        Item item2_2 = new Item("kale", 8);
        Item item2_3 = new Item("lunch", 16);

        Item[][] gridOfItems = {{item0_0, item0_1, item0_2, item0_3},
                {item1_0, item1_1, item1_2, item1_3},
                {item2_0, item2_1, item2_2, item2_3}};

        ItemGrid ig = new ItemGrid(gridOfItems);

        System.out.println("\n---- TESTING PART A: findAverage ----");
        double actualAverage = ig.findAverage();
        double expectedAverage = 9.5;
        System.out.println("findAverage() should return " + expectedAverage + " and your method returns: " + actualAverage);
        if (actualAverage == expectedAverage) {
            System.out.println("--> PASS!");
        } else {
            System.out.println("--> !!!!!!!!FAIL!!!!!!!!");
        }

        System.out.println("\n---- TESTING PART B: mostValuableNeighbor ----");
        String test1 = ig.mostValuableNeighbor(0, 0);
        String test2 = ig.mostValuableNeighbor(0, 1);
        String test3 = ig.mostValuableNeighbor(0, 2);
        String test4 = ig.mostValuableNeighbor(0, 3);
        String test5 = ig.mostValuableNeighbor(1, 0);
        String test6 = ig.mostValuableNeighbor(1, 1);
        String test7 = ig.mostValuableNeighbor(1, 2);
        String test8 = ig.mostValuableNeighbor(1, 3);
        String test9 = ig.mostValuableNeighbor(2, 0);
        String test10 = ig.mostValuableNeighbor(2, 1);
        String test11 = ig.mostValuableNeighbor(2, 1);
        String test12 = ig.mostValuableNeighbor(2, 3);
        System.out.println("most valuable neighbor of item at [0, 0] should be book and is: " + test1);
        if (test1.equals("book")) {
            System.out.println("--> PASS!");
        } else {
            System.out.println("--> !!!!!!!!FAIL!!!!!!!!");
        }
        System.out.println("most valuable neighbor of item at [0, 1] should be book and is: " + test2);
        if (test2.equals("book")) {
            System.out.println("--> PASS!");
        } else {
            System.out.println("--> !!!!!!!!FAIL!!!!!!!!");
        }
        System.out.println("most valuable neighbor of item at [0, 2] should be book and is: " + test3);
        if (test3.equals("book")) {
            System.out.println("--> PASS!");
        } else {
            System.out.println("--> !!!!!!!!FAIL!!!!!!!!");
        }
        System.out.println("most valuable neighbor of item at [0, 3] should be desk and is: " + test4);
        if (test4.equals("desk")) {
            System.out.println("--> PASS!");
        } else {
            System.out.println("--> !!!!!!!!FAIL!!!!!!!!");
        }
        System.out.println("most valuable neighbor of item at [1, 0] should be flag and is: " + test5);
        if (test5.equals("flag")) {
            System.out.println("--> PASS!");
        } else {
            System.out.println("--> !!!!!!!!FAIL!!!!!!!!");
        }
        System.out.println("most valuable neighbor of item at [1, 1] should be either flag or globe and is: " + test6);
        if (test6.equals("flag") || test6.equals("globe")) {
            System.out.println("--> PASS!");
        } else {
            System.out.println("--> !!!!!!!!FAIL!!!!!!!!");
        }
        System.out.println("most valuable neighbor of item at [1, 2] should be harp and is: " + test7);
        if (test7.equals("harp")) {
            System.out.println("--> PASS!");
        } else {
            System.out.println("--> !!!!!!!!FAIL!!!!!!!!");
        }
        System.out.println("most valuable neighbor of item at [1, 3] should be harp and is: " + test8);
        if (test8.equals("harp")) {
            System.out.println("--> PASS!");
        } else {
            System.out.println("--> !!!!!!!!FAIL!!!!!!!!");
        }
        System.out.println("most valuable neighbor of item at [2, 0] should be jacket and is: " + test9);
        if (test9.equals("jacket")) {
            System.out.println("--> PASS!");
        } else {
            System.out.println("--> !!!!!!!!FAIL!!!!!!!!");
        }
        System.out.println("most valuable neighbor of item at [2, 1] should be jacket and is: " + test10);
        if (test10.equals("jacket")) {
            System.out.println("--> PASS!");
        } else {
            System.out.println("--> !!!!!!!!FAIL!!!!!!!!");
        }
        System.out.println("most valuable neighbor of item at [2, 2] should be jacket and is: " + test11);
        if (test11.equals("jacket")) {
            System.out.println("--> PASS!");
        } else {
            System.out.println("--> !!!!!!!!FAIL!!!!!!!!");
        }
        System.out.println("most valuable neighbor of item at [2, 3] should be lunch and is: " + test12);
        if (test12.equals("lunch")) {
            System.out.println("--> PASS!");
        } else {
            System.out.println("--> !!!!!!!!FAIL!!!!!!!!");
        }
        System.out.println("You called the provided isValid() method in your solution: " + ig.isCalled());
        if (ig.isCalled()) {
            System.out.println("--> PASS!");
        } else {
            System.out.println("--> !!!!!!!!FAIL!!!!!!!! You didn't use isValid as required!!!");
        }
    }
}