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
public class TestEstudiasntes {

    /**
     * @param args the command line arguments
     */
    // Estudiantes
    public static String asistenciaClase(int minimoAlumnosPermitudos, int[] tiempoLlegadaEst) {
        int cantidadAlumnosPuntuales = 0;
        final String hayClases = "YES";
        final String noHayClases = "NO";
        for (int i = 0; i < tiempoLlegadaEst.length; i++) 
            if (tiempoLlegadaEst[i] <= 0) 
                cantidadAlumnosPuntuales++;
        return cantidadAlumnosPuntuales < minimoAlumnosPermitudos ? hayClases : noHayClases;
    }

    /**
     * dado un numero de n digitos se quiere calcular cuantsa de sus digitos
     * @param args 
     */
    public static int totalDivisorDigits(int numero){
        String convDigitoaCadena=Integer.toString(numero);
        int contarDivisores=0;
        for (int i = 0; i < convDigitoaCadena.length(); i++) {
          int digitFromNumer=Integer.valueOf(Character.toString(convDigitoaCadena.charAt(i)));
            if (digitFromNumer!=0 && numero%digitFromNumer==0) {
                contarDivisores++;
            }
            
        }
        return contarDivisores;
    }
    //putos chocolates
    public static int totalChocolatesaParaComer(int  dolaresChocolates , int costoChocolate, int cantidadEnvolturas){
      int cantChocolates=dolaresChocolates/costoChocolate;
	int cantChocoComer =cantChocolates;
	while(cantChocolates>=cantidadEnvolturas){
		int chocolatePromo =cantChocolates /cantidadEnvolturas;
		cantChocoComer +=chocolatePromo;
	cantChocolates=cantChocolates%cantidadEnvolturas;
	cantChocolates+=chocolatePromo;
	}
	return cantChocoComer;
    }
  
    public static void main(String[] args) {
        // TODO code application logic here
    int cantidad= TestEstudiasntes.totalChocolatesaParaComer(6, 2, 3);
        System.out.println("****************************************");
        System.out.println("Cantidad: "+cantidad);
    }

}
