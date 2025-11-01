enum ColorComponent {
    RED, GREEN, BLUE
}

public class PlayWithPixel {

    private static int getIntInRange0to255() {
        return (int) (Math.random() * 256);
    }

    private static void printImage(int[][][] image) {
        for (int i = 0; i < image.length; i++) {
            int[][] row = image[i];
            for (int j = 0; j < row.length; j++) {
                int[] pixel = row[j];
                System.out.print("{" + pixel[0] + ", " + pixel[1] + ", " + pixel[2] + "}");
                if (j < row.length - 1) { // if it is not the last component, print the comma and a space
                    System.out.print(",     \t");
                }
            }
            System.out.println();
        }
    }

    private static int[][][] generateRandomImage(int nrRow, int nrColumns) {
        int[][][] randomImage = new int[nrRow][nrColumns][3];

        for (int i = 0; i < randomImage.length; i++) {
            int[][] row = randomImage[i];
            for (int j = 0; j < row.length; j++) {
                int[] pixel = row[j];
                for (int k = 0; k < pixel.length; k++) {
                    pixel[k] = getIntInRange0to255();
                }
            }
        }
        return randomImage;
    }

    private static int[] getMeanRGB(int[] rgb1, int[] rgb2) {
        int[] meanRGB = new int[3];

        meanRGB[0] = (rgb1[0] + rgb2[0]) / 2;
        meanRGB[1] = (rgb1[1] + rgb2[1]) / 2;
        meanRGB[2] = (rgb1[2] + rgb2[2]) / 2;

        return meanRGB;
    }

    private static int[][][] mergePixels(int[][][] originalPhoto) {
        int[][][] pixelMergedPhoto = new int[originalPhoto.length][originalPhoto[0].length / 2][3];

        for (int i = 0; i < originalPhoto.length; i++) {
            int[][] originalRow = originalPhoto[i];// per ogni riga prendo 2 pixel vicini
            int[][] filteredRow = pixelMergedPhoto[i];
            for (int j = 0; j < originalRow.length - 1; j += 2) {//pixe 0 3 5
                int[] pixel1 = originalRow[j];
                int[] pixel2 = originalRow[j + 1];
                filteredRow[j / 2] = getMeanRGB(pixel1, pixel2);// per ogni nuova cella 
            }
        }

        return pixelMergedPhoto;
    }

    private static ColorComponent getDominantComponent(int[] pixelRGB) {//prende array 3D
        int dominantComponent = 0;
        int max = pixelRGB[0];
        for (int i = 1; i < pixelRGB.length; i++) {
            if (pixelRGB[i] > max) {
                max = pixelRGB[i];
                dominantComponent = i;
            }
        }
        return ColorComponent.values()[dominantComponent];
    }

    private static ColorComponent[][] getDominantColorComponents(int[][][] image) {
        ColorComponent[][] dominantColorComponent = new ColorComponent[image.length][image[0].length];

        for (int i = 0; i < image.length; i++) {
            int[][] row = image[i];
            for (int j = 0; j < row.length; j++) {
                dominantColorComponent[i][j] = getDominantComponent(row[j]);
            }
        }

        return dominantColorComponent;
    }

    private static void printDominantColorComponents(ColorComponent[][] colorComponents) {
        for (int i = 0; i < colorComponents.length; i++) {
            ColorComponent[] row = colorComponents[i];
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j]);
                if (j < row.length - 1) {// true if it is not the last cell of the row
                    System.out.print("  \t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][][] originalImage = generateRandomImage(4, 4);

        System.out.println("Original image");
        printImage(originalImage);

        int[][][] pixelMergedImage = mergePixels(originalImage);
        System.out.println("\nMerged image");
        printImage(pixelMergedImage);

        ColorComponent[][] dominantColorComponents = getDominantColorComponents(pixelMergedImage);
        System.out.println("\nDominant color components");
        printDominantColorComponents(dominantColorComponents);
    }
}