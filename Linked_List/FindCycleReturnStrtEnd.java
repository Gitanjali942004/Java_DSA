package Linked_List;
class Node{
    int num;
    Node next;
    Node(int n){
        this.num=n;
        this.next=null;
    }}
public class FindCycleReturnStrtEnd 
{

     
   
    static void findcycle(Node n) {
        Node next = n;
        Node head = n;
        Node fast = n;
        Node slow = n;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                Node start = n;
                while (start != slow) {
                    start = start.next;
                    slow = slow.next;
                }
                System.out.println("start is" + start.num);
                Node end = start;
                while (end.next != start) {
                    end = end.next;
                }
                System.out.println(end.num);

            }

        }
        System.out.println("Cycle not present");
        // System.out.println("start is"+ start.val);
        // System.out.println(end.val);
    }

    public static void main(String[] args) {

        Node n = new Node(7);
        n.next = new Node(2);
        n.next.next = new Node(0);
        n.next.next.next = new Node(-4);
        n.next.next.next.next = new Node(3);
        n.next.next.next.next.next = n.next;

        findcycle(n);
    }
}