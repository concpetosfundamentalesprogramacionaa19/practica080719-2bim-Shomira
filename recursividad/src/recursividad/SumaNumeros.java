/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author FJTAMATTSH
 */
public class SumaNumeros {

    public static int laSuma(int valor) {
        //inicializacion de variavles a usar 
        int suma = 0;
        //Ciclo for que esta inicializado la variable para entrara al metodo
        for (int i = 1; i <= valor; i++) {
            suma = suma + i;
        }
        //Retorna un valor
        return suma;
    }

    public static int obtenerSumaDos(int valor) {
        /*si el valor es <= 0 retorna a cero y la recursivoidad para
        y si el valor es > 0  el valor se va a calcular con el metodo de suma
        y retorna un valor entero*/
        if (valor <= 0) {
            return 0;
        } else {
            return valor + obtenerSumaDos(valor - 1);
        }

    }
   
}
