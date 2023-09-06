import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class arrays {
    public static void main(String[] args) {
        ArrayList<Double> cislaArr = new ArrayList<Double>();
        double cislo = 0;
        Scanner scan = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("Zadaj cislo: ");
                cislo = scan.nextDouble();
                if(cislo > 0) {
                    cislaArr.add(cislo);
                }
                else {
                    double sum = 0;
                    for (Double i : cislaArr) {
                        sum += i;
                    }
                    System.out.print("Sucet: " + zaokhliFunc(sum));
                    break;
                }
            }
            catch (Exception e) {
                System.out.print("Chyba!");
                break;
            }

        }
    }

    public static double zaokhliFunc(double sum) {
        return Math.round(sum * 100.0) / 100.0;
    }
    @Test
    public void test() {
        assertEquals(1,zaokhliFunc((1.0)));
    }
}
