package Trees;

public class BST {
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
    Node root;
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
    public void add(int data){
      this.root= add(root,data);
    }
    private Node add(Node node,int data){
        if(node==null){
            node=new Node(data,null,null);
            return node;

        }
        if(node.data>data){
            node.left=add(node.left,data);
        }
        else if(node.data<data){
            node.right=add(node.right,data);
        }
    return node;
    }
    public int max(){
        return max(root);
    }
    private int max(Node node){
        if(node.right==null){
            return node.data;
        }
        return max(node.right);

    }
    public int min(){
        return min(root);
    }
    private int min(Node node){
        if(node.left==null){
            return node.data;
        }
        return min(node.left);

    }
    public void remove(int data){
        remove(root,data);
    }
    private Node remove(Node node,int data) {

        if(node==null){
            return null;
        }
    if(node.data>data){
        node.left=remove(node.left,data);
    }
    else if(node.data<data){
         node.right=remove(node.right,data);
    }
    else{
        if(node.left==null&&node.right==null){
            return null;
        }
        else if(node.left!=null&&node.right==null){
            return node.left;
        }
        else if(node.right!=null&&node.left==null){
            return node.right;
        }
        else{
            int temp=max(node.left);
            remove(temp);
            node.data=temp;
        }
    }
return node;
    }
    public BST(int arr[]){
       root= createTree(arr,0,arr.length-1);
    }

    private Node createTree(int[] arr,int start,int end) {
        //for(int i=0;i<arr.length/2;i++){

        if(start>end){
            return null;
        }

        int mid=(end+start)/2;
        Node newNode=new Node(arr[mid],null,null);
        newNode.left=createTree(arr,start,mid-1);
        newNode.right=createTree(arr,mid+1,end);

    return newNode;
    }
}
