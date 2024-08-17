import java.util.*;

public class list_interface {
    public static void main(String args[])
    {
        System.out.println("ArrayList Operations:");
        ArrayList<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(12);
        list.add(1, 30);
        System.out.println(list);
        System.out.println(list.indexOf(30));

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(0);
        list2.add(1);
        list2.add(2);
        System.out.println(list2);



        list.addAll(0,list2);
        System.out.println("List 1"+list);


        



        Stack<Integer> stk=new Stack<>();
        System.out.println("Stack Capacity:"+ stk.capacity());
        stk.push(30);
        stk.add(0,4);
        System.out.println("Stack Value:"+stk);
        stk.addAll(list);
        System.out.println("Stack Value after  extend:"+stk);
        System.out.println("Peek Value"+stk.peek());
        System.out.println("Popped Value"+stk.pop());
        System.out.println("Stack Capacity:"+ stk.capacity());
        stk.push(31);
        stk.push(32);
        stk.push(33);
        System.out.println("Stack Capacity:"+ stk.capacity());
        
        stk.push(34);
        stk.push(35);
        System.out.println("Stack Capacity:"+ stk.capacity());

        Vector<Integer> vt=new Vector<>();
        vt.add(60);
        vt.add(30);
        vt.add(0,40);
        System.out.println("vector element:"+vt);
      
        
    }
}
