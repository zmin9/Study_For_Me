import java.util.Scanner;

public class Q01463 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(); 
        //int count=0, temp;
        sc.close();

        long start=System.nanoTime();

        /*시간초과
        while(N!=1){
            temp=N%6;
            switch(temp){
                case 0: N=temp; count+=2; break;
                case 1: N--; count+=1; break;
                case 2: N/=2; count+=1; break;
                case 3: N/=3; count+=1; break;
                case 4: N=(N-1)/3; count+=2; break;
                case 5: N=(N-2)/3; count+=3; break;
            }    
        }

        System.out.println(count);
        */

        
        int[] count=new int[N+1];
        count[0]=0; count[1]=0;
        for(int i=2;i<=N;i++){
            count[i]=count[i-1]+1;
            if(i%2==0) count[i]=Math.min(count[i],count[i/2]+1);
            if(i%3==0) count[i]=Math.min(count[i],count[i/3]+1);
        }

        System.out.println(count[N]);
        

        double run=(System.nanoTime()-start);
        System.out.println("수행시간 : "+run+"ns");


        
    }
}
