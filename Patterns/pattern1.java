package Patterns;

public class pattern1 {



                     // * 
                    // * * 
                    // * * * 
                    // * * * *
    public static void pattern2()
    {  
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    // *****
    // *****
    // *****
    // *****
    // *****
    public static void pattern1()
    {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    // *****
    // ****
    // ***
    // **
    // *
    public static void pattern3()
    {
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5

    public static void pattern4()
    {
                   
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }


    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // *

    public static void pattern5()
    {  
     
        int n = 5; // Number of lines for the upper half of the pattern and the center line

        // Print the entire pattern in a single loop
        for (int i = 1; i <= 2 * n - 1; i++) {
            int numStars = i <= n ? i : 2 * n - i;
            for (int j = 1; j <= numStars; j++) {
                System.out.print("*");
            }
            System.out.println();}
    }

//      *
//     **
//    ***
//   ****
//  *****

public static void pattern6()
    {  
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
}


    //  *****
    //   ****
    //    ***
    //     **
    //      *

public static void pattern7()
{  
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i-1;j++)
            {
                System.out.print(" ");
            }
            
            for(int j=5;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
}

    //     *
    //    ***
    //   *****
    //  *******
    // *********

    public static void pattern8()
    {  
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            
           
        }
}










    
    public static void main(String[] args) {
        System.out.println("Pattern1: ");
        pattern1();
        System.out.println("\nPattern2 ");
        pattern2();
        System.out.println("\nPattern3:");
        pattern3();
        System.out.println("\nPattern4:");
        pattern4();

        System.out.println("\nPattern5:");
        pattern5();

        System.out.println("\nPattern6:");
        pattern6();

        System.out.println("\nPattern7:");
        pattern7();

        System.out.println("\nPattern8:");
        pattern8();
    }
}
