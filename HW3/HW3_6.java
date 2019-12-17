//6)Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
//на экран в строку. Определить и вывести на экран сообщение о том, является ли
//массив строго возрастающей последовательностью.

import java.util.Random;

public class HW3_6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[4];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }

//Проверяем, является ли массив строго ворастающей последовательностью
//Через break
        int i = 0;
        while (i < array.length - 1) {
            if (array[i + 1] < array[i]) {
                System.out.print("\nМассив не являетя строго возрастающей последовательностью");
                break;
            }
            i++;
        }
        if (i == array.length-1) {
            System.out.print("\nМассив являетя строго возрастающей последовательностью");
        }
    }
}
