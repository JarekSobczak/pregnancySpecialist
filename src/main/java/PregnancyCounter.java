public class PregnancyCounter {
    public static int pregnancyCount(double yearsOlder, double yearsTo, double timesYounger) {
        return (int) Math.abs(12 * ((yearsOlder + yearsTo) - (timesYounger * yearsTo)) / (timesYounger - 1));

    }
}
