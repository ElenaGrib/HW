import java.text.DecimalFormat;

public abstract class Vehicle {

    int power = 100; //мощность (в лошадиных силах)
    int maxSpeed = 90; //максимальная скорость (км/ч)
    int weight = 1000; //масса (кг)
    String mark = "Volvo"; //марка (например: Audi, BMW, Boing, Airbus, Scania, МАЗ и тд)
    DecimalFormat df = new DecimalFormat("###.##");

    public String info() {
        return "Мощность (лошадиных сил): " + power + "; Мощность (киловат): " + df.format(powerKV()) + "; Максимальная скорость (км/ч): " + maxSpeed + "; Масса (кг): " + weight + "; Марка: " + mark;
    }

    //расчет мощности в киловат: 1 л.с=0.74 кВ
    public double powerKV() {
        return (double) power / 0.74;
    }

}
