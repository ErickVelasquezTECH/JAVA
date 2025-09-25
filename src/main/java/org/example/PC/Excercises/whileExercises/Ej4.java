package org.example.PC.Excercises.whileExercises;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dime un numero");
        int n1=scanner.nextInt();
        scanner.nextLine();
        int counter=0;
        while (n1>0){
            counter++;
            System.out.println("Dime un numero");
            n1=scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("Haz introducido: "+counter+" numeros");
    }
}
