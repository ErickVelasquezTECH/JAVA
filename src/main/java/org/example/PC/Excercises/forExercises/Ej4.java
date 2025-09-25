package org.example.PC.Excercises.forExercises;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Dime un numero positivo");
        int n1=scanner.nextInt();
        int result=1;
        scanner.nextLine();
        for (int i=1;i<=n1; i++){
            result=result*i;
        }
        System.out.println(result);
    }
}