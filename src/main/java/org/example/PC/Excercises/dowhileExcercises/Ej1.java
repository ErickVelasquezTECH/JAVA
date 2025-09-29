package org.example.PC.Excercises.dowhileExcercises;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int option;
        String name;
        do {
            System.out.println("1. Saludo");
            System.out.println("2. Grito");
            option= scanner.nextInt();
            scanner.nextLine();
            if (option==1){
                System.out.println("Dime tu nombre");
                name=scanner.nextLine();
                System.out.println("Hola, "+name);
            } else if (option==2){
                System.out.println("Dime tu nombre");
                name=scanner.nextLine();
                System.out.println("Cuidado, "+name+"!");
            }
        }while (option!=3);
    }
}
