// Problem Statement:
// You and Vaibhav are good friends. Vaibhav received gift cards from his cousin. His cousin is so mischievous that he mixed some forged gift cards with the genuine ones. Now, he wants to verify whether his gift card numbers are valid or not. You happen to be great at programming so he is asking for your help!

// A valid gift card has the following characteristics:

// ► It must start with a 9, 8 or 6 .
// ► It must contain exactly 16 digits.
// ► It must only consist of digits (0-9).
// ► It may have digits in groups of 4, separated by one hyphen “-“.
// ► It must NOT use any other separator like ‘ ‘ , ‘_’, etc.
// ► It must NOT have 4 or more consecutive repeated digits.

// Input Format
// The first line of input contains an integer N.
// The next lines contain N gift card numbers.

// Output Format
// Print ‘Valid’ if the gift card number is valid. Otherwise, print ‘Invalid’. Do not print the quotes.

package Prep;

import java.util.Scanner;

public class valid_gift_card {

    public static void checkValidCard(int n,String[] giftcardNo)
    {
        for(int i=0;i<n;i++)
        {
            Scanner sc=new Scanner(System.in);
            giftcardNo[i]=sc.nextLine();

        }
        for(int i=0;i<n;i++)
        {

            if(giftcardNo[i].length()!=19||(giftcardNo[i].charAt(0)!='9' && giftcardNo[i].charAt(0)!='8' && giftcardNo[i].charAt(0)!='6')|| giftcardNo[i].charAt(4)!='-' || giftcardNo[i].charAt(9)!='-' || giftcardNo[i].charAt(14)!='-')
            {
                System.out.println("Invalid");
            }
            else
            {
                boolean status=false;
                for(int j=0;j<giftcardNo[i].length();j++)
                {
                    if((i!=4 || i!=9 || i!=14 ) &&  Character.isDigit(giftcardNo[i].charAt(j)))
                    {
                        System.out.println("valid");
                        status=true;  
                    }
                }
                if(status)
                {
                    System.out.println("Valid");
                }
                else{
                    System.out.println("Invalid");
                }
            }
        }
       
         
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        String[] giftcardNo=new String[n];

        checkValidCard(n,giftcardNo);
      
    }
}
