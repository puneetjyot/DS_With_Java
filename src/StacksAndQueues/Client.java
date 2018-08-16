package StacksAndQueues;

public class Client {


    public static void main(String[] args) throws Exception {
        DynamicStack stack = new DynamicStack(5);
        for (int i = 1; i <= 5; i++) {
            stack.push(i * 10);
        }
        DynamicStack helper = new DynamicStack(5);
        stack.display();
        reveseStack(stack, helper);
        stack.display();

        DynamicQueue queue = new DynamicQueue(5);
        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i * 10);
        }
        queue.display();
        reverseQueue(queue);
        queue.display();

        int prices[]=new int[]{30,35,40,38,35,39,45,40,42,43};
        int span[]=StockSpanUsingStacks(prices);
        for(int val:span){
            System.out.print(val+" ,");
        }
        System.out.println("END");

    }

    private static int[] StockSpanUsingStacks(int[] prices) {
        int count=0;
        int s=1;
        int span[]=new int[prices.length];
        int maxima=1;
        for(int i=0;i<prices.length;i++){
            if(count<prices[i]){
                span[i]=s++;
                count=prices[i];
               if(count>maxima) {
                   maxima = prices[i];
                   // System.out.println("hi");
               }
            }

            if(count>prices[i]){
               if(count>maxima){

                   s=i+1;
                   span[i]=s;
               }
               else {
                   s = 1;
                   count = 0;
                   span[i] = s;
               }
               }
        }
        return span;
    }




    public static void reveseStack(DynamicStack stack, DynamicStack helper) throws Exception {

        int top = 5, bottom = -1, a = 5;


        for (int j = 0; j < a; j++) {
            if (stack.isEmpty()) {
                System.out.println("stack underflow");
                return;
            }
            int temp = stack.pop();
            top--;

            for (int i = 0; i < top; i++) {
                helper.push(stack.pop());
            }
            stack.push(temp);
            bottom++;
            for (int i = 0; i < top; i++) {
                stack.push(helper.pop());
            }


        }
    }

    public static void reverseQueue(DynamicQueue queue) throws Exception {


            if (queue.isEmpty()) {
                return;
            }

            int temp=queue.dequeue();
            reverseQueue(queue);
            queue.enqueue(temp);


        }




}

