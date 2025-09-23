package org.example.PC;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Mostramos por pantalla un mensaje para que el usuario sepa que debe
        // introducir la edad
        System.out.println("Introduce tu edad...");
        // Leemos un número entero y lo guardamos en age
        int age = scanner.nextInt();
        // Esta sentencia debe ir siempre después de un nextInt() para pasar a la
        // siguiente línea de la entrada estándar
        scanner.nextLine();
        // Mostramos la edad introducida por el usuario
        System.out.println("Tienes " + age + " años");
    }
}

