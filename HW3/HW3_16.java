//6) Проверить, различны ли все элементы массива.

import java.util.Random;
import java.util.Scanner;

public class HW3_16 {
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

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n; l++) {
                        if (array[i][j] == array[k][l]) {
                            count++;
                        }
                    }

                }
            }
        }
        if (count == n * n) {
            System.out.println("Все элементы массива различны");
        } else {
            System.out.println("Не все элементы массива различны");
        }


    }
}
