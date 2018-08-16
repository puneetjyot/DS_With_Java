package file;

import java.util.*;

public class ChessboardProblem {

    public static int printPath(int x, int y, int n,String str) {
        if (x == n - 1 && y == n - 1) {
            System.out.print(str);
            System.out.print("{" + x + "-" + y + "} ");
            return 1;
        }
        if (x >= n || y >= n)
            return 0;
        //System.out.println(x+ " " +y);

        int count = 0;

        count += printPath(x + 2, y + 1, n, str+"{"+ x+ "-" + y + "}K");
        count += printPath(x + 1, y + 2, n, str+"{"+ x+ "-" + y + "}K");

        if (x == 0 || x == n - 1 || y == 0 || y == n - 1) {

            for (int i = 1; i < n; i++) {

                count += printPath(x+i,y,n,str+"{"+ x+ "-" + y + "}R");
            }
            for(int j=1;j<n;j++){
                count+=printPath(x,y+j,n,str+"{"+ x+ "-" + y + "}R");
            }
            }

            if(x==y||x+y==n-1)
            {
                for(int i=1;i<n;i++){
                    count+=printPath(x+i,y+i,n,str+"{"+ x+ "-" + y + "}B");
                }
            }
        return count;

    }
    public static int ans(int x, int y, int n,String str)
    {
        if(x==n-1 && y==n-1)
        {

            return 1;
        }
        if(x>=n || y>=n)
            return 0;
        //System.out.println(x+ " " +y);

        int count=0;

        count+=ans(x+2,y+1,n,str+"{"+ x+ "-" + y + "}K"); //for knight

        count+=ans(x+1,y+2,n,str+"{"+ x+ "-" + y + "}K");
        if(x==0 || x==n-1 || y==0 || y==n-1) //making cases for the rook;
        {
            for(int i=1; i<n;i++){

                count+=ans(x, y+i, n,str+"{"+ x+ "-" + y + "}R");
            }
            for(int i=1; i<n;i++){

                count+=ans(x+i, y, n, str+"{"+ x+ "-" + y + "}R");
            }
        }
        if(x==y || x+y==n-1) //for bishop
        {
            for(int i=1;i<n;i++){

                count+=ans(x+i, y+i,n,str+"{"+ x+ "-" + y + "}B");
            }

        }

        return count;
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        String str = "";
        String str2 = "";
       System.out.println(ans(0,0,n,str));
        printPath(0,0,n,str2);


    }
}


