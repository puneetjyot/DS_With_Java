package DP;

import java.util.Scanner;

public class LCS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int x = s1.length();
        int y = s2.length();
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        int lcs[][] = new int[x + 1][y + 1];
        String str = "";
//        for (int i = 0; i <= x; i++) {
//            for (int j = 0; j <= y; j++) {

        for (int i=0; i<=x; i++)
        {
            for (int j=0; j<=y; j++)
            {
                if (i == 0 || j == 0)
                    lcs[i][j] = 0;
                else if (arr1[i-1] == arr2[j-1])
                    lcs[i][j] = lcs[i-1][j-1] + 1;
                else
                    lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
            }
        }






        int i = x, j = y ;
        while (i > 0 && j > 0){
//            if (i == 0 || j == 0)
//                lcs[i][j] = 0;


            if (arr1[i - 1] == arr2[j - 1]) {
               // lcs[i][j] = lcs[i - 1][j - 1] + 1;
                str = str + arr1[i - 1];

               // System.out.println(arr1[i-1]);
                i--;
                j--;
            }

               else if (lcs[i - 1][j] > lcs[i][j - 1]) {
                i--;
            }
                else {
                    j--;
                }

//            }
//        }
    }
    StringBuilder sb=new StringBuilder(str);
       sb= sb.reverse();
        System.out.println(sb);

    }
}
