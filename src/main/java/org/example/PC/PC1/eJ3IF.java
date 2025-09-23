package org.example.PC.PC1;

import java.util.Scanner;

public class eJ3IF {
    public static void main(String[] args) {
        Scanner scanner =new Scanner (System.in);
        System.out.println("Dime un numero");
        int n= scanner.nextInt();
        if (n==0){
            System.out.println("No es positivo ni negativo");
        } else if (n>0) {
            System.out.println("Es positivo");

        } else {
            System.out.println("Es negativo");
        }
    }
}
