package frq;

public class GrayImageTester {
    public static void main(String[] args) {
        int passed = 0;
        System.out.println("=========== TESTING PART A: countWhitePixels ===========");
        int[][] values1 = {
                {255, 184, 178, 84, 135},
                {84, 255, 255, 130, 84},
                {78, 255, 0, 0, 78},
                {84, 130, 255, 130, 84}
        };

        GrayImage image1 = new GrayImage(values1);

        System.out.println("count of WHITE (255) should be 5, your method returns: " + image1.countWhitePixels());
        if (image1.countWhitePixels() == 5) {
            System.out.println("------> TEST 1 PASS!");
            passed++;
        } else {
            System.out.println("------> !!!!!!!!!!!!! TEST 1 FAIL !!!!!!!!!!!!");
        }

        int[][] values2 = {
                {255, 150, 50, 250, 70, 150, 255},
                {100, 255, 130, 100, 20, 80, 90},
                {60, 20, 100, 80, 100, 200, 240},
                {200, 60, 90, 150, 0, 100, 40},
                {10, 120, 10, 255, 50, 200, 10},
                {90, 80, 70, 40, 200, 80, 50},
                {255, 70, 50, 20, 10, 30, 255}
        };

        GrayImage image2 = new GrayImage(values2);

        System.out.println("count of WHITE (255) should be 6, your method returns: " + image2.countWhitePixels());
        if (image2.countWhitePixels() == 6) {
            System.out.println("------> TEST 2 PASS!");
            passed++;
        } else {
            System.out.println("------> !!!!!!!!!!!!! TEST 2 FAIL !!!!!!!!!!!!");
        }

        System.out.println("\n=========== TESTING PART B: processImage() ===========");
        System.out.println("TEST 3 original image:");

        // print original image
        int[][] pixels = image1.getPixelValues();
        for (int[] row : pixels) {
            for (int pixel : row) {
                System.out.print(pixel + ", ");
            }
            System.out.println();
        }

        // process image
        image1.processImage();

        System.out.println();
        System.out.println("your method results in the following:");

        // print processed image
        pixels = image1.getPixelValues();
        for (int[] row : pixels) {
            for (int pixel : row) {
                System.out.print(pixel + ", ");
            }
            System.out.println();
        }

        if (pixels[0][0] == 255 && pixels[0][1] == 184 && pixels[0][2] == 100 && pixels[0][3] == 84 && pixels[0][4] == 135 &&
                pixels[1][0] == 0 && pixels[1][1] == 125 && pixels[1][2] == 171 && pixels[1][3] == 130 && pixels[1][4] == 84 &&
                pixels[2][0] == 78 && pixels[2][1] == 255 && pixels[2][2] == 0 && pixels[2][3] == 0 && pixels[2][4] == 78 &&
                pixels[3][0] == 84 && pixels[3][1] == 130 && pixels[3][2] == 255 && pixels[3][3] == 130 && pixels[3][4] == 84) {
            System.out.println("----------------------> TEST 3 PASS!");
            passed++;
        } else {
            System.out.println("\nthis was the EXEPECTED result:");
            int[][] expected = {
                    {255, 184, 100, 84, 135},
                    {0, 125, 171, 130, 84},
                    {78, 255, 0, 0, 78},
                    {84, 130, 255, 130, 84}
            };
            for (int[] row : expected) {
                for (int pixel : row) {
                    System.out.print(pixel + ", ");
                }
                System.out.println();
            }
            int wrongCount = 0;
            for (int i = 0; i < expected.length; i++) {
                for (int j = 0; j < expected[0].length; j++) {
                    if (expected[i][j] != pixels[i][j]) {
                        wrongCount++;
                    }
                }
            }
            System.out.println("\nthere are a total of " + wrongCount + " incorrect values");
            System.out.println("----------------------> !!!!!!!!!!!!! TEST 3 FAIL !!!!!!!!!!!!");
        }
        System.out.println("\nTEST 4 original image:");

        // print original image
        int[][] pixels2 = image2.getPixelValues();
        for (int[] row : pixels2) {
            for (int pixel : row) {
                System.out.print(pixel + ", ");
            }
            System.out.println();
        }

        // process image
        image2.processImage();

        System.out.println();
        System.out.println("your method results in the following:");

        // print processed image
        pixels2 = image2.getPixelValues();
        for (int[] row : pixels2) {
            for (int pixel : row) {
                System.out.print(pixel + ", ");
            }
            System.out.println();
        }

        if (    pixels2[0][0] == 155 && pixels2[0][1] == 70 && pixels2[0][2] == 0 && pixels2[0][3] == 50 && pixels2[0][4] == 0 && pixels2[0][5] == 150 && pixels2[0][6] == 255 &&
                pixels2[1][0] == 10 && pixels2[1][1] == 105 && pixels2[1][2] == 130 && pixels2[1][3] == 0 && pixels2[1][4] == 0 && pixels2[1][5] == 80 && pixels2[1][6] == 90 &&
                pixels2[2][0] == 50 && pixels2[2][1] == 0 && pixels2[2][2] == 50 && pixels2[2][3] == 0 && pixels2[2][4] == 90 && pixels2[2][5] == 200 && pixels2[2][6] == 240 &&
                pixels2[3][0] == 130 && pixels2[3][1] == 20 && pixels2[3][2] == 0 && pixels2[3][3] == 70 && pixels2[3][4] == 0 && pixels2[3][5] == 100 && pixels2[3][6] == 40 &&
                pixels2[4][0] == 0 && pixels2[4][1] == 100 && pixels2[4][2] == 0 && pixels2[4][3] == 225 && pixels2[4][4] == 0 && pixels2[4][5] == 200 && pixels2[4][6] == 10 &&
                pixels2[5][0] == 90 && pixels2[5][1] == 80 && pixels2[5][2] == 70 && pixels2[5][3] == 40 && pixels2[5][4] == 200 && pixels2[5][5] == 80 && pixels2[5][6] == 50 &&
                pixels2[6][0] == 255 && pixels2[6][1] == 70 && pixels2[6][2] == 50 && pixels2[6][3] == 20 && pixels2[6][4] == 10 && pixels2[6][5] == 30 && pixels2[6][6] == 255) {
            System.out.println("----------------------> TEST 4 PASS!");
            passed++;
        } else {
            System.out.println("\nthis was the EXEPECTED result:");
            int[][] expected = {
                    {155, 70, 0, 50, 0, 150, 255},
                    {10, 105, 130, 0, 0, 80, 90},
                    {50, 0, 50, 0, 90, 200, 240},
                    {130, 20, 0, 70, 0, 100, 40},
                    {0, 100, 0, 225, 0, 200, 10},
                    {90, 80, 70, 40, 200, 80, 50},
                    {255, 70, 50, 20, 10, 30, 255}
            };
            for (int[] row : expected) {
                for (int pixel : row) {
                    System.out.print(pixel + ", ");
                }
                System.out.println();
            }
            int wrongCount = 0;
            for (int i = 0; i < expected.length; i++) {
                for (int j = 0; j < expected[0].length; j++) {
                    if (expected[i][j] != pixels2[i][j]) {
                        wrongCount++;
                    }
                }
            }
            System.out.println("\nthere are a total of " + wrongCount + " incorrect values");
            System.out.println("----------------------> !!!!!!!!!!!!! TEST 4 FAIL !!!!!!!!!!!!");
        }
    }
}