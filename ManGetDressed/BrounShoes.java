public class BrounShoes implements Shoes {

    public BrounShoes() {
    }

    @Override
    public void putOn() {
        System.out.println("Коричневая обувь обута");
    }

    @Override
    public void takeOff() {
        System.out.println("Коричневая обувь снята");
    }
}
