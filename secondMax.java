public class Recursion {

    public static int secondMax(int[] numbers){
        int max1, max2;
        max1 = numbers[0];
        max2 = numbers[1];
        if (numbers[0] < numbers[1]) {
            max1 = numbers[1];
            max2 = numbers[0];
        }
        int index = 2;
        return secondMaxSearch(numbers, max1, max2, index);
    }

    private static int secondMaxSearch(int[] numbers, int max1, int max2, int index) {
        if (numbers[index] >= max1) {
            max2 = max1;
            max1 = numbers[index];
        } else if (numbers[index] > max2) max2 = numbers[index];
        return index + 1 == numbers.length ? max2 : secondMaxSearch(numbers, max1, max2, index + 1);
    }
}
