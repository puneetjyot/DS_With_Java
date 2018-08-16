package file;
import java.util.Scanner;



public class ChessBoard2 {

    public static int printPath(int x, int y, int n, String str, int[][] board)

    {

        if (x == n - 1 && y == n - 1) {
            System.out.print(str);



            System.out.print("{" + x + "-" + y + "} ");

            return 1;

        }

        int count = 0;

        if (x >= n || y >= n)

            return 0;


        if (board[x][y] == -1) {

            return 0;

        }

        if (board[x][y] == 1) {

            count += printPath(n - 1, n - 1, n, str + "{" + x + "-" + y + "}P", board);

        }


        count += printPath(x + 2, y + 1, n, str + "{" + x + "-" + y + "}K", board);


        count += printPath(x + 1, y + 2, n, str + "{" + x + "-" + y + "}K", board);

        if (x == 0 || x == n - 1 || y == 0 || y == n - 1) //making cases for the rook;

        {

            for (int i = 1; i < n; i++) {


                count += printPath(x, y + i, n, str + "{" + x + "-" + y + "}R", board);

            }

            for (int i = 1; i < n; i++) {


                count += printPath(x + i, y, n, str + "{" + x + "-" + y + "}R", board);

            }

        }

        if (x == y || x + y == n - 1)
        {

            for (int i = 1; i < n; i++) {


                count += printPath(x + i, y + i, n, str + "{" + x + "-" + y + "}B", board);

            }


        }


        return count;

    }


    public static int ans(int x, int y, int n, String str, int[][] board)

    {

        if (x == n - 1 && y == n - 1)

        {


            return 1;

        }

        if (x >= n || y >= n)

            return 0;



        int count = 0;

        if (board[x][y] == -1) {

            return 0;

        }

        if (board[x][y] == 1) {

            count += ans(n - 1, n - 1, n, str + "{" + x + "-" + y + "}P", board);

        }


        count += ans(x + 2, y + 1, n, str + "{" + x + "-" + y + "}K", board);


        count += ans(x + 1, y + 2, n, str + "{" + x + "-" + y + "}K", board);

        if (x == 0 || x == n - 1 || y == 0 || y == n - 1)

        {

            for (int i = 1; i < n; i++) {


                count += ans(x, y + i, n, str + "{" + x + "-" + y + "}R", board);

            }

            for (int i = 1; i < n; i++) {


                count += ans(x + i, y, n, str + "{" + x + "-" + y + "}R", board);

            }

        }

        if (x == y || x + y == n - 1)

        {

            for (int i = 1; i < n; i++) {


                count += ans(x + i, y + i, n, str + "{" + x + "-" + y + "}B", board);

            }


        }


        return count;

    }


    public static boolean isPrime(int n) {

        if (n == 1)

            return false;

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0)

                return false;

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int mine = -1;
        int port = 1;
        boolean flag = true;
        int board[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 0;
                boolean isP = isPrime(count);
                if (isP) {
                    if (flag)
                        board[i][j] = mine;
                    else
                        board[i][j] = port;
                    flag = !flag;
                }
                count++;
            }
        }
        String str = "";
        String str2 = "";
        System.out.println(ans(0, 0, n, str, board));
        printPath(0, 0, n, str2, board);
    }

}

