public class Cargo extends Ground {

    double carryingCapacity = 0; //грузоподъемность (т)

    public String info() {
        return "Мощность (лошадиных сил): " + power + "; Мощность (киловат): " + df.format(powerKV()) + "; Максимальная скорость (км/ч): " + maxSpeed + "; Масса (кг): " + weight + "; Марка: " + mark +
                "; Количество колес: " + numberOfWheels + "; Расход топлива (л/100 км): " + fuelConsumption +
                "; Грузоподъемность: " + carryingCapacity;
    }

    //метод, который проверяет можно ли загрузить в него xxx груза
    public void capacity(double kg) {
        if (carryingCapacity >= kg) {
            System.out.println("Вам нужен грузовик побольше");
        } else {
            System.out.println("Грузовик загружен");
        }
    }


}