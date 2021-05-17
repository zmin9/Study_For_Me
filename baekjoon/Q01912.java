import java.util.Scanner;

public class Q01912 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int[] sum=new int[N];
        sum[0]=sc.nextInt();
        for(int i=1;i<N;i++){
            sum[i]=sum[i-1]+sc.nextInt();
        }
        sc.close();
        int sum_min=0,result=sum[0];
        for(int i=0;i<N;i++){
            result=Math.max(result, sum[i]-sum_min);

            if(sum_min>sum[i]) {
                sum_min=sum[i];
            }
        }

        System.out.println(result);
    }
}