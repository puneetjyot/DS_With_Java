public class Recuresion1 {

    public static int lastItem(int[] arr, int si, int data) {

        int flag=-1;
        if(si==arr.length)
        {
            return -1;
        }
        int index=lastItem(arr,si+1,data);

        if(index!=-1)
        {
            return index;
        }
        else {

            if(arr[si]==data)
            {

            return si;

            }
            else {
                return -1;
            }

        }


    }

    public static void main(String args[]) {

        int []arr={3,8,1,6,8,2};
        int si=0;
        int data=8;
       int in= lastItem(arr,si,data);
        System.out.println(in);
    }

}
