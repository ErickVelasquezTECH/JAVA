package org.example;

import java.util.Scanner;

public class Ej2if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero entero");
        int  n = scanner.nextInt();
        if (n == 0){
            System.out.println("No es ni par ni impar");
        } else if (n % 2 == 0) {
            System.out.println("Es par");
            
        }else {
            System.out.println("Es impar");
        }
    }

}
