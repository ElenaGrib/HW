//7) (Дополнительно) В переменную записываете количество программистов. В
//зависимости от количества программистов необходимо вывести правильно
//окончание. Например:
//• 2 программиста
//• 1 программиста
//• 10 программистов
//• и т.д.

public class HW1_7 {
  public static void main(String[] args){
        double a = 41;

        if (a < 0) {
            System.out.println("ERROR");
        }
        if (a == 1) {
            System.out.println(a + " программист");

        } else if (a == 1) {
            System.out.println(a + " программистов");
        } else if (a % 10 == 1) {
            System.out.println(a + " программист");
        } else if (a % 10 > 1 && a % 10 < 5) {
            System.out.println(a + " программиста");
        } else {
            System.out.println(a + " программистов");
        }
   }
 }