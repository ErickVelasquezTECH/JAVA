package org.example.PC;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hola bro");
    }
}
ackage org.example.PC.proyecto;

import java.util.Scanner;

public class TareaBorrador {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int option, numbR, numbI, media=0;
        do {
            System.out.println("1. Repite mensaje");
            System.out.println("2. Media");
            System.out.println("3. Salir");
            option=scanner.nextInt();
            scanner.nextLine();
            if(option==1){
               do {
                    System.out.println("Dime un numero mayor a 0");
                    numbR=scanner.nextInt();
                    scanner.nextLine();
                } while(numbR<=0);
                System.out.println("Introduce un mensaje");
                String message=scanner.nextLine();
                for (int i=0; i<numbR; i++) {
                    System.out.println(message);
                }
            } else if (option==2){
                do {
                    System.out.println("Dime cuantos numeros vas a meter");
                    numbI= scanner.nextInt();;
                    scanner.nextLine();
                }while (numbI<0);
                for (int x=0; x<numbI; x++) {
                    System.out.println("Dime el numero");
                    int n1= scanner.nextInt();
                    scanner.nextLine();
                    media=media+n1;
                }
                media=media/numbI;z
                System.out.println("La media de los numeros introducidos es: "+media);
            } else {
                System.out.println("La opción es invalida");
            }
        }while(option!=3);
    }
}

