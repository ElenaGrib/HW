package by.teachmeskills.robot.heads;

public class SamsungHead implements IHead {
    private int cost;
    private int price;

    public SamsungHead(int cost, int price) {
        this.cost = cost;
        this.price = price;
    }

    public SamsungHead() {
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Samsung");
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
