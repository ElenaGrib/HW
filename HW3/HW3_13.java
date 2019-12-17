//3)Проверить произведение элементов какой диагонали больше.

import java.util.Random;
import java.util.Scanner;

public class HW3_13 {
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


        //Произведение элементов первой диагонали
        int compositionOne = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    compositionOne *= array[i][j];
                }
            }
        }

        //Произведение элементов второй диагонали
        int compositionTwo = 1;
        for (int i = 0; i < n; i++) {
            compositionTwo *= array[i][n - i - 1];
        }

        //Сравнение двух произведений
        if (compositionOne > compositionTwo) {
            System.out.println("Произведение элементов главной диагонали больше (" + compositionOne + " против " + compositionTwo + ")");
        } else if (compositionTwo > compositionOne) {
            System.out.println("Произведение элементов побочной диагонали больше (" + compositionTwo + " против " + compositionOne + ")");
        } else {
            System.out.println("Произведения обеих диагоналий равны: " + compositionOne);
        }
    }
}
