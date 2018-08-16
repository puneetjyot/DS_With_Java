package DP;

public class MCM {
    public static void main(String[] args) {
        int []dims={10,20,30,40,50};
        System.out.println(mcm(dims,1,dims.length-1));
    }

    private static int mcm(int[] dims, int si, int ei) {

        if(ei-si==0){
            return 0;
        }
      //int count= (dims[si]*dims[si+2])*dims[si+1];
        int recresult;
        int min=Integer.MAX_VALUE;
        for(int i=si;i<ei;i++) {
             recresult = mcm(dims, si, i) + mcm(dims, i+1,ei)+dims[si-1]*dims[i]*dims[ei];

            //  System.out.println((dims[0]*dims[2])*dims[1]);
            if(min>recresult){
                min=recresult;
            }
        }
        return min;
    }
}
