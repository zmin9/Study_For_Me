//Dynamic Programming,Greedy

import java.io.*;

public class Q02839 {
    static Integer[] dp;    //선언하지 않은 값에 대해서 null로 받아오기 위해 Integer[] 사용

    static int sugerDelivery(int N){
        if(dp[N] == null){
            dp[N] = 1+Math.min(sugerDelivery(N-5),sugerDelivery(N-3));
        }
        return dp[N];
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()),result,temp;
        br.close();

        dp = new Integer[N+3];

        dp[0] = N;
        dp[1] = N;
        dp[2] = N;
        dp[3] = 1;
        dp[4] = N;
        dp[5] = 1;

        if((temp = sugerDelivery(N)) >= N){
            result = -1;
        }
        else {
            result = temp;
        }

        System.out.println(result);
    }
}