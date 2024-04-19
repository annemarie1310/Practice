package Practice;

import java.util.Scanner;
/*
   eg :- num=121;

   Rev = 0;

//  logic below
{
	rev=rev*10 + num%10;
        num=num/10;
}

	rev=0*10 + 121%10  // here remainder is 1  .    so rev =10+1;  rev =11;
	num=121/10;        // quotient is 12       .   so num=12;

	rev 11*10 +121%10 // remainder =1          . so rev=110+1    rev =111;
	num=12/10;        // quotient is 1 .         so num=1;

	rev 1110 + 121%10   rem =1                 so rev =1110+1 ;rev =1111;
	num=1/10 ;          quo =0        	   so num =0 ;      // here loop will exit .

	so rev =12 ,1 ,0 ;
	so rev =12+1
	so rev =121;

	at the end num =0 the while loop will exit .
 */
public class PolindromNumber {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int number =sc.nextInt();

        int temp = number;     // here we are saving the original number into temp , cauz we are going to reverse the number.
        int rev =0;

        while(number !=0)    // here in while loop we are reversing the number
        {
            rev=rev*10 +number%10;
            number=number/10;
        }
        if(temp==rev)      // here we are checking that if is the rev number is equal to the temp stored number .
        {
            System.out.print("number is palindrom "+rev);
        }
        else{
            System.out.print("number is not palindrom "+rev);
        }


    }
}
