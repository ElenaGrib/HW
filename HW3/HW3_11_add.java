import java.util.Random;
import java.util.Scanner;

public class HW3_11_add {
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

        System.out.println();
        int compasition = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                compasition *= array[i];
            }
        }
        System.out.println("Произведение элементов массива, кратных 3: " + compasition);
    }

}
