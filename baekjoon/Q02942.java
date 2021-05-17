import java.util.*;

public class Q02942 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt(), G = sc.nextInt();
        sc.close();

        for(int i=1;i<=Math.min(R, G);i++){
            if(R%i==0 && G%i==0){
                System.out.printf("%d %d %d\n",i,R/i,G/i);
            }
        }
    }
}
