public class BlackJacket implements Jacket {

    public BlackJacket() {
    }

    @Override
    public void putOn() {
        System.out.println("Черная куртка надета");
    }

    @Override
    public void takeOff() {
        System.out.println("Черная куртка снята");
    }
}
