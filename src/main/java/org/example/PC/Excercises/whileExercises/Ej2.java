package org.example.PC.Excercises.whileExercises;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Dime un numero decimal");
        double n1=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Dime un segundo decimal");
        double n2=scanner.nextDouble();
        scanner.nextLine();
        while (n2>=n1){
            System.out.println("Dime el segundo decimal");
            n2=scanner.nextDouble();
            scanner.nextLine();
        }
        System.out.println("Los numeros decimales son "+n1+ " y "+n2);
    }
}
