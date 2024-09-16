package Linked_List;

public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.next = next;
        }
    }

    public void insert(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            tail = node;
            node.next = head;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.val + "->");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println("HEAD");

    }

    public int delete(int val)
    {
        Node temp=head;

        if(head==null)
        {
            return -1;
        }
        do{
            Node n=temp.next;

            if(n.val==val)
            {
                temp.next=n.next;
                return val;
            }
            temp=temp.next;

        }while(temp!=head);
        return 0;

    }

    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.display();
        System.out.println(list.delete(40)+"is deleted");
        list.display();
    }
}
