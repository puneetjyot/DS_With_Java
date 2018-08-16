import java.util.ArrayList;

public class Subsequence {

    public static ArrayList<String> getSS(String s){
      // int count=s.length();
       //ArrayList<String> ar=null;
       char cc=s.charAt(0);
       String ros=s.substring(1);
        if(s.length()==0){
            ArrayList<String >br=new ArrayList<String>();
            br.add("");
            return br;
        }
        else{
                ArrayList<String>myResult=new ArrayList<String>();
                ArrayList<String> recResult=getSS(ros);

                for(int i=0;i<recResult.size();i++){
                    myResult.add(recResult.get(i));
                    myResult.add(cc+recResult.get(i));
                }


                return myResult;
        }

    }

    public static void main(String args[]){
        String s="abc";
      //  ArrayList<String> arrayList=new ArrayList<String>();

        System.out.println(getSS(s));

    }
}
