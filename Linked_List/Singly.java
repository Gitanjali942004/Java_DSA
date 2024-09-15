package Linked_List;

public class Singly {

    private Node head;
    private Node tail;
    private int size;

    public Singly() {
        this.size = 0;
    }

    private class Node {
        private int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);

        node.next = head;
        head = node;
        if (tail == null) {
            tail = node;
        }
        size += 1;
    }

    public void insertLast(int val) {
        // if (tail == null) {
        //     insertFirst(val);
        //     return;
        // }

        // Node node = new Node(val);
        // tail.next = node;
        // tail = node;
        // size += 1;


        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
            
        }
        Node node=new Node(val);
        temp.next=node;
        node.next=null;

    }

    public void insertbetween(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);

        temp.next = node;
        size += 1;
    }

    public int deletefirst() {
        int val = head.val;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;

        return val;
    }

    public int deletelast() {

        if (size <= 1) {
            return deletefirst();
        }
        Node SecondLast = get(size - 2);
        int val = tail.val;
        SecondLast.next = null;
        tail = SecondLast;

        return val;

    }

    public int deleteBetween(int index) {
        if (index == 0) {
            return deletefirst();
        }
        if (index == size - 1) {
            return deletelast();
        }

        Node prev = get(index - 1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        size--; // Decrease the size after deletion
        return val;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public Node find(int value) {
        Node temp = head;
       while(temp!=null)
       {
          if(temp.val==value)
          {
            return temp;
          }
          temp=temp.next;
       }
        return null;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("End");
    }


    public static void main(String[] args) {
        Singly s = new Singly();
        s.insertFirst(10);
        s.insertFirst(20);
        s.insertFirst(30);
        s.insertFirst(40);
        s.insertLast(50);
        s.insertbetween(80, 2);
        s.insertbetween(90, 6);
        s.insertLast(100);
        s.display();
        System.out.println(s.deleteBetween(3));

        s.display();
        System.out.println(s.deletefirst() + "deleted");
        System.out.println(s.deletelast() + " deleted from last");
        System.out.println();
        s.display();
       
    }
}
