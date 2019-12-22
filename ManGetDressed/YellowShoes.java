public class YellowShoes implements Shoes {

    public YellowShoes() {
    }

    @Override
    public void putOn() {
        System.out.println("Желтая обувь обута");
    }

    @Override
    public void takeOff() {
        System.out.println("Желтая обувь снята");
    }
}
