import java.util.Comparator;

public class ReverseStrings {

    public static void main(String[] args) {

        System.out.println("gfedcbZ".equals(reverseString("Zbcdefg")));
    }

    public static String reverseString(String str) {

        return str.codePoints()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
