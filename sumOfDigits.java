public class Recursion {
    
    public static int sumOfDigits(int number) {
        if (number / 10 == 0) return number;
        return number % 10 + sumOfDigits(number / 10);
    }
}
