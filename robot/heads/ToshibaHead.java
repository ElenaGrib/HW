package by.teachmeskills.robot.heads;

public class ToshibaHead implements IHead {
    private int cost;
    private int price;

    public ToshibaHead(int cost, int price) {
        this.cost=cost;
        this.price = price;
    }

    public ToshibaHead() {
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Toshiba");
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
