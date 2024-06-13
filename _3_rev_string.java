public class _3_rev_string {
    
    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        reverse(s);
        System.out.println(s);
        
    }
    public static void reverse(char [] s)
    {
        for(int i=0;i<s.length/2;i++)
        {
            char temp=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=temp;
        }
    }
}
