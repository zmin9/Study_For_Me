import java.util.Scanner;
public class Q01149 {
    static int[][] home;
    private static void calculate(int r, int g, int b, int index){
        if(index==0){
            home[index][0]=r; home[index][1]=g; home[index][2]=b;
            return;
        }
        home[index][0]=r+Math.min(home[index-1][1], home[index-1][2]);
        home[index][1]=g+Math.min(home[index-1][0], home[index-1][2]);
        home[index][2]=b+Math.min(home[index-1][1], home[index-1][0]);
        return;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        home = new int[N][3];

        for(int i = 0 ; i < N ; i++)
                calculate(sc.nextInt(),sc.nextInt(),sc.nextInt(),i);
        sc.close();

        System.out.println(Math.min(Math.min(home[N-1][0], home[N-1][1]), home[N-1][2]));
    }
}
