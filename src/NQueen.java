public class NQueen {


    public static int countNQueen(boolean[][]board,int row){
        if(row==board.length){
            return 1;


        }
        int count=0;
        for(int col=0;col<board[row].length;col++){
            if(isitSafe(board,row,col)){
                board[row][col]=true;
                count=count+countNQueen(board,row+1);
                board[row][col]=false;
            }
        }
        return count;
    }

    public static boolean  isitSafe(boolean board[][],int row,int col){

        if(row==0&&col==0){
            return true;
        }
        else if(row==0){
            if(isitSafe(board,row,col-1)){
                return true;
            }
            else{
                return false;
            }
        }
        else if(col==0){
            if(isitSafe(board,row-1,col)&&isitSafe(board,row-1,col+1)){
                return true;

            }
            else{
                return false;
            }

        }
        else {
            if (isitSafe(board, row - 1, col) && isitSafe(board, row - 1, col - 1) && isitSafe(board, row, col - 1)) {

                return true;
            }
            else{
                return false;
            }
        }

    }

    public static void main(String []args)
    {
        boolean [][]board=new boolean[4][4];

        System.out.println(countNQueen(board,0));

    }
}
