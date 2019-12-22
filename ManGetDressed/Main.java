import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        BlackJacket tomsJacket = new BlackJacket();
        WhitePants tomsPants = new WhitePants();
        YellowShoes tomsShoes = new YellowShoes();

        Person tom = new Person("Том", tomsJacket, tomsPants, tomsShoes);
        out.println(tom.getName());
        tom.putOn();
        out.println();
        tom.takeOff();

    }
}
