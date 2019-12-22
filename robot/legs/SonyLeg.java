package by.teachmeskills.robot.legs;

public class SonyLeg implements ILeg {
    private int cost;
    private int price;

    public SonyLeg(int cost, int price) {
        this.cost = cost;
        this.price = price;
    }

    public SonyLeg() {
    }

    @Override
    public void step() {
        System.out.println("Робот Sony сделал шаг");
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
