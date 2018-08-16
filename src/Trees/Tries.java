package Trees;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Tries {
    private class Node{
        char data;
        boolean isTerminal;
        HashMap<Character,Node> children;
        public Node(char data,boolean isterminal){
            this.data=data;
            this.isTerminal=isTerminal;
            children=new HashMap<>();
        }
    }
    Node root;
    int numWords;
    Tries(){
        this.numWords=0;
        this.root=new Node('\0',false);
    }
    public void add(String word){
        this.add(this.root,word);
    }
    public void add(Node node,String osf){
        if(osf.length()==0){
            if(node.isTerminal==true){
            }
            else{
                node.isTerminal=true;
                this.numWords++;
            }
            return;
        }
        char cc=osf.charAt(0);
        String ros=osf.substring(1);
        Node child;
        child=node.children.get(cc);
        if(child==null){
            child=new Node(cc,false);
            node.children.put(cc, child);
            //add(child,ros);
        }
        else{

        }
        add(child,ros);

    }
    public void display(){
        this.display(this.root,"\0");
    }
    private void display(Node node,String osf){
        if(node.isTerminal){
            System.out.println(osf.substring(1));

        }
        Set<Map.Entry<Character,Node>> set=node.children.entrySet();
        for(Map.Entry<Character,Node> entries:set){
            Node temp=entries.getValue();
            display(temp,osf+temp.data);
        }
    }
    public void search(String word){
        System.out.println(search(root,word)) ;
    }
    private boolean search(Node node,String osf){
        if(osf.length()==0){
            if(node.isTerminal==true){
                return true;
            }
            else{
               return false;
            }
        }
        char cc=osf.charAt(0);
        String ros=osf.substring(1);
        Node child;
        child=node.children.get(cc);
        if(child==null){
            return false;
            //add(child,ros);
        }

        return this.search(child,ros);
    }



    public void remove(String word){
        remove(root,word);
    }
    private void remove(Node node,String osf){
        if(osf.length()==0){
            if(node.isTerminal==true){
                node.isTerminal=false;
                this.numWords--;
            }
            else{


            }
            return;
        }
        char cc=osf.charAt(0);
        String ros=osf.substring(1);
        Node child;
        child=node.children.get(cc);
        if(child==null){
            return ;
            //add(child,ros);
        }

         this.remove(child,ros);
        if(!child.isTerminal&& child.children.size()==0){
            node.children.remove(cc);
        }

    }
}