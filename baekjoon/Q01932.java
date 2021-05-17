import java.util.Scanner;
public class Q01932 {
    static int[][] number;
    static Integer[][] dp;
    //Top-down
    static int findMaxsum(int n,int m) {
        if(n == 1) return dp[1][1];

        if(dp[n][m]==null) {
            dp[n][m]=number[n][m]+Math.max(findMaxsum(n-1, m-1),findMaxsum(n-1, m)); 
            return dp[n][m];
        }
        else return dp[n][m];
    }    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        number = new int[N+1][];
        dp = new Integer[N+1][N+1];
        dp[0][0] = 0;

        for(int i = 1 ; i <= N ; i++ ) {
            number[i] = new int[i+1];
            for(int j = 1 ; j <= i ; j++ ){
                number[i][j]=sc.nextInt();
                if( i == j ) dp[i][j]=dp[i-1][j-1]+number[i][j];
                else if( j == 1 ) dp[i][j]=dp[i-1][j]+number[i][j];
            }
        }
        sc.close();     
        
        int result = Math.max(dp[N][1],dp[N][N]);
        
        for(int i = 2 ; i < N ; i++){
            result=Math.max(findMaxsum(N, i),result);
        }
        System.out.println(result);
    }
}