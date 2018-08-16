package Trees;

public class TrieClient {
    public static void main(String[] args) {
        Tries tr=new Tries();
        tr.add("art");
        tr.add("arts");
        tr.add("bug");
        tr.add("boy");
        tr.add("sea");
        tr.add("see");
        tr.add("seen");
        tr.display();
        tr.search("seef");
        tr.remove("arts");
        tr.display();
    }
}
