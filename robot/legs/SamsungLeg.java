package by.teachmeskills.robot.legs;

public class SamsungLeg implements ILeg {
    private int cost;
    private int price;

    public SamsungLeg(int cost, int price) {
        this.cost = cost;
        this.price = price;
    }

    public SamsungLeg() {
    }

    @Override
    public void step() {
        System.out.println("Робот Samsung сделал шаг");
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
