/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testestudiasntes;

/**
 *
 * @author Estudiante
 */
public class OperacionesNumeros {

    public OperacionesNumeros() {

    }

    int[] diferenciaNumeros = null;

    public OperacionesNumeros(int[] diferenciaNumeros) {
        this.diferenciaNumeros = diferenciaNumeros;
    }

    private int numeroMayor() {
        int  numMayor=0;
        for (int i = 0; i < diferenciaNumeros.length; i++) {
             if(diferenciaNumeros[i]>numMayor){ // 
         numMayor = diferenciaNumeros[i];
         }
            int diferenciaNumero = diferenciaNumeros[i];
            
        }
        return numMayor;
    }
//Ordenar vector y la operacion se hace mas eficiente
    
    //n*(N-1)/2
 
}
