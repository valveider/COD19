package boletin19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Boletin19 {

    public static void main(String[] args) {

        ArrayList<Cole> lista = new ArrayList<>();
        Scanner obj = new Scanner(System.in);
        int salir = 1;
        System.out.println("Indique que desea hacer:\n1.Crear lista nueva\n2.Visualizar lista\n3.Ver la n0ta de un determinado alumno\n4.Añadir un alumno\n5.Eliminar un alumno\n6.Consultar la existencia de un alumno\n7.Salir");
        int opcion = obj.nextInt();
        while (opcion != 7) {
            if (opcion == 1) {
                while (salir != 0) {
                    System.out.println("Introduce el nombre del alumno");
                    String x = obj.next();
                    System.out.println("Introduce la nota del alumno " + x);
                    int y = obj.nextInt();
                    Cole crear = new Cole(x, y);
                    lista.add(crear);
                    System.out.println("¿Desea continuar añadiendo alumnos?\nPresione 0 para salir\nPresione 1 para continuar");
                    salir = obj.nextInt();
                }
            } else if (opcion == 2) {
                for (Iterator<Cole> it = lista.iterator(); it.hasNext();) {
                    Cole i = it.next();
                    System.out.println("nome: " + i.getNombre() + "\t\tnota: " + i.getNota());
                }
            }

        }
    }
}
