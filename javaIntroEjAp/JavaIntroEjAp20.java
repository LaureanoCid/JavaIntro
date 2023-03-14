/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package javaIntroEjAp;

import java.util.Scanner;

public class JavaIntroEjAp20 {

    public static void main(String[] args) { 
        
        Scanner leer = new Scanner(System.in);
        
        int filas = 3, columnas = 3, num;
        
        int [] [] cuboMagico = new int [filas][columnas];
        
        //Llenado de Matriz con un numero entre 1-9
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                do {
                    System.out.println("Ingrese un numero entre 1-9: ");
                    num = leer.nextInt();
                } while (num<1 || num>9);
                
                cuboMagico[i][j] += num;
                                                       
            }   
        }
    }    
}
