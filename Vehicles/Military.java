public class Military extends Air {

   private boolean bailoutSystem = false; //наличие систем катапультирования (true/false)
   private int numberOfMissilesOnBoard = 0; //количество ракет на борту

    public String info() {
        return "Мощность (лошадиных сил): " + power + "; Мощность (киловат): " + df.format(powerKV()) + power + "; Максимальная скорость (км/ч): " + maxSpeed + "; Масса (кг): " + weight + "; Марка: " + mark +
                "; Размах крыльев: " + wingspan + "; Минимальная длина взлетно-посадочной полосы для взлета: " + minimumLengthOfTheRunway +
                "; Наличие систем катапультирования (true/false): " + bailoutSystem + "; Количество ракет на борту: " + numberOfMissilesOnBoard;
    }

    public void shot() {
        if (numberOfMissilesOnBoard != 0) {
            System.out.println("Ракета пошла...");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void bailout() {
        if (bailoutSystem) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }

}