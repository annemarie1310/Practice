package Practice;

public class FibonacciSeries {
    public static void main(String[] args) {

        int a =10 , firstterm =0,seconterm=1;
        System.out.println("fibonacci series ");

        for (int i=1;i<=a;i++) {
            System.out.println(firstterm + ", ");

            // next term
            int nextTerm = firstterm + seconterm;
            firstterm = seconterm;
            seconterm = nextTerm;
        }
    }
}
