import java.util.Random;

public class DmvSimulator {
    public static void main(String[] args) {
        Random random = new Random();
        int userNumber = random.nextInt(100) + 1; // Random number between 1 and 100
        System.out.println("Your number is: " + userNumber);
        System.out.println("Please wait until your number is called...");
        // Start calling numbers, beginning from the next number after user's
        int currentNumber = (userNumber % 100) + 1;

        while (currentNumber != userNumber) {
            System.out.println("Calling number: " + currentNumber);
            currentNumber = (currentNumber % 100) + 1; // Wrap around after 100
        }

        // Finally, call the user's number last
        System.out.println("Calling number: " + userNumber);
        System.out.println("WRONG PAPERS STUPID! GET OUT!");
    }
}