package Prep;
import java.util.Scanner;

public class MoveHypen {

    public static String rearrange(String str){

        String res="";

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='-')
            {
                res=str.charAt(i)+res;
            }
            else{
                res=res+str.charAt(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String result=rearrange(str);
        System.out.println("String after moving Hypen :"+result);
    }
}
