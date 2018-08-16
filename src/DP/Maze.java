package DP;

public class Maze {
static int count=0;
        public static int cmp(int er,int ec,int cr,int cc){


            if(cr==er&&cc==ec){
                return 1;
            }
            if(er<cr||ec<cc){
                return 0;
            }

             int rcount=   cmp(er,ec,cr+1,cc);

            int lcount=cmp(er,ec,cr,cc+1);

        return rcount+lcount;
        }

    public static int cmpr(int er,int ec,int cr,int cc,int [][]matrix){

            if(matrix[cr][cc]!=0){
                return matrix[cr][cc];
            }
            if(cr==er&&cc==ec){
            return 1;
        }
        if(er<cr||ec<cc){
            return 0;
        }

        int rcount=   cmp(er,ec,cr+1,cc);

        int lcount=   cmp(er,ec,cr,cc+1);

        return rcount+lcount;
    }
    public static int cmp1(int er,int ec,int cr,int cc){
          int  matrix[][]=new int[er+1][ec+1];
          matrix[0][0]=1;





              for (int i = 0; i <= er; i++) {
                  for (int j = 0; j <=ec; j++) {
                      if(i>0&&j>0) {
                      matrix[i][j] = matrix[i - 1][j]+matrix[i][j-1];

                  }
                      if(i==0&&j>0){
                          matrix[i][j] = matrix[i][j-1];
                      }
                      if(i>0&&j==0){
                          matrix[i][j] = matrix[i-1][j];
                      }
              }
          }
        return matrix[er][ec];
        }
        static StringBuilder str=new StringBuilder();

        public static int lcs(char arr1[],char arr2[],int x,int y){

            int lcs[][]=new int[x+1][y+1];

            for(int i=0;i<=x;i++){
                for(int j=0;j<=y;j++){
                    if(i==0||j==0)
                        lcs[i][j]=0;


                    else if(arr1[i-1]==arr2[j-1]){
                        lcs[i][j]=lcs[i-1][j-1]+1;
                        str.append(arr1[i-1]);
                    }
                    else{
                        lcs[i][j]=Math.max(lcs[i-1][j],lcs[i][j-1]);
                    }
                }
            }


            System.out.println(str);

return lcs[x][y];


        }

    public static void main(String[] args) {
        System.out.println(cmp(2,2,0,0));
        int matrix[][]=new int[3][3];
        System.out.println(cmpr(5,5,0,0,matrix));
        System.out.println(cmp1(5,5,0,0));
        String s1="abbg";
        String s2="agbg";
        int x=s1.length();
        int y=s2.length();
        char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();
        System.out.println(lcs(arr1,arr2,x,y));

    }
}
