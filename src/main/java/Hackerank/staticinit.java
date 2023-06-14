package Hackerank;

import java.util.Scanner;

public class staticinit {
    public static void checknum(int a, int b){
        if(a <= 0 || b <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else{
            int area = a * b;
            System.out.println("The area of the parallelogram: " + area);;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        checknum(sc.nextInt(), sc.nextInt());
    }
}
