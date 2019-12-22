public class LilacPants implements Pants {

    public LilacPants() {
    }

    @Override
    public void putOn() {
        System.out.println("Сиренывые штаны надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Сиренывые штаны сняты");
    }
}
