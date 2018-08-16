package Hashmap;

import javax.xml.bind.annotation.XmlType;

public class HashTable<K,V> {

    private class HTPair{
        K key;
        V value;
        HTPair(K key,V value){
            this.key=key;
            this.value=value;
        }
        public boolean equals(Object ob){
            if((HTPair)ob==this){
                return true;
            }
            return false;
        }
        public String toString(){
            return "{"+this.key+":"+this.value+"}";
        }



    }
    private LinkedList<HTPair>[] bucketArray;
    private int size;
    public static final int DEFAULT_CAPACITY=10;

    public HashTable(){
        this(DEFAULT_CAPACITY);
    }
    public HashTable(int capacity){
        bucketArray=(LinkedList<HTPair>[])new LinkedList[capacity];
    }
    public void put(K key,V value) throws Exception{
        int index=hashFuction(key);
        LinkedList<HTPair> bucket=bucketArray[index];
        HTPair pta=new HTPair(key,value);
        if(bucket==null){
            bucket=new LinkedList<>();
            bucket.addLast(pta);
            size++;
            bucketArray[index]=bucket;

        }
        else{
            int index1=bucket.find(pta);
            if(index1!=-1){
                HTPair pair=bucket.getAt(index1);
                pair.value=value;

            }
            else{
            //    HTPair pair=bucket.getAt(index1);
                bucket.addLast(pta);
                size++;

            }

        }
        if(size/bucketArray.length>2){
            rehash();
        }
    }
    public void display(){
        for(LinkedList bucket:bucketArray){
            if(bucket==null|| bucket.isEmpty()){
                System.out.println("null");
            }
            else{
                bucket.display();
            }
            System.out.println("**************************");
        }
    }

    public int hashFuction(K key){
        int hc=key.hashCode();
         hc=Math.abs(hc);
         return hc%bucketArray.length;

    }
    public V get(K key) throws Exception {
        int index=hashFuction(key);
        LinkedList<HTPair> bucket=bucketArray[index];
        HTPair pta=new HTPair(key,null);
        if(bucket==null){
            return null;

        }
        else{
            int findat=bucket.find(pta);
            if(findat==-1){
                return null;

            }
            else{
                   HTPair pair=bucket.getAt(findat);
                    return pair.value;

            }

        }

    }
    private void rehash(){
        LinkedList<HTPair>[]oba=bucketArray;
        bucketArray=(LinkedList<HTPair>[])new LinkedList[bucketArray.length*2];
        this.size=0;
        for(LinkedList<HTPair> bucket:oba){


        }

    }



       // rv.data
         //       remove last
           //             <linkedList<HtPair>[]




}
