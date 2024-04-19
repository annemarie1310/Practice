package Practice;

import java.util.Scanner;

public class CountDigitsInANum {

    public static void main(String[] args) {

        int count=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        long number =sc.nextInt();

        while (number>0){
            // num = num/10;
            number/=10;
            count++;
        }
        System.out.println("number of digits in entered number is "+count);
    }

}
