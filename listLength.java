public class Recursion {
    
    public static int listLength(List<Integer> numbers) {
        try {
            numbers.pop(0);
            return 1 + listLength(numbers);
        } catch (Exception exception){
            return 0;
        }
    }
}
