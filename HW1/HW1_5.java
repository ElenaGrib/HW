//5) Даны 3 целых числа. Найти количество положительных и отрицательных
//чисел в исходном наборе.

public class HW1_5 {
  public static void main(String[] args){
        int a = -20;
        int b = 10;
        int c = 0;
        int aa = 0;
        int zero = 0;

        if (a > 0) {
            aa++;
        }
        if (b > 0) {
            aa++;
        }
        if (c > 0) {
            aa++;
        }
        System.out.print((aa) + " positive and " + (3 - aa) + " negative values");
        if (a == 0 || b == 0 || c == 0) {
            if (a == 0) {
                zero++;
            }
            if (b == 0) {
                zero++;
            }
            if (c == 0) {
                zero++;
            }
            System.out.println(", incl. " + (3 - zero) + " zero values");
        }


    }
 }