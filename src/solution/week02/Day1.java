package solution.week02;

public class Day1 {

    public static void main(String[] args) {
        // Практика
        int[] array = new int[]{1, 3, 6, 9, 15, 21, -11};
        printElementsOfArray(array);
        System.out.println();
        System.out.println(getSumOfArray(array));
        System.out.println(getMinOfArray(array));
        System.out.println(getMaxOfArray(array));
        printReversedElementsOfArray(array);
        System.out.println();

        System.out.println(getAverageOfArray(array));
        System.out.println(getEvenCountFromArray(array));
        System.out.println(getPositiveCountFromArray(array));

    }

    /**
     * Вывод всех элементов
     */
    private static void printElementsOfArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    /**
     * Получение суммы всех элементов
     */
    private static int getSumOfArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    /**
     * Получение среднего значения
     */
    private static double getAverageOfArray(int[] array) {
        double sum = getSumOfArray(array);
        return sum / array.length;
    }

    /**
     * Получение минимального значения
     */
    private static int getMinOfArray(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    /**
     * Получение максимального значения
     */
    private static int getMaxOfArray(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * Вывод массива в обратном порядке
     */
    private static void printReversedElementsOfArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    /**
     * Кол-во четных
     */
    private static int getEvenCountFromArray(int[] array) {
        int counter = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Кол-во положительных
     */
    private static int getPositiveCountFromArray(int[] array) {
        int counter = 0;
        for (int num : array) {
            if (num > 0) {
                counter++;
            }
        }
        return counter;
    }

}
