package solution.week01;

import java.util.Arrays;

public class Day5 {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 6, 10};
        String simpleWord = "Store";
        String simpleWord2 = "store";
        String sentence = "18 of april is the best day! ababababa";

        System.out.println(compareWords(simpleWord, simpleWord2));
        System.out.println(isSorted(array));
        countLettersAndNumbers(sentence);
        System.out.println(longestWord(sentence));

    }

    private static boolean isSorted(int[] array) {
        int[] sorted = array.clone();
        Arrays.sort(sorted);
        return Arrays.equals(array, sorted);
    }

    private static boolean compareWords(String word1, String word2) {
        return word1.equalsIgnoreCase(word2);
    }

    private static void countLettersAndNumbers(String word) {
        char[] chars = word.toCharArray();
        int letters = 0;
        int numbers = 0;
        for (char c : chars) {
            if (Character.isLetter(c)) {
                letters++;
            } else if (Character.isDigit(c)) {
                numbers++;
            }
        }
        System.out.println("Letter count: " + letters);
        System.out.println("Number count: " + numbers);
    }

    private static String longestWord(String word) {
        String[] words = word.split(" ");
        int longestIndex = 0;
        for (int count = 0; count < words.length; count++) {
            if (words[count].length() > words[longestIndex].length()) {
                longestIndex = count;
            }
        }
        return words[longestIndex];
    }

}
