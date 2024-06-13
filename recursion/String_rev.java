package recursion;

public class String_rev {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};

        reverse(s, 0,s.length-1);

        System.out.println(s);
    }

    private static void reverse(char[] s,int left,int right)
    {
        if(left<right)
        {
           char temp=s[left];
           s[left]=s[right];
           s[right]=temp;
           reverse(s,left+1,right-1);
        }
    }
}
