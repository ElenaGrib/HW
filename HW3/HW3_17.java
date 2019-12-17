//7) Подсчитать, сколько раз встречается элемент с заданным значением.

import java.util.Random;
import java.util.Scanner;

public class HW3_17 {
    public static void main(String[] args) {
        //Инициализация и вывод массива
        System.out.print("Введите размер матрицы: ");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        int sum = 0;

        if (n <= 0) {
            System.out.println("Вы ввели неверное число, попробуйте снова");
            System.exit(0);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(51);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Введите заданное значение: ");
        int key = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] == key) {
                    count++;
                }

            }
        }
        System.out.println("Элементов с заданным значением в массиве: " + count);
    }
}
