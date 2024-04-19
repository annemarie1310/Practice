package PatternPrograms;

public class PrintStarPatterns {
    public static void main(String[] args) {


        for (int a =1;a<=5;a++)        // for rows  ( for-loop 1)
        {

            for (int b=1;b<=a;b++)   // for columns .( for-loop 2)
            {
                System.out.print("*");
            }
            System.out.print("\n");   // this when for ( loop 2 ) terminates then it will print (\n). and then
                                                                // again it will go to for 1st for-loop
        }

        System.out.println("Pattern 2 ");

        System.out.println(" \n");
        for (int a =5;a>=1;a--)        // for rows  ( for-loop 1)
        {

            for (int b=1;b<=a;b++)   // for columns .( for-loop 2)
            {
                System.out.print("*");
            }
            System.out.print("\n");   // this when for ( loop 2 ) terminates then it will print (\n). and then
            // again it will go to for 1st for-loop
        }

        System.out.println("Pattern 3");

        System.out.println("\n");
        for (int i =1;i<=5;i++)
        {

            for (int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for (int k=i;k<=5;k++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }



    }
}
