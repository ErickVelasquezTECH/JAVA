package org.example.PC.Excercises.buclesAnidados;

import java.util.Scanner;

public class Ej1BuclesAnidados {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Dime un entero positivo");
        int numb= scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i<= numb; i++) {
            for (int j=numb-(numb-i); j<=numb+(i-1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
