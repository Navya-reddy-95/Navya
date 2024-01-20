class VowelFinder {
    public static void main(String[] args) {
        String input = "today is last day";
        String vowels = "aeiouAEIOU";
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (vowels.indexOf(c) != -1) {
                result += c;
            }
        }

        System.out.println("Vowels in the input: " + result);
    }
}