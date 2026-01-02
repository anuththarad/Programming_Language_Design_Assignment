public class Recursive_parser {

    private String input;
    private int index = 0;

    // Constructor to initialize input string
    public Recursive_parser(String input) {
        this.input = input;
    }

    // Grammar rule: S → a b
    public boolean S() {
        return match('a') && match('b');
    }

    // Method
    private boolean match(char expected) {
        if (index < input.length() && input.charAt(index) == expected) {
            index++;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Recursive_parser parser = new Recursive_parser("ab");

        if (parser.S() && parser.index == parser.input.length()) {
            System.out.println("Valid string");
        } else {
            System.out.println("Invalid string");
        }
    }
}
