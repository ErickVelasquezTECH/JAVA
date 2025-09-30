package org.example.PC.Excercises.buclesAnidados;

import java.util.Scanner;

public class Ej5BuclesAnidados {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int v1, v2;
        do {
            System.out.println("Dime un numero entero");
            v1=scanner.nextInt();
            scanner.nextLine();
            System.out.println("Dime otro numero entero");
            v2=scanner.nextInt();
            scanner.nextLine();
            if ((v1<=0)||(v2<=0)){
                System.out.println("Deben ser los dos enteros positivos");
            } else if (v1<v2) {
                System.out.println("El primer entero debe ser mayor");
            }
        } while ( (v1<=0 || v2<=0)||v1<v2);
        for (int x = v2; x <= v1; x++) {
            int sum=0;
            for (int y = 0; y <=x ; y++) {
                sum=sum+y;
            }
            System.out.println("La sumatoria de "+v2+":"+sum);
        }
    }
}
