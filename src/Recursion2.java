public class Recursion2 {

    public static int[] allIndex(int arr[],int si,int data,int count){

        int i=0;
        int arr1[];
        if(si==arr.length){
            return new int[count];

        }
        // arr1[]=allIndex
        else{
            if(arr[si]==data)
            {

            arr1= allIndex(arr,si+1,data,count+1);
             //arr1=new int[i];

            }
            else{
              arr1=  allIndex(arr,si+1,data,count);
                //arr1=new int[i];
            }
        }
        if(arr[si]==data)
        arr1[count]=si;

        return arr1;
    }
    public static void main(String args[]){
        int []arr={3,8,1,6,8,2};
        int si=0;
        int data=8;
        int arr1[]=allIndex(arr,si,data,0);
        for (int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
    }
}
