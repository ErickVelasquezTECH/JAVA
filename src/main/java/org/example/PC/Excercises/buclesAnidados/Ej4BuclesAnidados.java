package org.example.PC.Excercises.buclesAnidados;

import java.util.Scanner;

public class Ej4BuclesAnidados {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dime un numero positivo");
        int numb=scanner.nextInt();
        scanner.nextLine();
        while (numb<0){
            System.out.println("Debe ser mayor");
            numb=scanner.nextInt();
            scanner.nextLine();
        }
        for (int i=numb; i>=1 ; i--) {
            for (int x=1; x<=i; x++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
