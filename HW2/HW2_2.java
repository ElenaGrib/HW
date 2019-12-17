//2)Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//сколько амеб будет через 3, 6, 9, 12,..., 24 часа.

public class HW2_2 {
    public static void main(String[] args) {
        double oneRound = 0;
        for (int n = 1; n < 9; n++) {
            oneRound = Math.pow(2, n);
            System.out.println("Время (часы): " + n * 3 + "; Количество амеб: " + oneRound);
        }

}
}



