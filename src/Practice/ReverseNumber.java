package Practice;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        long reversed =0;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        long number1 =sc.nextInt();

        while (number1!=0){
            // get last digit from num
            long digit =number1%10;
            reversed =reversed*10+digit;

            //remover the last digit from num
            number1/=10;

        }
        System.out.println("reversed number is "+reversed);




    }
}
