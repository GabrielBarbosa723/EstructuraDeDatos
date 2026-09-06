/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eficiencia;

/**
 *
 * @author Gabriel
 */
public class Ejercicio01_OConstante {
       public static void main(String[] args) {

        int n = 1000; // realmente no afecta la cantidad de operaciones
        int contador = 0;

        System.out.println("Inicio del algoritmo");

        contador++; // operación 1
        int x = 5;

        contador++; // operación 2
        int y = 10;

        contador++; // operación 3
        int suma = x + y;

        contador++; // operación 4
        System.out.println("La suma es: " + suma);

        System.out.println("Valor de n: " + n);
        System.out.println("Operaciones contadas: " + contador);
        System.out.println("Complejidad: O(1)");
    }
    
}
