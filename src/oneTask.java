import java.util.Scanner;

public class oneTask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введи число: ");
        int x = s.nextInt();    //s.nextLine - для текста
        if (x > 7) {
            System.out.println("Привет");
        }
    }
}
