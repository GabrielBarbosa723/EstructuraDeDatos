
package Analisis_de_algoritmos_y_complejidad;

public class AnalisisAlgortimos {
    
    public static void main (String[]args){
        
        int n = 10;
        int contador = 0;
        
        //Algortimo O(n)
        for (int i = 0; i<n ; i++){
            System.out.println("Iteración: "+i);
            contador++;
        }
        
        System.out.println("Total de ejecuciones: "+ contador);
        
        
        
    }
    
}
