package Hackerank;

import java.util.Scanner;

public class endOfFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c = 1;
        while(scan.hasNext()){
            String s = scan.nextLine();
            System.out.println(c + " " + s);
            c++;
        }
    }
}
