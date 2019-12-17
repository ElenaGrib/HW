//7) Подсчитать, сколько раз встречается элемент с заданным значением.

import java.util.Random;
import java.util.Scanner;

public class HW3_17_add {
    public static void main(String[] args) {
        System.out.println("Введите размерность массива: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[n];

        if (n <= 0) {
            System.out.println("Вы ввели неверное число, попробуйте снова");
            System.exit(0);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
            System.out.print(array[i] + " ");
        }

        System.out.print("\nВведите заданное значение: ");
        int key = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == key) {
                count++;
            }

        }
        System.out.println("Элементов с заданным значением в массиве: " + count);
    }
}

