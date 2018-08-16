import java.lang.reflect.Array;
import java.util.ArrayList;

public class DiceAdd10{
    public static ArrayList<String> getBP(int end ,int curr) {

        if(end==curr){
            ArrayList <String> al=new ArrayList<>();
            al.add("");
            return al;
        }
        else if(end<curr){
            return new ArrayList<String>();
        }
        else {

            ArrayList<String >recResult=null;
            ArrayList<String>myResult=new ArrayList<String>();

            for (int dice = 1; dice <= 6; dice++) {
                recResult = getBP(end, curr + dice);


                for (int i = 1; i < recResult.size(); i++) {
                    myResult.add(recResult.get(i) + dice);
                }
            }
            return myResult;
        }
    }
    public static void main(String args[]) {

        System.out.println( getBP(10,1));
    }
}
