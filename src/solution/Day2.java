package solution;

public class Day2 {
    public static void main(String[] args) {
        int[] array = new int[]{-5, 55, -11, 13, 0, 29, 55, 0, 36};
        // практика
        printPosNegZeroNumbers(array);
        System.out.println();
        System.out.println(containsNumber(array, -12));
        System.out.println(containsNumber(array, 29));
        System.out.println(countOccurrences(array, 0));
        System.out.println(firstMaxIndex(array));
        compareEvenAndOddIndexes(array);

    }

    private static void printPosNegZeroNumbers(int[] array) {
        int positive = 0;
        int negative = 0;
        int zeroes = 0;
        for (int num : array) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zeroes++;
            }
        }
        System.out.printf("Positive count = %d ", positive);
        System.out.printf("Negative count = %d ", negative);
        System.out.printf("Zeroes count = %d ", zeroes);
    }

    private static boolean containsNumber(int[] array, int numToFind) {

        for (int num : array) {
            if (num == numToFind) {
                return true;
            }
        }
        return false;
    }

    private static int countOccurrences(int[] array, int numToFind) {

        int counter = 0;
        for (int num : array) {
            if (num == numToFind) {
                counter++;
            }
        }
        return counter;
    }

    private static int firstMaxIndex(int[] array) {
        int maxIndex = 0;
        for (int count = 0; count < array.length; count++) {
            if (array[count] > array[maxIndex]) {
                maxIndex = count;
            }
        }
        return maxIndex;
    }

    private static void compareEvenAndOddIndexes(int[] array) {
        int evenSum = 0;
        int oddSum = 0;

        for (int count = 0; count < array.length; count++) {
            if (count % 2 == 0) {
                evenSum += array[count];
            } else oddSum += array[count];
        }
        System.out.println("Sum of even indexes = " + evenSum);
        System.out.println("Sum of odd indexes = " + oddSum);
        System.out.println("Difference = " + Math.abs(evenSum - oddSum));
    }


}
