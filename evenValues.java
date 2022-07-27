import java.util.ArrayList;

public class Recursion {

    public static void evenValues(ArrayList<Integer> numbers){
        int index = 0;
        if (numbers.size() > 0) printEvenValues(numbers, index + 1);
    }

    private static void printEvenValues(ArrayList<Integer> numbers, int index) {
        if (numbers.get(index) % 2 == 0) {
            System.out.print(numbers.get(index) + " ");
        }
        if (index + 1 < numbers.size()) printEvenValues(numbers, index + 1);
    }
}
