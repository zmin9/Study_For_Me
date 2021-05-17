import java.util.*;

public class Q11399 {  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int result=0, N=sc.nextInt();
        int[] list=new int[N];

        for(int i=0;i<N;i++){
            list[i]=sc.nextInt();
        }
        sc.close();

        Arrays.sort(list);

        for(int i=0;i<N;i++){
            result+=(list[i]*(N-i));
        }

        System.out.println(result);
        
        sc.close();
    }
}