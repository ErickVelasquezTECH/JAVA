package org.example.PC.Excercises.forExercises;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Dime cuantos numeros vas a introducir");
        int quantity=scanner.nextInt();
        scanner.nextLine();
        int cont=0;
        for (int i=0; i<quantity; i++){
            System.out.println("Dime un numero");
            int number=scanner.nextInt();
            scanner.nextLine();
            if (number<0){
                cont++;
            }

        }
        System.out.println("Haz introducido "+cont+" numero negativos");
    }
}
