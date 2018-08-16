import java.util.Scanner;
import java.util.Stack;

public class RedundantPranthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Stack<Character> stack=new Stack();
        int i=0,count=0;
        while(i<str.length())
        {


            if(str.charAt(i)!=')'){
                stack.push(str.charAt(i));

            }
            else{
                while(stack.peek()!='('){
                    stack.pop();
                    count++;
                }
                stack.pop();
                if(count==0){

                    System.out.println("true");
                    return;
                }
                count=0;

            }
        i++;}
        System.out.println("false");


    }
}
