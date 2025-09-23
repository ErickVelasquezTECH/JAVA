package org.example.PC.Excercises.forExercises;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero");
        int n1=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Dime un segundo numero");
        int n2=scanner.nextInt();
        scanner.nextLine();
        if (n1>n2){
            for (int i=n2; i<=n1; i++) {
                System.out.println(i);
            }
        } else {
            for (int i=n1; i<=n2; i++) {
                System.out.println(i);
            }
        }
    }
}
