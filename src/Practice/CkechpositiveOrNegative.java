package Practice;

import java.util.Scanner;

public class CkechpositiveOrNegative {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        if (num1 < 0) {
            System.out.println("Number is Negative ");
        } else {
            System.out.println("number is Positive ");
        }

    }
}
