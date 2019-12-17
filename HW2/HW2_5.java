//5)Напишите программу печати таблицы перевода расстояний из дюймов в
//сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см

public class HW2_5 {
    public static void main(String[] args) {
        final double d = 2.54;
        for (int i = 1; i < 21; i++) {
            System.out.println("Дюймы: " + i + "; Сантиметры: " + d * i + ".");
        }

     }
}



