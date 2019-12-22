public class Cosmodrome {

    public void launch(IStart iStart) {
        if (iStart.systemCheckOut()) {
            iStart.engineStart();
            System.out.println("Обратный отсчет:");
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
            }
            iStart.start();
        } else {
            System.out.println("Проверка провалена");

        }


    }
}