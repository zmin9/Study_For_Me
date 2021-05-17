import java.io.*;
import java.util.*;

public class Q09375 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String kind;
        HashMap<String,Integer> closet = new HashMap<String,Integer>();
        int N = Integer.parseInt(br.readLine());
        int M, temp, result;

        for(int j = 0 ; j < N ; j++){
            M = Integer.parseInt(br.readLine());
            for(int i = 0 ; i < M ; i++){
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                kind = st.nextToken();
                if( closet.get(kind) == null){
                    closet.put(kind,1);
                }
                else {
                    temp=closet.get(kind);
                    closet.replace(kind,++temp);
                }
            }
            result=1;
            for(String key : closet.keySet()){
                result*=(closet.get(key)+1);
            }
            System.out.println(result-1);
            closet.clear();
        }

        br.close();
    }
}