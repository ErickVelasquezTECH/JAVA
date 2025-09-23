package org.example.PC.Excercises.Ifexercises;
import java.util.Scanner;
public class IfExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número");
        int x = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce otro número");
        int y = scanner.nextInt();
        scanner.nextLine();
        // La siguiente línea crea una claúsula if
        if (x > y) {
            // Todas las sentencias que pongamos aquí se ejecutarán sólo si x es mayor que y
            System.out.println("x es mayor que y");
        }

        System.out.println("Esto se ejecuta siempre");
    }

    public static class Ej6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("ELige una opcion: + o -");
            String operation= scanner.nextLine();
            if(operation.equals("+")){
                System.out.println("Dime un valor");
                double date1=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Dime un segundo valor");
                double date2=scanner.nextInt();
                scanner.nextLine();
                double resultant = date2 + date1;
                System.out.println("El resultant es "+resultant );
            } else if (operation.equals("-")) {
                System.out.println("Dime un valor");
                int date3=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Dime un segundo valor");
                int date4=scanner.nextInt();
                scanner.nextLine();
                int resultant = date3 - date4;
                System.out.println("El resultant es " + resultant );

            }
        }
    }
}