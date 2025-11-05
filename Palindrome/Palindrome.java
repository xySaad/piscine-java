public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s == null)
            return false;

        s = s.toLowerCase();
        int mid = s.length() / 2;

        String left = s.substring(0, mid);
        String right = reverse(s.substring(mid + s.length() % 2));

        return left.equals(right);
    }

    static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i > -1; i--)
            result += str.charAt(i);

        return result;
    }
}
