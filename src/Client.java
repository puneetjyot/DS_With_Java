import Hashmap.HashTable;

public class Client {
    public static void main(String[] args) throws Exception {


    HashTable<String,Integer> ht=new HashTable<>(5);
    ht.put("USA",400);
        ht.put("Canada",300);
        ht.put("India",125);
        ht.put("RSA",435);
        ht.put("Croatia",500);
        ht.put("Russia",100);

        ht.display();
        System.out.println("Value");
        System.out.println(ht.get("India"));

}}
