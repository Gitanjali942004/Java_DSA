package Linked_List;

public class Doubly {
    
    private Node head;
    private Node tail;
    Node last;
    private int size;

    public Doubly()
    {
        this.size=0;
    }

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

        size+=1;
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

        size+=1;
    }

    public void insertbetween(int val, int index) {
        if (index == 0) {
            insertfirst(val);
            return;
        }
        if (index == size) {
            insertEnd(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next,temp.prev);

        if(temp.next!=null)
        {
           
            temp.next.prev=node;
          
        }
            node.prev=temp;
            node.next= temp.next;
            temp.next = node;

        size += 1;
    }

    public void insertAfter(int val,int After)
    {
        Node p=find(After);

        if(p==null)
        {
            System.out.println("Node Not Found");
            return;
        }

        Node node=new Node(val);
        node.next=p.next;
        if(p.next!=null)
        {
            p.next.prev=node;
        }
        node.prev=p;
        p.next=node;
      
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
            dl.insertEnd(40);
            dl.insertEnd(100);
   
            dl.display();
            dl.insertbetween(4,2);
            dl.insertAfter(8, 40);
            dl.display();
            dl.displayrev();
        }
    }

}
