import java.util.Random;
import java.util.Scanner;

public class HadajCislo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej cislo: ");
        int cislo = scanner.nextInt();
        Random random = new Random();
        if (cislo % 2 == 0) {
            System.out.println("Cislo je par");
        } else {
            System.out.println("Cislo je nepar");
        }
    }
}
