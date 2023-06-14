package Hackerank;
import java.util.*;
import java.security.*;

public class inttostring {
    public static void main(String[] args) {
//        DoNotTerminate.ExitTrappedException;

        try {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            scan.close();

            String s = "";
            if (n >= -100 && n <= 100) {
                s = Integer.toString(n);
            }
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer");
            }
//        }catch (DoNotTerminate.ExitTrappedException e){
        }catch (Exception e){
            System.out.println("Unsuccessful Termination!!");
        }

    }
}

//class DoNotTerminate {
//
//    public static class ExitTrappedException extends SecurityException {
//
//        private static final long serialVersionUID = 1;
//    }

//    public static void forbidExit() {
//        final SecurityManager securityManager = new SecurityManager() {
//            @Override
//            public void checkPermission(Permission permission) {
//                if (permission.getName().contains("exitVM")) {
//                    throw new ExitTrappedException();
//                }
//            }
//        };
//        System.setSecurityManager(securityManager);
//    }
//}