public class Civil extends Air {

    private int numberOfPassengersForCivil = 150; //кол-во пассажирова
    private boolean businessClass; //наличие бизнес класса (true/false)

    public String info() {
        return "Мощность (лошадиных сил): " + power + "; Мощность (киловат): " + df.format(powerKV()) + "; Максимальная скорость (км/ч): " + maxSpeed + "; Масса (кг): " + weight + "; Марка: " + mark +
                "; Размах крыльев: " + wingspan + "; Минимальная длина взлетно-посадочной полосы для взлета: " + minimumLengthOfTheRunway +
                "; Количество пассажров: " + numberOfPassengersForCivil + "; Наличие бизнес класса (true/false): " + businessClass;
    }

    //метод, который проверяет вместимость пассажиров
    public void capacity(double kg) {
        if (numberOfPassengersForCivil >= kg) {
            System.out.println("Вам нужен самолет побольше");
        } else {
            System.out.println("Самолет загружен");
        }
    }

}