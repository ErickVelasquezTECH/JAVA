package org.example.PC.Excercises.forExercises;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Dime un numero entero");
        int n1=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Dime un mensaje");
        String message=scanner.nextLine();
        for (int i= 0; i<n1; i++){
            System.out.println(message);
        }
    }
}
