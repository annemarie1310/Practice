package ArrayPrograms;

import java.util.Scanner;

public class Print_oddPosition_numbersOf_array {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();

        int array[] =new int[size];
        System.out.println("enter your numbers ");
        for (int a=0;a<size;a++){
            array[a]=sc.nextInt();
        }


        System.out.println("Odd position elements");
        for (int b=1;b<size;b+=2){
            System.out.println(array[b]);
        }


        System.out.println("Even position elements");
        for (int b=0;b<size;b+=2){
            System.out.println(array[b]);
        }
    }
}
