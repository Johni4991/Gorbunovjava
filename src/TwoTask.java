import java.util.Scanner;

public class TwoTask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введи Имя: ");
        String name = s.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
