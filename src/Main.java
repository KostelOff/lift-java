import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int saveValue = 0;
        System.out.println("Лифт готов к работе.");

        while (true) {
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0).");

            int value = scan.nextInt();
            if (value == saveValue) {
                System.out.println("Вы уже на этом этаже!");
                continue;
            } else if (value >= 0 && value <= 25) {
                deque.offer(value);
                saveValue = value;
            } else {
                System.out.println("Такого этажа нет!");
            }
            if (value == 0) {
                break;
            }
        }

        System.out.println("Лифт проследовал по следующим этажам:");
        while (!deque.isEmpty()) {
            int x = deque.poll();
            if (x > 0) {
                System.out.print("этаж " + x + " -> ");
            }
            if (x == 0) {
                System.out.print("этаж " + x);
            }
        }
    }
}