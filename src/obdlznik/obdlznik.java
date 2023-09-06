package obdlznik;

import java.util.Scanner;

public class obdlznik {
    public static void main(String[] args) {
        System.out.printf("Co robim? S - start, Q - quit: ");
        Scanner scan = new Scanner(System.in);
        String check = scan.nextLine();
        while (true) {
            if (check.equals("s") || check.equals("S")) {
                System.out.printf("Zadaj stranu a:");
                int scanA = scan.nextInt();

                System.out.printf("Zadaj stranu b:");
                int scanB = scan.nextInt();

                System.out.printf("Cislo a "+scanA+" qcislo b " + scanB);
                break;
            }
            else if (check.equals("q") || check.equals("Q")) break;
        }
    }
    public static void vypocitajOdvod () {
        System.out.println("Ahoj");
    }

    public static void vypocitajObsah () {
        System.out.println("Ahoj");
    }
}