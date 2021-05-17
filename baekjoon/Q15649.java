import java.util.*;

public class Q15649 {
    public static int N,M;
    public static int[] num;
    public static boolean[] isUsed;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();

        num=new int[M];
        isUsed=new boolean[N];
        sc.close();

        permutation(0);
    }

    public static void permutation(int index){
        if(index==M){
            for(int j=0;j<M;j++){
                System.out.print(num[j]+" ");
            }
            System.out.println();
            return;
        }

        for(int i=0;i<N;i++){
            if(!isUsed[i]){
                isUsed[i]=true;
                num[index]=i+1;
                permutation(index+1);
                isUsed[i]=false;
            }
        }
    }
}
