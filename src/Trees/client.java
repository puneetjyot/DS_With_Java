package Trees;

public class client {
    public static void main(String[] args) {

//50 true 25 true 12 false false true 15 true 86 false false false true 75 true 62 false false true 48 false false
        BinaryTree tree = new BinaryTree();
        tree.display();
        System.out.println(tree.height());
        System.out.println(tree.size());
        System.out.println(tree.max());
        System.out.println(tree.lca(75,48));
    }
}
