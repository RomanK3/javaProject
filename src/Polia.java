public class Polia {

    public static void main(String[] args) {
        int count = 1;

        for (int i = 1; i <= 25; i++) {
            System.out.print(count + "\t");

            if (i % 5 == 0) {
                System.out.println();
            }

            count *= 2;

        }
    }
}
