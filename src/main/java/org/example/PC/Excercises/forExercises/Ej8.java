package org.example.PC.Excercises.forExercises;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Dime cuantos numeros vas a introducir");
        int quantity=scanner.nextInt();
        scanner.nextLine();
        int addition=0;
        for (int i=0; i<quantity; i++){
            System.out.println("Dime un numero");
            int numb1=scanner.nextInt();
            addition=addition+numb1;
            }
        System.out.println("La media es "+addition/quantity);
    }
}
