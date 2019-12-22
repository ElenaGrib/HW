package by.teachmeskills.robot.heads;

public class SonyHead implements IHead {
    private int cost;
    private int price;

    public SonyHead(int cost, int price) {
        this.cost = cost;
        this.price = price;
    }

    public SonyHead() {
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Sony");
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
