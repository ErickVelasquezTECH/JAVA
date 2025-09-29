package org.example.PC.Excercises.buclesAnidados;

import java.util.Scanner;

public class Ej3BuclesAnidados {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.println("Dime un numero entero positivo");
        int numb= scanner.nextInt();
        scanner.nextLine();
        while (numb<0){
            System.out.println("Tiene que ser positivo");
            numb=scanner.nextInt();
        }
        for (int i=1; i<=numb; i++) {
            for (int x=1; x<=i; x++) {

                System.out.print(x);


            }
            System.out.println();

        }

    }
}
