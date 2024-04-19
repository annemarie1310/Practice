package Practice;

import java.util.Scanner;

public class PalindromString {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter you string");
        String str = sc.nextLine();
        int len =str.length()-1;
        String Org_String =str;
        String rev="";

        for (int i =len;i>=0;i--){
            rev=rev+str.charAt(i);
        }

        if(Org_String.equals(rev)){
            System.out.println("string is palindrome  "+rev);
        }
        else
            System.out.println("string is not palindrome  "+rev);

    }


}
