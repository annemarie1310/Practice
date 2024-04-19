package Practice;

import java.util.Scanner;

public class SquareCubeOfNum {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int number =sc.nextInt();

        int Square =number*number;
        System.out.println("square "+Square);

        int Cube=number*number*number;
        System.out.println("cube is  "+Cube);

    }


}
