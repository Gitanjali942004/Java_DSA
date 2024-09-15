package Linked_List;

public class Doubly {
    
    private Node head;
    private Node tail;
    Node last;

    public void insertfirst(int val)
    {
        Node node=new Node(val);

        if(head==null)
        {
            head=node;
            head.prev=null;
            head.next=null;
            return;
        }

        node.next=head;
        head.prev=node;
        node.prev=null;
        head=node;
    }

    public void insertEnd(int val)
    {
        Node node=new Node(val);
        if(head==null)
        {
            node.prev=null;
            head=node;
            return;
        }
        Node temp=head;
        
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=node;
        node.next=null;
        node.prev=temp;
    }


    public void display()
    {
        Node temp=head;
        
        while(temp!=null)
        {
            System.out.print(temp.val+"->");
            last=temp;
            temp=temp.next;
        }
        System.out.println("End");
    }

    public void displayrev()
    {
        while(last!=null)
        {
            System.out.print(last.val+"->");
            last=last.prev;
        }
        System.out.println("End");
    }

    private class Node {
    
        int val;
        Node prev;
        Node next;
        
        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next,Node prev) {
            this.val = val;
            this.prev=prev;
            this.next = next;
        }
        

        public static void main(String[] args) {
            Doubly dl=new Doubly();
            dl.insertfirst(20);
            dl.insertfirst(30);
            dl.insertEnd(50);
   
            dl.display();
            dl.display();
            dl.displayrev();
        }
    }

}
