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
public class Ejercicio2 {
 //Generacion de un metodo que espera la entrada de un arreglo y unumero entero
    public static int obtenerTamanioArreglo(int arreglo2[], int tamanio) {
        //condicin para que se ejecute elmetodo que contiene la recursividad
        if (tamanio == 1) {
            return arreglo2[0];
        } else {
            //si la condicion no se cumple retorna la posicion del arreglo - 1
            return arreglo2[tamanio - 1] + obtenerTamanioArreglo(arreglo2, 
                    tamanio - 1 ); 
        }
         
    }
    //Generacion de un metodo que suma los elementos dle arreglo
    public static int obtenerSumaArreglo(int arreglo[]){
        int suma = 0;
        /*condicion para sumara los valores del arreglo toamando en cuenta 
        el tamaño del arreglo*/
        for (int i = 0;i < arreglo.length;i++){
           suma += arreglo[i];
        }
        return suma;
    }

    /*Realizar una prueba del método obtenerTamanioArreglo con los valores
    {10, 20, 30, 1, 2, 3, 40, 4}; además crear un método con un ciclo 
    repetitivo que permita obtener el mismo resultado del método recursivo*/
}
