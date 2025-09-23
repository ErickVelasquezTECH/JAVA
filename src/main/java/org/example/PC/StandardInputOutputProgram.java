package org.example.PC;
import java.util.Scanner;

public class StandardInputOutputProgram {
    public static void main(String[] args) {
        // Creamos la utilidad scanner con la que después solicitamos datos al usuario
        Scanner scanner = new Scanner(System.in);
        // Mostramos por pantalla un mensaje para que el usuario sepa que debe
        // introducir un texto
        System.out.println("Introduce tu nombre de usuario...");
        // Leemos un String que nos pasa el usuario y lo guardamos en username
        String username = scanner.nextLine();
        // Mostramos un texto de bienvenida al usuario
        System.out.println("Bienvenido " + username);
    }
}
