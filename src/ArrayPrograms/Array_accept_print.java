package ArrayPrograms;

import java.util.Scanner;

public class Array_accept_print {
    public static void main(String[] args) {

        int  sum =0;

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int arr[]=new int[size];

        System.out.println("enter you numbers");
        for (int a=0;a<size;a++){
             arr[a]=sc.nextInt();
        }

        for (int b=0;b<size;b++){
            System.out.print(arr[b]+", ");
        }

        for (int b=0;b<size;b++){
             sum =sum+arr[b];
            System.out.print(arr[b]+", ");
        }
        System.out.println("\n"+sum);




    }
}
