package Task2Ex5;

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
