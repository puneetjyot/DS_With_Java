//package Chess;
//
//import java.util.Scanner;
//
//public class ChessBoard {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int arr[][]=new int[n-1][n-1];
//        System.out.println(numberOfWaysrook(arr,n-1,0,0,0,0));
//       // System.out.println(numberOfWaysbishop(arr,n-1,0,0,0,0));
//
//    }
//    static int rookways=0;
//    static int bishop=0;
//
//    private static int numberOfWaysrook(int arr[][],int n,int cr,int cc,int sr,int sc) {
//
//   if(cr==n&&cc==n){
//       System.out.println("r"+"["+cr+" "+cc+"]");
//       return 1;
//   }
//
//
//
//
//
//   if(cr<n){
//       System.out.println("r"+"["+cr+" "+cc+"]");
//       rookways =rookways+numberOfWaysrook(arr,n,cr+1,cc,sr,sc);
//
//   }
//
//   else {
//       System.out.println("r"+"["+cr+" "+cc+"]");
//
//       rookways =rookways+numberOfWaysrook(arr,n,cr,cc+1,sr,sc);
//   }
//
//
//    if(cc==0)
//
//
//
//
//    return rookways;}
//
//}
