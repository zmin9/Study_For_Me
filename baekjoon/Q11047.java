import java.util.*;

public class Q11047 {  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int result=0, N=sc.nextInt(), K=sc.nextInt(),q;
        int[] coin=new int[N];

        for(int i=0;i<N;i++){
            coin[i]=sc.nextInt();
        }

        for(int i=N-1;i>=0;i--){
            q=K/coin[i];
            K-=q*coin[i];
            result+=q;
        }

        System.out.println(result);

        sc.close();
    }
}