package file;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class MainClass
{
    public static void main(String[] args) throws Exception {
        // pass the path to the file as a parameter
        ArrayList<String> al=new ArrayList<>();

        HashMap<String,Integer> hs2=new HashMap<>();

        int n = 3;
        while (n > 0) {
            HashMap<String,Integer> hs=new HashMap<>();
            File file =
                    new File("C:\\Users\\puneetkhurana01\\IdeaProjects\\Nagarro_training_2018\\src\\file\\file"+n+".txt");
            Scanner sc = new Scanner(file);
            String words;
            while (sc.hasNextLine()) {

                words=sc.nextLine();
                String word[]=words.split(" ");
                for(int i=0;i<word.length;i++){
                 //   System.out.println(word[i]);
                }

                for(int i=0;i<word.length;i++){
                    String newString="";
                    for(int j=0;j<word[i].length();j++){
                        if(word[i].charAt(j)>='A'||word[i].charAt(j)<='Z'||word[i].charAt(j)>='a'||word[i].charAt(j)<='z'){
                            newString+=word[i].substring(j,j+1);
                        }
                       newString= newString.toLowerCase();
                    }
                    if(!hs.containsKey(newString)){
                        hs.put(newString,1);
                    }
                    if (hs2.containsKey(newString)) {
                        hs2.put(newString, hs2.get(newString) + 1);
                    } else {
                        hs2.put(newString, 1);
                    }
                }



              // System.out.println(sc.nextLine());

               // al.add(sc.next());


                n--;}
        }
//        while(a<al.size()){
//
//            System.out.println(al.get(a));
//
//            a++;
//        }
        //HashMap<String,Integer> hs=new HashMap<>();
//        for(int i=0;i<al.size();i++){
////            if(hs.containsKey(al.get(i))&&hs.get(al.get(i))==2){
////                System.out.println(al.get(i));
////                System.out.println("hi");
////            }
//            if(hs.containsKey(al.get(i))){
//                hs.put(al.get(i),hs.get(al.get(i))+1);
//                //System.out.println(al.get(i));
//            }
//            else{
//                hs.put(al.get(i),1);
//            }
//        }
       // System.out.println(hs.containsValue(2));
        for (HashMap.Entry<String, Integer> entry : hs2.entrySet()) {
            if (entry.getValue() == 2) {
                System.out.println(entry.getKey());
            }

        }


    }

}
