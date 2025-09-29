public class orderString {
    public static String reorder(String input) {
        StringBuilder numbers = new StringBuilder();
        StringBuilder lower = new StringBuilder();
        StringBuilder upper = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                numbers.append(c);
            } else if (Character.isLowerCase(c)) {
                lower.append(c);
            } else if (Character.isUpperCase(c)) {
                upper.append(c);
            }
        }

        return numbers.toString() + lower.toString() + upper.toString();
    }

    public static void main(String[] args) {
        String input = "aB3cD1zXy23TUv";
        String output = reorder(input);
        System.out.println("Input : " + input);
        System.out.println("Output: " + output);
    }
}
