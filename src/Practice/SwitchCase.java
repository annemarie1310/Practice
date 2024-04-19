package Practice;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a your age");
        int age = sc.nextInt();


        if (age < 18) {
            System.out.println("Child and cannot vote");
        }
        else{
            System.out.println("can vote ");
        }

    }
}
