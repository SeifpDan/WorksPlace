package test;

import java.util.Scanner;

public class ForWhileIfElse {

    public static void main(String[] args) {
        
         Scanner sc=new Scanner(System.in);  
         
        System.out.print("Introduceti x> ");
        int nrx=sc.nextInt();  
         inFor(nrx);
        System.out.println("\n");
           
        System.out.print("Introduceti y> ");
        int nry=sc.nextInt(); 
        inWhile(nry);
        
        System.out.println("\n");
         System.out.print("Introduceti z> ");
        int nrz=sc.nextInt(); 
        inIfElse(nrx);

    }
// instructiunea for
    public static void inFor(int mx) {
int x;
        for (x = 0; x < mx; x++) {
            System.out.println("x este egal " + x);
        }
    }

    //instructiunea while
    public static void inWhile(int y) {

        while (y <= 5) {
            System.out.println("y este egal " + y);
            y = y + 1;
        }

    }

    // instructiunea if/else
    
    public static void inIfElse(int z) {
        String m = "az";
        
        if (z == 10) {
            System.out.println("z egal cu 10");
        } else {
            System.out.println("z nu este egal cu 10");
        }
        if ((z < 3) & (m.equals("az"))) {
            System.out.println("cand ii mai mic ca 3");
        }
        System.out.println("se executa in mereu");

    }

}
