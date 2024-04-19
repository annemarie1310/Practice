package Practice;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int temp,rem,sum=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int number =sc.nextInt();

        temp=number;
        while (number>0){
            rem=number%10;
            sum=sum+(rem*rem*rem);
            number=number/10;
        }
        if (temp==sum){
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("not a Armstrong number");
        }



    }


}
