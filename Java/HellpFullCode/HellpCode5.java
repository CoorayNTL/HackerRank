import java.time.LocalDate;

public class HellpCode5 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Parses the date
        final LocalDate dt = LocalDate.parse("2018-11-27");

        // Prints the day
        System.out.println(dt.getDayOfWeek());
    }
}
