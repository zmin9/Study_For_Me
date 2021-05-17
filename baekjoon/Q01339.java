import java.util.*;

public class Q01339 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N=sc.nextInt();
        String word;
        int[] alphabet=new int[26]; //'A'==65 따라서 알파벳 A의 인덱스는 0 (알파벳-65 해주면 됨)

        //배열 초기화
        for(int i=0;i<26;i++){
            alphabet[i]=0;
        }
        
        for(int i=0;i<N;i++){
            word=sc.next();
            for(int j=0;j<word.length();j++){
                alphabet[word.charAt(j)-65]+=(int)Math.pow(10.0,word.length()-j-1.0);
            }
        }
        
        Arrays.sort(alphabet);


        int index=25,num=9,result=0;
        while(alphabet[index]!=0){
            result+=(num*alphabet[index]);
            num--;
            index--;
        }

        System.out.println(result);
    
        sc.close();        
    }
}