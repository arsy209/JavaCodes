public class PositiveNegativeZero {

    public static void main(String[] args) {
        checkNumber(-10);
    }

    public static void checkNumber(int number) {

        if ( number > 0) {
            System.out.println("Postive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else if (number == 0) {
            System.out.println("Zero");
        }

    }
}
