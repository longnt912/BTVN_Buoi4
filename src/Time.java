import java.util.Calendar;
import java.util.Date;

public class Time {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("Thoi gian hien tai:: " +now);

        Calendar c = Calendar.getInstance();
        c.setTime(now);
        c.add(Calendar.SECOND, 1);
        now = c.getTime();

        System.out.println("Thoi gian sau khi them 1s:: " +now);
    }
}
