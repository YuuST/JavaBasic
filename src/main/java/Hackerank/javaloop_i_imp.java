package Hackerank;

import java.util.Scanner;

public class javaloop_i_imp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input number that >= 2 and <= 20: ");
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int N = scan.nextInt();

        if(N >= 2 & N <= 20){
            for(int i = 1; i <= 10; i++){
                System.out.println(N + " x " + i + " = " + N*i);
            }
        }else{
            System.out.println("Please input 2 <= N <= 20!");
        }
    }
}
