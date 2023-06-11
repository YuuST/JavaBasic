package Hackerank;

import java.util.Scanner;

public class stdin_stdout_ii {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = Integer.parseInt(scan.nextLine());
        double d = Double.parseDouble(scan.nextLine());
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
