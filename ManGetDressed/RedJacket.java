public class RedJacket implements Jacket {

    public RedJacket() {
    }

    @Override
    public void putOn() {
        System.out.println("Красная куртка надета");
    }

    @Override
    public void takeOff() {
        System.out.println("Красная куртка снята");
    }
}
