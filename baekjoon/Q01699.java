import java.util.*;

public class Q01699 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int[] sum = new int[N+1];

        sum[0]=0;
        for(int i=1;i<=N;i++){
            if(Math.sqrt(i) == (int)Math.sqrt(i)){
                sum[i] = 1;
                continue;
            }
            sum[i]=sum[i-1]+sum[1];
            for(int j=2;j<=i/2;j++){
                if(sum[i]>sum[i-j]+sum[j]){
                    sum[i]=sum[i-j]+sum[j];
                }
            }
        }
        System.out.println(sum[N]);
    }
}