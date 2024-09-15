// – At least 4 characters
// – At least one numeric digit
// – At Least one Capital Letter
// – Must not have space or slash (/)
// – Starting character must not be a number

package Prep;
import java.util.Scanner;

public class PasswordChecker {
    public static boolean checkPassword(String pass){
        int digit=0;
        int cap=0;
        int charcnt=0;

        if(pass.charAt(0)>=48 && pass.charAt(0)<=58)
        {
            return false;
        }
        for(int i=0;i<pass.length();i++)
        {
            if(pass.charAt(i)==' '|| pass.charAt(i)=='/')
            {
                return false;
            }
            else
            {
                if(pass.charAt(i)>=48 && pass.charAt(i)<=58)
                {
                    digit++;
                }
                else if((pass.charAt(i)>=65 && pass.charAt(i)<=90) || (pass.charAt(i)>=97 && pass.charAt(i)<=122))
                {
                    charcnt++;
                    if((pass.charAt(i)>=65 && pass.charAt(i)<=90))
                    {
                        cap++;
                    }
                }

            }

            if(digit>=1 && cap>=1 && charcnt>=4)
            {
                return true;
            }
           
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String password=sc.nextLine();

        boolean res=checkPassword(password);

        System.out.println("Password is Valid"+res);
    }
}
