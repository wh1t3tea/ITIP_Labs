public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) { 
            String s = args[i];
            if (isPalindrome(s)) {
                System.out.println(String.format("%s is a Palindrome", s));
            }
            else {
                System.out.println(String.format("%s is not a Palindrome", s));
            }
        }

    }
    public static String reverseString(String s) {
        String reversedString = "";
        for (int i = (s.length() - 1); i >= 0; i--) { 
            reversedString += s.charAt(i);
        }
        return reversedString;
    }
    public static boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    } 
}