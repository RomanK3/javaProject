public class Fizz {
    public static void main(String[] args) {
        String fizzbuzz = "";

        for (int i = 1; i < 40; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                fizzbuzz += "Fizz, ";
            } else if (i % 5 == 0 && i % 3 != 0) {
                fizzbuzz += "Buzz, ";
            } else if (i % 3 == 0 && i % 5 == 0) {
                fizzbuzz += "FizzBuzz, ";
            } else if (i % 3 != 0 && i % 5 != 0) {
                fizzbuzz += String.valueOf(i) + ", ";
            }
        }

        fizzbuzz = fizzbuzz.substring(0, fizzbuzz.length() - 2);
        System.out.println(fizzbuzz);
    }
}
