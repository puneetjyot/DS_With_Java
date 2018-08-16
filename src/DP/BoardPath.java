package DP;

import java.util.ArrayList;
import java.util.HashMap;

public class BoardPath {
static int count=0,result=0;
    public static ArrayList<String> countBP(int end,int curr){

        int table[][]=new int[6+1][end+1];
//        if(curr==end){
//            return 1;
//        }
//        if(curr>end){
//            return 0;
//
//        }
//
//        for(int i=1;i<6;i++){
//           count= countBP(curr+i,end);
//           for(int j=0;j<count;j++){
//               result=i+count;
//           }
//
//        }
//return result;
        HashMap<Integer,ArrayList<String>> map=new HashMap<>();



        if (curr == end) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
          //  table[curr][end]=1;

            return br;
        }

        if (curr > end) {
            ArrayList<String> br = new ArrayList<>();
            return br;
        }

        ArrayList<String> recresult = null;
        ArrayList<String> myResult = new ArrayList<>();
        for (int dice = 1; dice <= 6; dice++) {
            if(map.containsKey(curr+dice)){
                recresult= map.get(curr+dice);
            }
            recresult = countBP(end, curr + dice);
            map.put(curr+dice,recresult);

            for (int i = 0; i < recresult.size(); i++) {
                myResult.add(dice + recresult.get(i));
               // table[curr][end]=table[curr+1][end+1];

            }

        }

        return myResult;    }


       public static int cbpi(int end,int curr){
           int table[][]=new int[2][end+1];

            table[0][0]=1;
            if(curr>end){
                table[1][end]=0;
            }
            else{
                for(int i=1;i<=6&&end>=i;i++){
                    table[1][end]+=table[1][end-i];
                }
            }
        return table[1][end];
       }

    public static void main(String[] args) {

       // System.out.println(countBP(20,0).size());
        System.out.println(cbpi(10,0));
    }
}
