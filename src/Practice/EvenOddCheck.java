package Practice;

import java.util.Scanner;

public class EvenOddCheck {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num%2==0){
            System.out.println("Number is Even ");
        }
        else {
            System.out.println("number is odd ");
        }


    }


}
