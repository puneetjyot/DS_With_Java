package Trees;

public class SegmentTree {
    private class Node{
        int data;
        int startIndex;
        int endIndex;
        Node left;
        Node right;
    }
    Node root;
    SegmentTree(int[] arr){
       this.root= this.construct(arr,0,arr.length-1);
    }
    public Node construct(int arr[],int startindex,int endindex){
        if(startindex==endindex){
            Node rv=new Node();
            rv.data=arr[startindex];
            rv.left=null;
            rv.right=null;
            rv.endIndex=endindex;
            rv.startIndex=startindex;
            return rv;
        }

        int mid=(startindex+endindex)/2;

        Node node=new Node();
        node.startIndex=startindex;
        node.endIndex=endindex;
        node.left=construct(arr,startindex,mid);
        node.right=construct(arr,mid+1,endindex);
        node.data=node.left.data+node.right.data;

        return node;


    }
    public void display(){
        display(root);
    }
    private void display(Node node){
        if(node==null){
            return ;
        }

        if(node.left!=null){
            System.out.print("["+node.left.startIndex+"-"+node.left.endIndex+"]"+"and data is"+node.left.data+"=>");
        }
        else{
            System.out.print("END=>");
        }
        System.out.print("["+node.startIndex+"-"+node.endIndex+"]"+"and data is"+node.data);

        if(node.right!=null){
            System.out.print("<="+"and data is"+node.right.data+" ["+node.right.startIndex+"-"+node.right.endIndex+"]");
        }
        else{
            System.out.print("<=END");
        }
        System.out.println();
        if(node.left!=null){
            display(node.left);
        }
        if(node.right!=null){
            display(node.right);
        }


    }
    public int query(int start,int end){
        return query(this.root,start,end);
    }
    private int query(Node node,int start,int end){
        if(node==null){
            return 0;
        }

        if(start<=node.startIndex&&end>=node.endIndex){
            return node.data;
        }
        else if(end<node.startIndex||start>node.endIndex){
            return 0;
        }
        else{
           int left= query(node.left,start,end);
           int right= query(node.right,start,end);
            return left+right;
        }
    }
    public void update(int index,int value){
        update(this.root,index,value);
    }
    private void update(Node node,int index,int value){
        if(node==null){
            return;
        }
        if(node.startIndex==node.endIndex){
            node.data=value;
            return;
        }
        if(node.left.endIndex>=index){
            node.data=node.data-node.left.data;
            update(node.left,index,value);
            node.data=node.data+node.left.data;

        }
        else if(node.right.startIndex<=index){
            node.data=node.data-node.right.data;
            update(node.right,index,value);
            node.data=node.data+node.right.data;
        }
    }

}
