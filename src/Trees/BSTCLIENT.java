package Trees;

import java.util.SortedMap;

public class BSTCLIENT {
  public static void main(String[] args) {
//        BST tree=new BST();
//        tree.add(50);
//        tree.add(25);
//        tree.add(75);
//        tree.add(12);
//        tree.add(37);
//        tree.add(62);
//        tree.add(87);
//        tree.display();
//        System.out.println(tree.max());
//        System.out.println(tree.min());
//        tree.add(43);
//        tree.add(56);
//        System.out.print("************");
//        tree.remove(50);
//        tree.display();
//
        int arr[]={12,25,37,43,50,56,62,75,87};

        BST tree=new BST(arr);
        tree.display();


    }
}
