package Prep;

import java.util.Scanner;

public class replaceString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch1=sc.next().charAt(0);
        char ch2=sc.next().charAt(0);

        String newstr=modifyString(str,ch1,ch2);
        System.out.println(newstr);
    }

    private static String modifyString(String str, char ch1, char ch2) {
        String newstr="";
        if(str.length()==0)
        {
            return null;
        }

        else{
            if(ch1==ch2)
            {
                return str;
            }
            else
            {
                for(int i=0;i<str.length();i++)
                {
                    if(str.charAt(i)==ch1)
                    {
                        newstr=newstr+ch2;
                    }
                    else if(str.charAt(i)==ch2)
                    {
                        newstr=newstr+ch1;
                    }
                    else
                    {
                        newstr=newstr+str.charAt(i);
                    }
                }
            }
        }
        return newstr;
    }
}
