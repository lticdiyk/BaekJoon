import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int max = 0;
        int num = -1;

        for(int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i]>max){
                max = arr[i];
                num = i;
            }
        }
        System.out.println(arr[num] +"\n"+(num+1));
        System.out.println("hello01"));
    }
}