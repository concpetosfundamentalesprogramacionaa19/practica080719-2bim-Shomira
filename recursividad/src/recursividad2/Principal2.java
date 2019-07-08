/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad2;

/**
 *
 * @author FJTAMATTSH
 */
public class Principal2 {

    public static void main(String[] args) {
        //Arreglo definido 
        int[] arreglo = {10, 20, 30, 1, 2, 3, 40, 4};
        //arreglo.length para asignar el tamaño 
       
        int resultado = Ejercicio2.obtenerTamanioArreglo(arreglo, arreglo.length);
        //I9mpresion del resultado del metodo que tiene la recursividad
        System.out.println(resultado);
        int suma = Ejercicio2.obtenerSumaArreglo(arreglo);
        System.out.println(suma);
    }
}
