//4)Посчитать сумму четных элементов стоящих над побочной диагональю (не включительно)

import java.util.Random;
import java.util.Scanner;

public class HW3_24 {
    public static void main(String[] args) {
        //Инициализация и вывод массива
        System.out.print("Введите размер матрицы: ");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];


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

//Побочная диагональ
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (array[i][n - i] % 2 == 0) {
                sum += array[i][n - i];
            }
        }
        System.out.println("Сумма четных элементов, стоящих над побочной диагональю (не включительно): " + sum);
    }
}
