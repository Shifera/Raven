import java.util.Scanner;

public class Raven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] positive = {"good", "glad", "happy", "relaxed", "accomplished", "alert", "creative"};
        String[] negative = {"bad", "sad", "tired", "angry", "anxious", "hungry", "moody", "afraid"};
        System.out.println("Good morning,how are you feeling today?" + " press Q to quit");
        for (int i = 0; i <= positive.length; i++) {
            String userInput;
            userInput = input.nextLine();
            positive[i] = userInput;
            for (int j = 0; j <= negative.length; i++) {
                String negativeUserInput;
                negativeUserInput = input.nextLine();
                negative[j] = negativeUserInput;
            if (positive[i]==userInput) {
                System.out.println("I am so happy for you...Yay...");
            }else if(negative[j]==negativeUserInput)
                System.out.println("Really!, Why, tell me more!");

            else if
                (positive == negative) {
                System.out.println("Meh.");
            }
        }
        for (String x : positive) {
            System.out.println(x);
        }
        for (String y : positive) {
            System.out.println(y);
    }
            }
        }
}










