package Task2Ex5;
/*
Написать программу, которая вычисляет оптимальный вес для пользователя,
сравнивает его с реальным и выдает рекомендацию о необходимости поправиться или похудеть.
 Оптимальный вес вычисляется по формуле: Рост (см) — 100.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Введите Ваш рост (см) : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Введите Ваш вес (кг) : ");
        int b = sc.nextInt();
        int c = a - 100;
        if (c < b) {
            System.out.println("Вам нужно похудеть.");
        }
        else if (c > b) {
            System.out.println("Вам нужно поправиться.");
        }
        else {
            System.out.println("Ваш вес в норме.");
        }

    }
}
