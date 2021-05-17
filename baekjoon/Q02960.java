import java.util.Scanner;

public class Q02960 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), K=sc.nextInt();

        boolean[] num = new boolean[N+1];
        
        int index=2, count=1;
        while(true){
            if(!num[index*count]){
                num[index*count]=true;
                K--;
                if(K==0){
                    System.out.println(index*count);
                    break;
                }
            }
            count++;
            if(index*count>N){
                count=1;
                while(num[index]){
                    index++;
                }
            }
        }
        sc.close();
    }
}
