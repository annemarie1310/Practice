package Practice;

public class Swap2NumberUsingThird {

    public static void main(String[] args) {

        int num1=5,num2 =10;
        System.out.println("before swap "+num1+" "+num2);

        int swap=num1;
        num1=num2;
        num2=swap;
        System.out.println("after swap "+num1+" "+num2);


    }
}
