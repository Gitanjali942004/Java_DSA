package Prep;

import java.util.Scanner;

public class count_carry {
    public static int carry_generated(int num1, int num2) {
        int count = 0;
        int carry = 0;
        System.out.println("In function");

        // n1=456 //n2=245
        while (num1 != 0 && num2 != 0) {
            int d1 = num1 % 10;
            int d2 = num2 % 10;
            if ((d1 + d2 + carry) > 9) {
                count++;

                carry = (d1 + d2 + carry) / 10;
            }
            else{
                carry=0;
            }
            num1 = num1 / 10;
            num2 = num2 / 10;

        }
        while(num1!=0)
        {
            int d1 = num1 % 10;
            if((d1+carry)>9)
            {
                count++;
                carry = (d1 + carry) / 10;
            }
            else
            {
                carry=0;
            }
            num1 = num1 / 10;
        }

        while(num2!=0)
        {
            int d2 = num2% 10;
            if((d2+carry)>9)
            {
                count++;
                carry = (d2+ carry) / 10;
            }
            else
            {
                carry=0;
            }
            num2 = num2 / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int res = carry_generated(num1, num2);
        System.out.println("Total Carry Generated:" + res);
    }
}
