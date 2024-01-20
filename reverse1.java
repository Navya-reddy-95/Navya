import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        System.out.println("Reversed word: " + reverseWord(word));
    }

    public static String reverseWord(String word) {
        StringBuilder reversedWord = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            char currentChar = word.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                reversedWord.append(Character.toUpperCase(currentChar));
            } else {
                reversedWord.append(Character.toLowerCase(currentChar));
            }
        }
        return reversedWord.toString();
    }
}