package file;
class LLEVENODD
{
    Node head;

    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }


    public void push(int new_data)
    {


        Node new_node = new Node(new_data);


        new_node.next = head;

        head = new_node;
    }




    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }
    Node even=null,evenh;
    Node odd=null,oddh;
    public void segregate(){
        segregate(head);
    }
    public void segregate(Node node){
        while(node!=null){

            if(node.data%2!=0) {
               oddh=node;
                oddh.next=odd;
                odd=oddh;
                node = node.next;
            }
        else{

            node.next=even;
            even=node;
            node=node.next;

        }


    }
        System.out.println();
       // System.out.println("here");
        while(odd!=null) {
            System.out.println(odd.data);
            odd = odd.next;
        }
//        Node tnode = even;
//        while (tnode != null)
//        {
//            System.out.print(tnode.data+" ");
//            tnode = tnode.next;
//        }
//        Node tnode1 = odd;
//        while (tnode1 != null)
//        {
//            System.out.print(tnode1.data+" ");
//            tnode1 = tnode1.next;
//        }
    }


    public static void main(String[] args)
    {
        /* Start with the empty list */
        LLEVENODD llist = new LLEVENODD();

      //  llist.append(6);

        llist.push(31);

        llist.push(26);

        llist.push(24);

        llist.push(22);

        llist.push(21);

        llist.push(18);

        llist.push(15);

        llist.push(16);
        llist.push(19);


        llist.push(17);


        llist.push(13);


   //     llist.append(4);

     //   llist.insertAfter(llist.head.next, 8);

        System.out.println("\nCreated Linked list is: ");
        llist.printList();
        llist.segregate();
    }
}