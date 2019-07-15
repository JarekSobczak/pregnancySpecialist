import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DataLoader {

    public static double[] loadData() {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String[] array = text.split(" ");
        double[] doubleArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            doubleArray[i] = Double.parseDouble(array[i]);
        }
        return doubleArray;
    }
}
