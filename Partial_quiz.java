import java.util.*;

public class Partial_quiz {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int score = 0;
        int ans;

        System.out.println("1. Which keyword is used to create a class in Java?");
        System.out.println("1. function");
        System.out.println("2. class");
        System.out.println("3. define");
        System.out.println("4. object");

        System.out.print("Enter Answer: ");
        ans = sc.nextInt();

        if (ans == 2) {
            System.out.println("Correct Answer");
            score++;
        } else {
            System.out.println("Incorrect Answer!!");
            System.out.println("Correct Answer is: class");
        }

        System.out.println("Final Score = " + score);
    }
}