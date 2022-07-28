public class Recursion {

    public static void validParenthesis(int n){
        printValidParenthesis(n, n, "");
    }
    private static void printValidParenthesis(int openP, int closeP, String string){
        if (openP == 0 && closeP == 0) {
            System.out.println(string);
        }
        if (openP > 0 && openP <= closeP) {
            printValidParenthesis(openP - 1, closeP, string + "(");
        }
        if (closeP > 0 && closeP >= openP) {
            printValidParenthesis(openP, closeP - 1, string + ")");
        }
    }
}
