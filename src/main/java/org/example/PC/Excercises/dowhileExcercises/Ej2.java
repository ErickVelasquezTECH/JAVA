package org.example.PC.Excercises.dowhileExcercises;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option, numb1, numb2;
        do {
            System.out.println("1. Sumar dos numeros");
            System.out.println("2. Restar dos numeros");
            System.out.println("3. Multiplicar dos numeros");
            System.out.println("4. Salir");
            option=scanner.nextInt();
            scanner.nextLine();
            if (option==1){
                System.out.println("Dime el primer numero");
                numb1= scanner.nextInt();
                scanner.nextLine();
                System.out.println("Dime el segundo numero");
                numb2= scanner.nextInt();
                scanner.nextLine();
                System.out.println("La suma es: "+(numb1+numb2));
            } else if (option==2) {
                System.out.println("Dime el primer numero");
                numb1= scanner.nextInt();
                scanner.nextLine();
                System.out.println("Dime el segundo numero");
                numb2= scanner.nextInt();
                scanner.nextLine();
                System.out.println("La resta es: "+(numb1-numb2));
            } else if (option ==3) {
                System.out.println("Dime el primer numero");
                numb1= scanner.nextInt();
                scanner.nextLine();
                System.out.println("Dime el segundo numero");
                numb2= scanner.nextInt();
                scanner.nextLine();
                System.out.println("La multiplicacion2 es: "+(numb1*numb2));
            } else {
                System.out.println("Opcion invalida");
            }
        }while (option!=4);
    }
}
