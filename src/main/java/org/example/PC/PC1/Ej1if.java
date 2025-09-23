package org.example.PC.PC1;
import java.util.Scanner;
public class Ej1if {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int x=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce un segundo numero");
        int y=scanner.nextInt();
        scanner.nextLine();
        if(x>y){
            System.out.println("Es mayor");
        } else if (x<y) {
            System.out.println("Es menor");
        } else {
            System.out.println("Son iguales");
        }
    }
}
