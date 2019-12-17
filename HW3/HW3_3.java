//3)Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
//массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
//это количество на экран на отдельной строке.

import java.util.Random;

public class HW3_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        int count = 0;

        //заполняем массив рандомными числами от 0 до 99
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");

            //считаем кол-во четных чисел
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        System.out.print("\n"+"Колличество четных элементов массива :"+count);
    }
}
