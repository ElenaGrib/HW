/*8)Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
массива должен равняться отношению элемента из первого массива с i-ым
индексом к элементу из второго массива с i-ым индексом. Вывести все три
массива на экран (каждый на отдельной строке), затем вывести количество
целых элементов в третьем массиве.*/

import java.text.DecimalFormat;
import java.util.Random;

public class HW3_8 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayOne = new int[10];
        int[] arrayTwo = new int[10];
        double[] arrayThree = new double[10];
        int count = 0;

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = random.nextInt(9) + 1;
            arrayTwo[i] = random.nextInt(9) + 1;
            arrayThree[i] = (double) arrayOne[i] / arrayTwo[i];

            if (Math.round(arrayThree[i]) - arrayThree[i] == 0) {
                count++;
            }
        }

        //Выводим массивы на консоль
        for (int e : arrayOne) {
            System.out.print(e + " ");
        }

        System.out.print("\n");

        for (int d : arrayTwo) {
            System.out.print(d + " ");
        }

        System.out.print("\n");

        //Чтобы красиво выводилось
        DecimalFormat df = new DecimalFormat("###.##");

        for (double c : arrayThree) {
            System.out.print((df.format(c)) + " ");
        }
        System.out.print("\nКоличество целых элементов в третьем массиве: " + count);
    }
}

