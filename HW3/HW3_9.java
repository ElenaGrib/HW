/*9)Пользователь должен указать с клавиатуры положительное число, а
программа должна создать массив указанного размера из случайных целых
чисел из [0;15] и вывести его на экран в строку. После этого программа должна
определить и сообщить пользователю о том, сумма какой половины массива
больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
пользователь введёт неподходящее число, то выдать соответствующее сообщение*/

import java.util.Random;
import java.util.Scanner;

public class HW3_9 {
    public static void main(String[] args) {
        System.out.print("Введите рамер массива (целое положительное число): ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Random random = new Random();
        int low = 0;
        int high = n - 1;


        if (n <= 0) {
            System.out.println("Вы ввели неверное число, попробуйте снова");
            System.exit(0);
        } else {
            //Заполняем массив
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(16);
                System.out.print(array[i] + " ");
            }

            int mid = (high - low) / 2;
            int sumLow = 0;
            int sumHigh = 0;
            // System.out.print("\n"); //Для проверки
            //Делим массив пополам, находим суммы двух частей
            for (int i = low; i < mid; i++) {
                //  System.out.print(array[i] + " "); //Для проверки
                sumLow += array[i];
            }
            // System.out.print("\n"); //Для проверки
            for (int i = mid; i < high + 1; i++) {
                sumHigh += array[i];
                // System.out.print(array[i] + " "); //Для проверки
            }

            //Сравниваем суммы двух частей, выводим соответствующее сообщение
            if (sumLow > sumHigh) {
                System.out.println("\nСумма левой половины массива больше (" + sumLow + " против " + sumHigh + ")");
            } else if (sumHigh > sumLow) {
                System.out.println("\nСумма правой половины массива больше (" + sumHigh + " против " + sumLow + ")");
            } else {
                System.out.println("\nСуммы двух половин массива равны (" + sumHigh + ")"); //Про модуль не пишу, тк числа положительные..
            }

        }

    }
}
