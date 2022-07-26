public class Recursion {
    
    public static int exponentiation(int n, int m) {
        if (m == 0) return 1;
        return n * exponentiation(n, m - 1);
    }
}
