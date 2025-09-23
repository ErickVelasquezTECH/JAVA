package org.example.PC.Excercises.switchExercises;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Dime un operador: + o -");
        String operator=scanner.nextLine();
        switch (operator){
            case "+":
                System.out.println("Dime el primer valor");
                double n1= scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Dime el segundo valor");
                double n2= scanner.nextDouble();
                scanner.nextLine();
                double result=n1+n2;
                System.out.println("La suma de los numeros es "+result);
                break;
            case "-":
                System.out.println("Dime el primer valor");
                int n3= scanner.nextInt();
                scanner.nextLine();
                System.out.println("Dime el segundo valor");
                int n4= scanner.nextInt();
                scanner.nextLine();
                int result2=n3-n4;
                System.out.println("La suma de los numeros es "+result2);
                break;
            default:
                System.out.println("Operador no disponible");
                break;
        }
    }
}
