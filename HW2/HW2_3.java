//3)Вычислить: 1+2+4+8+...+256

public class HW2_3 {
    public static void main(String[] args) {
        int sum = 0;
        double i = 0;
        for (int n = 0; n < 9; n++) {
            i = Math.pow(2, n);
            sum += i;
        }
        System.out.println(sum);
     }
}



