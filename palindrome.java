public class Recursion {

    public static boolean palindrome(String str){
        if (str.length() <= 1) return true;
        return str.charAt(0) != str.charAt(str.length() - 1) ? false : palindrome(str.substring(1, str.length() - 1));
    }
}
