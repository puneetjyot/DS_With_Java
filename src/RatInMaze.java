public class RatInMaze {

    public static void ratMaze(int board[][],int startRow,int startCol,int endRow,int endCol) {
        int ratarr[][] = new int[5][5];
        // for(int i=startRow;i<endRow;i++){
        //   for(int j=startCol;j<endCol;j++){
        //       if(board)
        // }
        // }

        if(startRow==9||startCol==9){
            return;
        }
        if (startRow == endRow && startCol == endCol) {

            for (int i=0;i<endRow;i++){
                for (int j=0;j<endCol;j++){
                    System.out.print(board[i][j]+" ");

                }
                System.out.println();
            }
            System.out.println("****************");
            return;
        }
        if (startRow > endRow || startCol > endRow) {
            return;
        }

        board[startRow][startCol]=1;
        ratMaze(board,startRow+1,startCol,endRow,endCol);
        ratMaze(board,startRow,startCol+1,endRow,endCol);
        board[startRow][startCol]=0;

    }
    public static void main(String args[]){
        int [][] board={{0,9,0,0,0},
                        {0,0,0,9,0},
                        {0,0,9,0,0},
                        {9,0,0,0,0},
                        {9,9,0,0,0}};
        ratMaze(board,0,0,4,4);

        }
}
