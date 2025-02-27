import java.util.Random;

public class DmvSimulator {
    public static void main(String[] args) {
        Random random = new Random();
        int userNumber = random.nextInt(200) + 1;
        System.out.println("Your number is: " + userNumber);
        System.out.println("Please wait until your number is called...");
        
        int currentNumber = (userNumber % 200) + 1;

        while (currentNumber != userNumber) {
            System.out.println("Calling number: " + currentNumber);
            currentNumber = (currentNumber % 200) + 1; // 
        }

        
        System.out.println("Calling number: " + userNumber);
        System.out.println("Sorry, you dont have the required paperwork.");
    }
}