public class Main {
    public static void main(String[] args) {

        SpaceX spaseX1 = new SpaceX();
        Cosmodrome launchOfSpaceX1 = new Cosmodrome();
        launchOfSpaceX1.launch(spaseX1);
        System.out.println();

        Shuttle shuttle1 = new Shuttle();
        Cosmodrome launchOfShattle1 = new Cosmodrome();
        launchOfShattle1.launch(shuttle1);
        System.out.println();

    }
}


