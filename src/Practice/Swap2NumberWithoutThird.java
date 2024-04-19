package Practice;

public class Swap2NumberWithoutThird {
    public static void main(String[] args) {

        int num1=5,num2 =10;
        System.out.println("before swap "+num1+" "+num2);

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After swap "+num1+" "+num2);


    }
}
