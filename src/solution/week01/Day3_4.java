package solution.week01;


// Объединил с 4 днём, так как цель 4 дня и так исполнялась прямо с первого
public class Day3_4 {

    public static void main(String[] args) {
        String simpleWord = "Store";
        String simpleWord2 = "1 piece of advice";
        String sentence = "What a great day!";
        String palindrome = "Radar";


        // Практика
        System.out.println(simpleWord.length());
        printFirstAndLastSymbol(simpleWord);
        System.out.println(countSpaces(sentence));
        System.out.println(startsWithLetter(simpleWord));
        System.out.println(startsWithLetter(simpleWord2));
        System.out.println(isPalindrome(palindrome.toLowerCase()));
        System.out.println(isPalindrome(simpleWord.toLowerCase()));
        printInitials(sentence);

    }

    private static void printFirstAndLastSymbol(String word) {
        if (word != null && !word.isEmpty()) {
            System.out.println("First symbol is: " + word.charAt(0));
            System.out.println("Last symbol is: " + word.charAt(word.length() - 1));
        }
    }

    private static int countSpaces(String word) {
        int counter = 0;
        char[] symbols = word.toCharArray();
        for (char symb : symbols) {
            if (symb == ' ') {
                counter++;
            }
        }
        return counter;
    }

    private static boolean startsWithLetter(String word) {
        return word != null && !word.isEmpty() && Character.isLetter(word.charAt(0));
    }

    private static boolean isPalindrome(String word) {
        char[] chars = word.toCharArray();
        for (int count = 0; count < chars.length; count++) {
            if (chars[count] != chars[chars.length - 1 - count]) {
                return false;
            }
        }
        return true;
    }

    private static void printInitials(String word) {
        String[] strings = word.split(" ");
        for (String s : strings) {
            System.out.print(s.charAt(0) + " ");
        }
    }

}
