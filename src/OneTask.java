import java.util.Scanner;

public class OneTask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введи число: ");
        int x = s.nextInt();  
        if (x > 7) {
            System.out.println("Привет");
        }
    }
}
