/* Simple if Statement */

import java.util.Scanner;

class Simple {
    public static void main(String[] args) {
        int age;

        System.out.println("Enter your age:");

        Scanner r = new Scanner(System.in);
        age = r.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible for voting");
        }

        System.out.println("Thank you");
    }
}