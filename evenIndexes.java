import java.util.ArrayList;

public class Recursion {

    public static void evenIndexes(ArrayList<Integer> numbers){
        int index = 0;
        if (numbers.size() > 0) printEvenIndexes(numbers, index);
    }

    private static void printEvenIndexes(ArrayList<Integer> numbers, int index) {
        if (index % 2 == 0) {
            System.out.print(numbers.get(index) + " ");
        }
        if (index + 1 < numbers.size()) printEvenIndexes(numbers, index + 1);
    }
}
