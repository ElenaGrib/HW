import java.util.Random;

import static java.lang.System.out;

public class Shuttle implements IStart {
    Random random = new Random();

    @Override
    public boolean systemCheckOut() {
        int value = random.nextInt(11);
        return value > 3;
    }

    @Override
    public void engineStart() {
        out.println("Двигатели Шаттла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        out.println("Старт Шаттла");
    }
}
