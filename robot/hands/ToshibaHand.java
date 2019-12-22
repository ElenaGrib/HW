package by.teachmeskills.robot.hands;

public class ToshibaHand implements IHand {
    private int cost;
    private int price;

    public ToshibaHand(int cost, int price) {
        this.cost = cost;
        this.price = price;
    }

    public ToshibaHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Робот Toshiba поднял руку");
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
