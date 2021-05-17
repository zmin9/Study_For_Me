import java.util.Scanner;

public class Q02579 {

    static int[] floor;
    static Integer[] dp;

    static int calculate(int n){

        if(dp[n]==null){
            dp[n]=floor[n]+Math.max(calculate(n-2),calculate(n-3)+floor[n-1]);
        }
        return dp[n];
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        floor = new int[N+3];
        dp = new Integer[N+3];
    
        for(int i = 1 ; i <= N ; i++ ){
            floor[i]=sc.nextInt();
        }
        sc.close();

        floor[0] = 0;
        dp[0] = floor[0];
        dp[1] = floor[1];
        dp[2] = floor[2]+dp[1];

        System.out.println(calculate(N));
    }
}