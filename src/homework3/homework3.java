package homework3;

import java.util.Scanner;

public class homework3 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Угадайте число от 0 до 9");
        int range = 9;
        int number = (int) (Math.random() * range);
        game(range, number);
        System.out.println("Повторить игру ещё раз? 1 — да / 0 — нет");
        int choise = scanner.nextInt();
        if (choise == 1) {
            game(range, number);
        } else
            System.out.println("Игра завершена");;
    }

        private static void game (int range, int number) {
            for (int attempt = 0; attempt < 3; attempt++) {
                int input_number = scanner.nextInt();
                if (input_number == number) {
                    System.out.println("Вы угадали");
                } else if (input_number > number) {
                    System.out.println("Загаданное число меньше");
                } else
                    System.out.println("Загаданное число больше");
            }
        }
    }
