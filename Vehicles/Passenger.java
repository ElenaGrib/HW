public class Passenger extends Ground {

    private String bodyType; //тип кузова
    private int numberOfPassengersForPassenger = 0; //кол-во пассажирова

    public String info() {
        return "Мощность (лошадиных сил): " + power + "; Мощность (киловат): " + df.format(powerKV()) + "; Максимальная скорость (км/ч): " + maxSpeed + "; Масса (кг): " + weight + "; Марка: " + mark +
                "; Количество колес: " + numberOfWheels + "; Расход топлива (л/100 км): " + fuelConsumption +
                "; Тип кузова: " + bodyType + "; Количество пассажиров: " + numberOfPassengersForPassenger;
    }

    /*метод, который принимает время и считает сколько километров проедет машина двигаясь с макс скоростью и сколько топлива
    она израсходует за это время. Результат вывести в консоль, расчет израсходуемого топлива вынести в отдельный метод private*/
    public void maxKmAndFuel(double time) {
        double maxKm = maxSpeed * time;
        System.out.println("За время " + df.format(time) + " ч, автомобиль " + mark + ", двигаясь с максимальной скоростью " + df.format(maxSpeed) +
                " км/ч, проедет " + maxKm + " км и израсходует " + df.format(fuel(maxKm)) + " литров топлива");
    }

    //расчет израсходуемого топлива
    private double fuel(double maxKM) {
        return fuelConsumption * maxKM / 100;
    }

}