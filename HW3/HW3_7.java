//7)Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
//какой элемент является в этом массиве максимальным и сообщите индекс его
//последнего вхождения в массив.

import java.util.Random;

public class HW3_7 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[12];
        int max = 0;
        int lastIndex = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
            System.out.print(array[i] + " ");
        }

        //Макс элемент массива
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.print("\nМаксимальный элемент массива: " + max);

        //Находим последний индекс максимального элемента
        for (int i = array.length - 1; i >= 1; i--) {
            if (array[i] == max) {
                lastIndex = i;
                break;
            }
        }
        System.out.print(", последний индекс которого равен " + lastIndex);
    }
}
