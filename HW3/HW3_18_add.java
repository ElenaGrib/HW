//8) Найти второй по величине (т.е. следующий по величине за максимальным)
//элемент в массиве.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW3_18_add {
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

        //Сортируем массив
        Arrays.sort(array);

        //Тк макс элемент будет стоять на последнем месте,ищим предыдущий, не равный макс
        int i = array.length - 1;
        if (array[i] != array[i - 1]) {
            System.out.println("\nМаксимальный элемент массива: " + array[i]);
            System.out.println("Второй по величине элемент массива: " + array[i - 1]);
        } else {
            i--;
        }

    }
}
