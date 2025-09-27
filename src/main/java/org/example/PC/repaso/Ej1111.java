package org.example.PC.repaso;

import java.util.Scanner;

public class Ej1111 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Dime un entero");
        int n1= scanner.nextInt();
        scanner.nextLine();

        System.out.println("Dime otro entero");
        int n2= scanner.nextInt();
        scanner.nextLine();

        while (n2<=n1){

            System.out.println("El segundo numero tiene que ser mayor");
            n2=scanner.nextInt();
            scanner.nextLine();
        }

        // n2>n1

    }
}

