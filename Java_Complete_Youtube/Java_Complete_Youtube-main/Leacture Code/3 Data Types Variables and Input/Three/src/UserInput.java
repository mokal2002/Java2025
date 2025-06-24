import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Good Morning " + name);
        System.out.print(name + ", Also tell me your age:");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("Your are adult my friend " + age);
        }else {
            System.out.println("You are minor my friend " + age);
        }
        }
    }

