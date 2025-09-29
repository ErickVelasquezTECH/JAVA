package org.example.PC.Excercises.whileExercises;

import java.util.Scanner;

public class Ej2BuclesAnidados {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dime un numero");
        int numb=scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i<=numb ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }


    }
}
