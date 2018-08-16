package Trees;
import java.util.ArrayList;
import java.util.Scanner;

public class BinaryTree {
    Node root;
    int size;

    public BinaryTree() {
        // TODO Auto-generated constructor stub
        Scanner s=new Scanner(System.in);
        root=takeInput(s,null,false);
    }
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int data,Node left,Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }

    }
    private Node takeInput(Scanner sc,Node parent,boolean isLeftOrRight){
        if(parent == null){
            System.out.println("Enter the data for the root node");
        }
        else {
            if(isLeftOrRight){
                System.out.println("Enter the left child of "+parent.data);
            }
            else{
                System.out.println("Enter the left child of "+parent.data);
            }
        }
        int data=sc.nextInt();
        Node newNode=new Node(data,null,null);

        boolean choice;

        System.out.println("Do you have left child for "+newNode.data);
        choice=sc.nextBoolean();
        if(choice){
            newNode.left=takeInput(sc,newNode,true);
        }

        System.out.println("Do you have right child for "+newNode.data);
        choice=sc.nextBoolean();
        if(choice){
            newNode.right=takeInput(sc,newNode,false);
        }
        return newNode;
    }

    public void display(){
        display(root);

    }
    public void display(Node node){
        if(node!= null){
            if(node.left!=null){
                System.out.print(node.left.data+"=>");
            }
            else{
                System.out.print("END=>");
            }
            System.out.print(node.data);
            if(node.right!=null){
                System.out.print("<="+node.right.data);
            }
            else{
                System.out.print("<=END");
            }
            System.out.println();
            if(node.left!= null){
                display(node.left);
            }
            if(node.right!= null){
                display(node.right);
            }
        }
    }
    public int height(){
        return height(root);

    }
    private int height(Node node){

      int countl=1,countr=1;
        if(node==null){
            return -1;
        }
        else{
            if(node.left!=null){

                countl=countl+height(node.left);
            }
            else if(node.right!=null){

                countr=countr+height(node.right);
            }
        }
        return (countl>countr?countl:countr);
    }
    public int max(){
       return max(root);
    }
    private int max(Node node){
        if(node==null){
            return Integer.MIN_VALUE;
        }
        else{
            int lMax=max(node.left);
            int rMax=max(node.right);
            return Math.max(node.data, Math.max(lMax,rMax));
        }
    }
    public int size(){
        return size(root);
    }
    private int size(Node node){
        if(node==null){
            return 0;
        }

          int  lsize=size(node.left);
           int rsize=size(node.right);
           return lsize+rsize+1;

    }

//    private Node findNode1(Node node,int d1){
//        if(node==null){
//            return null;
//        }
//
//            if (node.data == d1) {
//                return node;
//            }
//             findNode1(node.left, d1);
//            findNode1(node.right,d1);
//
//        return node;
//
//    }
//    private Node findNode2(Node node,int d2){
//        if(node==null){
//            return null;
//        }
//
//        if (node.data == d2) {
//            return node;
//        }
//        findNode1(node.left, d2);
//        findNode1(node.right,d2);
//
//        return node;
//    }
//    public int lcal(int d1,int d2){
//       Node first= findNode1(root,d1);
//      Node second=  findNode2(root,d2);
//
//      if(first.left==second||first.right==second){
//          System.out.println(first+"is the ancestor");
//          return first.data;
//      }
//      else if(second.left==first||second.right==first){
//          System.out.println(second+" is the ancestor");
//          return second.data;
//      }
//      else{
//
//      }
//
//
//    }

    public boolean inLeft(Node node,int d1){
       //Node node=root;

        if(node.left==null){
            return false;
        }
        if(node.left.data==d1){
            return true;
        }
        return inLeft(node.left,d1);


    }
    public boolean inRight(Node node,int d1){
        //Node node=root;
        if(node.right==null){
            return false;
        }
        if(node.right.data==d1){
            return true;
        }
        return inRight(node.right,d1);
    }

    public int lca(int d1,int d2){
        return lca(root,d1,d2);
    }
    private int lca(Node node,int d1,int d2){
        if(inLeft(node,d1)&&inLeft(node,d2)){
           return lca(node.left,d1,d2);
        }
        else if(inRight(node,d1)&&inRight(node,d2)){
           return lca(node.right,d1,d2);

        }
        return node.data;
    }
    public int diameter(){
        ArrayList<Integer> al=new ArrayList<>();
        return diameter(root,al);

    }
    private int diameter(Node node,ArrayList al){

        if(node==null){
            return -2;
        }
        int llength=1,rlenght=1;
         llength=llength+diameter(node.left,al);
         rlenght=rlenght+diameter(node.right,al);

         al.add(llength);
        al.add(rlenght);


return 0;
    }
}