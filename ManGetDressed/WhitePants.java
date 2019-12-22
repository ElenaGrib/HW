public class WhitePants implements Pants {

    public WhitePants() {
    }

    @Override
    public void putOn() {
        System.out.println("Белые штаны надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Белые штаны сняты");
    }
}
