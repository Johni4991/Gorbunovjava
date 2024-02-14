public class ThreeTask {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        for (int number : numbers) {
            if (number % 3 == 0) {
                System.out.println(number);
            }
        }
    }
}
