package Main;
/*
1 Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3
попытки угадать это число. При каждой попытке компьютер должен сообщить больше ли
указанное пользователем число чем загаданное, или меньше. После победы или проигрыша
выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
 */

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Random rnd = new Random();
    public static int n = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte userChoise;
        do {
            System.out.println("Программа загадала случайное число от 0 - 9");
            byte trys = 1;
            int random = rnd.nextInt(n);
            do {
                userChoise = scanner.nextByte();
                if (userChoise > random)
                    System.out.println("Число меньше" + " еще " + (3 - trys) + " попыт.");
                else if (userChoise < random) {
                    System.out.println("Число больше" + " еще " + (3 - trys) + " попыт.");
                } else {
                    System.out.println("Вы угадали число : " + random);
                    trys = 4; //Exit
                } trys++;

            } while (trys < 4);

            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        } while (scanner.nextInt() == 1);
    }
}
