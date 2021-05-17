import java.util.Scanner;

public class Q11660 {
    static int[][] dp;
    static int[][] arr;
    //Bottom-up
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        dp = new int[N+1][N+1];
        arr = new int[N+1][N+1];
       
        for(int i = 1 ; i <= N ; i++ ) {
            for(int j = 1 ; j <= N ; j++ ){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i = 1 ; i <= N ; i++ ) {
            for(int j = 1 ; j <= N ; j++ ){
                dp[i][j]=dp[i-1][j]+dp[i][j-1]-dp[i-1][j-1]+arr[i][j];
            }
        }

        for(int i = 0 ; i < M ; i++ ){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            System.out.println(dp[x2][y2]-dp[x1-1][y2]-dp[x2][y1-1]+dp[x1-1][y1-1]);
        }
        sc.close();
    }
}