package Hackerank;

import java.util.Scanner;

public class stdin_stdout_i_imp {

    public static int inputInt(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        return a;
    }

    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            System.out.println(inputInt());
        }
    }
}
