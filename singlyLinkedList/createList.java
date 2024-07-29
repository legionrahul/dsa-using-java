package singlyLinkedList;

public class createList {
    listnode head;
    public class listnode
    {
        private int data;
        private listnode next;
        public  listnode(int data)
        {
            this.data=data;
            this.next=null;
        }

    }
    public static void main(String[]args)
    {
       createList sll=new createList();
       sll.head=sll.new listnode(8);
      listnode second=sll.new listnode(2);
      listnode third =sll.new listnode(12);
      listnode fourth =sll.new listnode(0);
      sll.head.next=second;
     
      second.next=third;
      third.next=fourth;

    }
    
}
