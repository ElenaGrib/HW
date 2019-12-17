/*10)Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
переменную n. Если пользователь ввёл не подходящее число, то программа
должна выдать соответствующее сообщение. Создать массив из n случайных
целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
только из чётных элементов первого массива, если они там есть, и вывести его
на экран.*/

import java.util.Random;
import java.util.Scanner;

public class HW3_10 {
    public static void main(String[] args) {
        System.out.print("Введите рамер массива (целое положительное число больше 3х): ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[n];
        int a = 0;

        if (n < 3) {
            System.out.println("Вы ввели неверное число, попробуйте снова");
            System.exit(0);
        }
        //Заполняем массив
        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(n + 1);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0) {
                a++; //Для размерности второго массива
            }
        }
        System.out.print("\n");
        //Создаем второй массив, заполняем егочетными элементами первого массива
        int[] arrayEven = new int[a];
        int j = 0;
        if (a == 0) {
            System.out.println("В исходном массиве нет четных элементов");
            System.exit(0);
        } else {
            System.out.println("Новый массив, с четными элементами исходного:");
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    arrayEven[j] = array[i];
                    System.out.print(arrayEven[j] + " ");
                    j++;
                }
            }
        }

    }

}


