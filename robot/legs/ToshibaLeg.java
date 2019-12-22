package by.teachmeskills.robot.legs;

public class ToshibaLeg implements ILeg {
    private int cost;
    private int price;

    public ToshibaLeg(int cost, int price) {
        this.cost = cost;
        this.price = price;
    }

    public ToshibaLeg() {
    }

    @Override
    public void step() {
        System.out.println("Робот Toshiba сделал шаг");
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
