package Hackerank;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class javaloop_i {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        if(N >= 2 & N <= 20){
            for(int i = 1; i <= 10; i++){
                System.out.println(N + " x " + i + " = " + N*i);
            }
        } else {
            System.out.println("Please input 2 <= N <= 20");
        }

        bufferedReader.close();
    }
}
