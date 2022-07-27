public class Recursion {
    
    public static int listLength(Deque<Integer> numbers) {
       if (numbers.isEmpty()) return 0;
       numbers.pop();
       return 1 + listLength(numbers);
    }
}
