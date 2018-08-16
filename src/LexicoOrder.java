public class LexicoOrder {

    public static void main(String args[]){
        lexicoOrder(0,1000);
    }

    public static void lexicoOrder(int curr, int end) {

        if(curr>end){
            return;
        }
        System.out.println(curr);
        if(curr==0) {
            for (int i = 1; i <= 9; i++) {
                lexicoOrder(curr * 10 + i, end);
            }
        }
            else{
                for(int i=0;i<=9;i++){
                    lexicoOrder(curr*10+i,end);
                }
            }


    }
}
