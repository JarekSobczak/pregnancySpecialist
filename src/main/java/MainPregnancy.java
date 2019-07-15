import java.util.Arrays;
import java.util.Scanner;

public class MainPregnancy {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj ilość sprawdzeń ..");
            int numberOfChecks = scanner.nextInt();
        System.out.println("Podaj w kolejności: ile lat matka jest starsza od dziecka [spacja] za ile lat [spacja] ile razy dziecko będzie młodsze od matki ...");
        for (int i=1;i<=numberOfChecks;i++) {
            double[] datas = DataLoader.loadData();
            System.out.println("Długość ciąży wynosi : " + PregnancyCounter.pregnancyCount(datas[0], datas[1], datas[2]) + " miesięcy");
        }
    }
}
