import java.util.Objects;
import java.util.Scanner;
public class ZooManagement {
    public static void main(String[] args) {
        byte nbrcages = 20;
        String ZooName = "MyZOO";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("How many cages are there in the Zoo ? : ");
            nbrcages = Byte.parseByte(scanner.nextLine());
        } while (nbrcages <= 0 || nbrcages > 25);
        do {
            System.out.println("What is the name of the zoo ? : ");
            ZooName = scanner.nextLine();
        } while (Objects.equals(ZooName, ""));

        System.out.println(ZooName + " comport " + nbrcages + " cages.");
    }
}