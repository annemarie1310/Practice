package Practice;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        int count=0 ,l;
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        for (l=1;l<=num1;l++) {

            if (num1 % l == 0) {
                count++;
            }
        }

            if (count==2){
                System.out.println("prime");
            }
            else {
                System.out.println("not prime");
            }
        }





    }


