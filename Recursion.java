import java.util.List;

public class Recursion {

    public static int exponentiation(int n, int m) {
        if (m == 0) return 1;
        return n * exponentiation(n, m - 1);
    }

    public static int sumOfDigits(int number) {
        if (number / 10 == 0) return number;
        return number % 10 + sumOfDigits(number / 10);
    }

    public static int listLength(List<Integer> numbers) {
        try {
            numbers.pop(0);
            return 1 + listLength(numbers);
        } catch (Exception exception){
            return 0;
        }
    }

    public static boolean palindrome(String str){
        if (str.length() <= 1) return true;
        return str.charAt(0) == str.charAt(str.length() - 1) && palindrome(str.substring(1, str.length() - 1));
    }
}
