import java.util.Random;

public class DmvSimulator {
    public static void main(String[] args) {
        Random random = new Random();
        int userNumber = random.nextInt(100) + 1; // Random number between 1 and 100
        System.out.println("Your number is: " + userNumber);
        System.out.println("Please wait until your number is called...");

    }
}