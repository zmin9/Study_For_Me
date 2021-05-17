import java.util.*;
public class Q01920 {
    //해당 숫자 찾으면 인덱스 반환, 못 찾으면 -1 반환
    static int binary_search(int[] A, int key){
        int low = 0, high=A.length-1;

        while (low <= high){
            int middle = (low+high)>>>1; //비트연산자 오른쪽으로 한 칸 옮긴다는 말 -> 2로 나눈다는 의미
            int midVal = A[middle];
            if(key > midVal){
                low = middle + 1;
            }
            else if(key < midVal){
                high = middle - 1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int M = sc.nextInt();
        int[] findNum = new int[M];
        for(int i=0;i<M;i++){
            findNum[i]=sc.nextInt();
        }
        sc.close();

        Arrays.sort(arr);

        /* java Array에서 binarySearch 함수 이용한 경우
        for(int i=0;i<M;i++) {
            if ( Arrays.binarySearch(arr, findNum[i]) >= 0 ){
                findNum[i]=1;
            }
            else {
                findNum[i]=0;
            }
        }
        */
        
        for(int i=0;i<M;i++) {
            if ( binary_search(arr, findNum[i]) >= 0 ){
                findNum[i]=1;
            }
            else {
                findNum[i]=0;
            }
        }
        



        for(int i=0;i<M;i++) {
            System.out.println(findNum[i]);
        }

    }
}
