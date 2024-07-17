package Linked_List;

public class Singly {
    

    class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
        public Node(int data,Node next)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    Node tail=null;


    public void addNode(int data)
    {
        Node newnode=new Node(data);

        if(head==null)
        {
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
       
    }

    public void insert_Start(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
      
    }
    public void display()
    {
        Node temp=head;
        System.out.println("Linked list Elements are:");
        while(temp!=null)
        {
           System.out.print(temp.data+"->");
           temp=temp.next;
        }
        System.out.println("NULL");
    }

    public void delete(int key)
    {
        if(head.data==key)
            {
                System.out.println(key+"is deleted");
                head=head.next;
                return;
            }
        Node current=head;
        Node prev=null;
        while(current!=null)
        {
            if(current.data==key)
            {
                System.out.println(key+"is deleted");
                 prev.next=current.next;
                 break;
            }
            else
            {
                prev=current;
                current=current.next;
            }
            }
            
        }

        public void insertBetween(int data, int loc) {
            if (loc < 1) {
                throw new IllegalArgumentException("Location should be 1 or greater");
            }
            if (loc == 1) {
                insert_Start(data);
                return;
            }
    
            Node temp = head;
            for (int i = 1; i < loc - 1; i++) {
                if (temp == null) {
                    throw new IndexOutOfBoundsException("Location is out of bounds");
                }
                temp = temp.next;
            }
    
            if (temp == null) {
                throw new IndexOutOfBoundsException("Location is out of bounds");
            }
    
            Node newNode = new Node(data, temp.next);
            temp.next = newNode;
        }

    public static void main(String[] args) {
       Singly sl=new Singly();
       sl.addNode(12);
        sl.addNode(23);
        sl.addNode(40);
        sl.addNode(45);
        sl.insert_Start(90);
        sl.display();
        sl.delete(90);
        sl.insertBetween(102, 4);
        sl.display();
    }
}
