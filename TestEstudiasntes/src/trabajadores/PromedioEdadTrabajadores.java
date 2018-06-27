/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajadores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class PromedioEdadTrabajadores {

    private static double calcularPromedioEdades(List<Trabajador> trabajadores) {
        Iterator<Trabajador> it = trabajadores.iterator();
        int promedioEdades = 0, suma = 0;
        int cantidadTrabajadores = trabajadores.size();
        while (it.hasNext()) {

            System.out.println(it.next());
// suma+=it.next().getEdad();
            System.out.println(it.next().getEdad());
            System.out.println("s:" + suma);
        }
        System.out.println("Edad: " + suma / cantidadTrabajadores);
        return 0.0;
    }

    public static void main(String[] args) {
        Trabajador a = new Trabajador();
        a.setNombre("Diego");
        a.setEdad(24);
        Trabajador a1 = new Trabajador();
        a1.setNombre("Nancy");
        a1.setEdad(15);
        List<Trabajador> trabajadores = new ArrayList<>();
        trabajadores.add(a);
        trabajadores.add(a1);
        PromedioEdadTrabajadores.calcularPromedioEdades(trabajadores);
    }
}
