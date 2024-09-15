package Prep;

import java.util.Scanner;

public class Autobiographical {

    public static int FindAutoCount(String n){
       for(int i=0;i<n.length();i++)
       {
        
       }
       return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int res=FindAutoCount(n);

      System.out.println("Count of unique No is"+res);

    }
    
}
