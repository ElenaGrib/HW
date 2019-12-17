import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        Passenger volvo = new Passenger();
        out.println(volvo.info());
        volvo.maxKmAndFuel(10.5);
        out.println();

        Cargo scania = new Cargo();
        out.println(scania.info());
        scania.capacity(800);
        out.println();

        Military plane = new Military();
        out.println(plane.info());
        plane.bailout();
        out.println();

    }
}
