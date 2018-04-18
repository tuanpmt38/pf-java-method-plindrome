import java.util.Scanner;

public class Plindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String textString = sc.nextLine();
        System.out.println(isPladrome(textString));
    }

    public static boolean isPladrome(String text) {
        boolean ischeck = true;
        int lastindex = text.length() - 1;
        if (text.length() == 0 || text.length() == 1) {
            return !ischeck;
        }
        if (text.charAt(0) != text.charAt(lastindex)) {
            return ischeck;
        }
        text = text.substring(1, lastindex);
        return isPladrome(text);
    }
}
