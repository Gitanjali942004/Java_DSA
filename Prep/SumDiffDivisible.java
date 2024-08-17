package Prep;

import java.util.Scanner;
import java.lang.Math;

public class SumDiffDivisible {
    public static int differenceofSum(){
    
        int n,m,ndiv=0,div=0;
        Scanner in=new Scanner(System.in);

        System.out.print("Enter Value for n:");
        n=in.nextInt();
        System.out.print("Enter Value for m:");
        m=in.nextInt();
        
        for(int i=1;i<=m;i++){
            if(i%n==0){
                div+=i;
            }
            else{
                ndiv+=i;
            }
        }
        return Math.abs(div-ndiv);
    }
    public static void main(String[] args) 
    {
        System.out.println("Sum Difference is "+differenceofSum());
    }
   
}
