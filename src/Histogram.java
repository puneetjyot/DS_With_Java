import java.util.Scanner;
import java.util.Stack;

public class Histogram {
    public static void main(String[] args) {

        //int height[]={5,4,3,2,1};
        // int height[]={1,2,3,1,4};
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n<=0){
           // System.out.println();
            return;
        }
        long height[] = new long[(int) n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextLong();
        }
        System.out.println(Hist(height));
    }
        public static long Hist(long height[]){
        Stack<Integer> stack=new Stack<>();

        stack.push(0);

        long si[]=new long[height.length];

       // long area[]=new long[n];
        si[0]= 1;

        for(int i=1;i<height.length;i++)
        {
            //si[i]=1;
            while(!stack.empty()&&(height[stack.peek()]>=height[i]))
            {
                stack.pop();
            }

            si[i]= (stack.empty())?(i+1):i- stack.peek();
            stack.push(i);

        }
//        for(int i=0;i<n;i++){
//            System.out.println(si[i]);
//        }
            Stack<Integer> stack2=new Stack<>();
            long si2[]=new long[height.length];
            stack2.push((height.length-1));
            si2[(height.length-1)]= 1;
        for(int i = (height.length-2); i>=0; i--)
        {
            //si[i]=1;
            while(!stack2.empty()&&height[stack2.peek()]>=height[i])
            {
                stack2.pop();
            }

            si2[i]= ((stack2.empty())?height.length-i:( stack2.peek()-i));
            stack2.push(i);

        }

//        for(int i=0;i<n;i++){
//            System.out.print(si2[i]);
//        }
        long maxarea=0;
        for(int i=0;i<height.length;i++) {
            maxarea=Math.max(maxarea,(si[i] + si2[i] - 1) * height[i]);
//
        }
    return maxarea;
    }
}
