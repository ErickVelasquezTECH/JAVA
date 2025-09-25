package org.example.PC.Excercises.whileExercises;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Dime un numero");
        int n1=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Dime un segundo numero");
        int n2=scanner.nextInt();
        scanner.nextLine();
        while (n2<=n1){
            System.out.println("Dime el segundo numero");
            n2 = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("Los numeros son: "+n1+" y "+n2);
    }
}
