public class String_char{

    public static void main(String[] args) {

        String s = "  Hello World  ";

        // 🔹 Basic
        System.out.println("Length: " + s.length());
        System.out.println("CharAt(1): " + s.charAt(1));

        // 🔹 Trim
        String trimmed = s.trim();
        System.out.println("Trimmed: '" + trimmed + "'");

        // 🔹 Case
        System.out.println("Upper: " + trimmed.toUpperCase());
        System.out.println("Lower: " + trimmed.toLowerCase());

        // 🔹 Compare
        System.out.println("Equals: " + trimmed.equals("Hello World"));
        System.out.println("EqualsIgnoreCase: " + trimmed.equalsIgnoreCase("hello world"));

        // 🔹 Search
        System.out.println("Contains 'World': " + trimmed.contains("World"));
        System.out.println("IndexOf 'o': " + trimmed.indexOf('o'));
        System.out.println("LastIndexOf 'o': " + trimmed.lastIndexOf('o'));
        System.out.println("StartsWith 'He': " + trimmed.startsWith("He"));
        System.out.println("EndsWith 'ld': " + trimmed.endsWith("ld"));

        // 🔹 Substring
        System.out.println("Substring(0,5): " + trimmed.substring(0, 5));

        // 🔹 Replace
        System.out.println("Replace l->x: " + trimmed.replace("l", "x"));

        // 🔹 Split
        String[] parts = trimmed.split(" ");
        System.out.println("Split:");
        for (String part : parts) {
            System.out.println(part);
        }

        // 🔹 Join
        String joined = String.join("-", parts);
        System.out.println("Joined: " + joined);

        // 🔹 Empty check
        String empty = "";
        System.out.println("isEmpty: " + empty.isEmpty());
        System.out.println("isBlank: " + empty.isBlank());

        // 🔹 Conversion
        int num = Integer.parseInt("123");
        String numStr = String.valueOf(456);
        System.out.println("Parsed int: " + num);
        System.out.println("Int to String: " + numStr);

        // 🔹 Repeat
        System.out.println("Repeat: " + "Hi ".repeat(3));

        // 🔹 Matches (regex)
        System.out.println("Matches letters only: " + "abc".matches("[a-z]+"));

        // 🔹 Loop through string
        System.out.println("Characters:");
        for (int i = 0; i < trimmed.length(); i++) {
            System.out.print(trimmed.charAt(i) + " ");
        }
           char c = 'A';
        char d = '5';
        char space = ' ';

        // 🔹 Check
        System.out.println(Character.isDigit(d));
        System.out.println(Character.isLetter(c));
        System.out.println(Character.isLetterOrDigit(d));
        System.out.println(Character.isWhitespace(space));
        System.out.println(Character.isUpperCase(c));
        System.out.println(Character.isLowerCase(c));

        // 🔹 Convert
        System.out.println(Character.toLowerCase(c));
        System.out.println(Character.toUpperCase('b'));

        // 🔹 Numeric
        System.out.println(Character.getNumericValue(d));

        // 🔹 Compare
        System.out.println(Character.compare('A', 'B'));

        // 🔹 Loop example
        String ss = "Abc123";
        for (char ch : ss.toCharArray()) {
            if (Character.isDigit(ch)) {
                System.out.println(ch + " is digit");
            }
        }
    }
}