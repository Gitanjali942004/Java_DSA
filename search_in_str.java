import java.util.Arrays;

public class search_in_str {
    public static void main(String[] args) {
        
        String name="Gitanjali";
        char target='j';
        System.out.println(search_char(name,target));
        System.out.println(search_char2(name,target));
        
    }

    static int search_char(String n,char t)
    {
        for(int i=0;i<n.length();i++)
        {
            if(n.charAt(i)==t)
            {
                return i;
            }
        }
       return -1;
    }

    static boolean search_char2(String n,char t)
    {
        for(char c : n.toCharArray())
        {
            if(c==t)
            {
                return true;
            }
        }
       return false;
    }
}
