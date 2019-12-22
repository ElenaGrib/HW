package by.teachmeskills.robot.hands;

public class SonyHand implements IHand {
    private int cost;
    private int price;

    public SonyHand(int cost, int price) {
        this.cost = cost;
        this.price = price;
    }

    public SonyHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Робот Sony поднял руку");
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
