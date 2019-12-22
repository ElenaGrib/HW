import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import static java.lang.System.out;

public class SpaceX implements IStart {

    public SpaceX() {

    }

    Random random = new Random();

    @Override
    public boolean systemCheckOut() {
        String currentDayOfWeek = new SimpleDateFormat("EEEE").format(new Date());
        switch (DaysOfWeek.valueOf(currentDayOfWeek.toUpperCase())) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURTHDAY:
            case FRIDAY:
                return true;
        }
        return false;
    }

    @Override
    public void engineStart() {
        out.println("Двигатели SpaceX запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        out.println("Старт SpaceX");
    }
}
