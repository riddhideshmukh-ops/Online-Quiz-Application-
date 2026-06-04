import java.util.*;

class Quiz {

    int score = 0;

    void question1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Which keyword is used to create a class in Java?");
        System.out.println("1. function");
        System.out.println("2. class");
        System.out.println("3. define");
        System.out.println("4. object");

        System.out.print("Enter Answer: ");
        int ans = sc.nextInt();

        if (ans == 2) {
            System.out.println("Correct Answer");
            score++;
        } else {
            System.out.println("Incorrect Answer");
        }
    }

    void question2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n2. Which method is the entry point of a Java program?");
        System.out.println("1. start()");
        System.out.println("2. run()");
        System.out.println("3. main()");
        System.out.println("4. execute()");

        System.out.print("Enter Answer: ");
        int ans = sc.nextInt();

        if (ans == 3) {
            System.out.println("Correct Answer");
            score++;
        } else {
            System.out.println("Incorrect Answer");
        }
    }

    void question3() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n3. Which package contains Scanner class?");
        System.out.println("1. java.io");
        System.out.println("2. java.util");
        System.out.println("3. java.net");
        System.out.println("4. java.lang");

        System.out.print("Enter Answer: ");
        int ans = sc.nextInt();

        if (ans == 2) {
            System.out.println("Correct Answer");
            score++;
        } else {
            System.out.println("Incorrect Answer");
        }
    }

    void question4() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n4. Which data type is used to store whole numbers?");
        System.out.println("1. float");
        System.out.println("2. char");
        System.out.println("3. int");
        System.out.println("4. boolean");

        System.out.print("Enter Answer: ");
        int ans = sc.nextInt();

        if (ans == 3) {
            System.out.println("Correct Answer");
            score++;
        } else {
            System.out.println("Incorrect Answer");
        }
    }

    void displayScore() {
        System.out.println("\nFinal Score = " + score + "/4");
    }
}

public class Onlinequiz {

    public static void main(String[] args) {

        Quiz q = new Quiz();

        q.question1();
        q.question2();
        q.question3();
        q.question4();

        q.displayScore();
    }
}