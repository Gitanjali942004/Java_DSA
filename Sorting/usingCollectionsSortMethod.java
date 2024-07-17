import java.util.ArrayList;
import java.util.Collections;

public class usingCollectionsSortMethod {
    public static void main(String[] args) {
        ArrayList<String> lst=new ArrayList<>();
        lst.add("I");
        lst.add("am");
        lst.add("Gitanjali");
        lst.add("Bhintade");

        Collections.sort(lst);
        

        System.out.println("List after Sort"+lst);
    }
}
