package Practice;

import java.util.Scanner;

public class NumberDivisibleBy_7and_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();

        if (number%5==0){
            System.out.println("number is divisible by 5 ");
        }
       else if (number%7==0){
            System.out.println("number is divisible by 7");
        }
        else {
            System.out.println("number is not divisible by 5 and 7");
        }




    }


}
