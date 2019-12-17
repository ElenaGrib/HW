/*8) Найти второй по величине (т.е. следующий по величине за максимальным)
элемент в массиве.*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW3_18 {
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

        //Создаем одномерный массив
        int[] arrayNew = new int[n * n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arrayNew[c] = array[i][j];
                c++;
            }
        }

        //Сортируем массив
        Arrays.sort(arrayNew);

        //Тк макс элемент будет стоять на последнем месте,ищим предыдущий, не равный макс
        int i = n * n - 1;
        if (arrayNew[i] != arrayNew[i - 1]) {
            System.out.println("Максимальный элемент массива: " + arrayNew[i]);
            System.out.println("Второй по величине элемент массива: " + arrayNew[i - 1]);
        } else {
            i--;
        }
    }
}


