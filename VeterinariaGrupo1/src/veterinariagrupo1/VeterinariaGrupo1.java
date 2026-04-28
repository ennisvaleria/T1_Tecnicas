/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package veterinariagrupo1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class VeterinariaGrupo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    GestorAtenciones gestor = new GestorAtenciones();
        int opcion;

        do {
            System.out.println("\n---- SISTEMA VETERINARIO ----");
            System.out.println("1. Registrar nueva atención");
            System.out.println("2. Agregar servicio a una atención");
            System.out.println("3. Calcular total de una atención");
            System.out.println("4. Listar todas las atenciones");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el código de la atención: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();
                    Atencion nuevaAtencion = new Atencion(codigo);
                    gestor.registrarAtencion(nuevaAtencion);
                    break;

                case 2:
                    System.out.print("Ingrese el código de la atención: ");
                    int codBuscar = sc.nextInt();
                    sc.nextLine();
                    Atencion atencion = gestor.buscarAtencionInterna(codBuscar);
                    if (atencion != null) {
                        System.out.print("Nombre del servicio: ");
                        String nombre = sc.nextLine();
                        System.out.print("Costo del servicio: ");
                        double costo = sc.nextDouble();
                        sc.nextLine();
                        atencion.agregarServicio(nombre, costo);
                    } else {
                        System.out.println("No se encontró la atención #" + codBuscar);
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el código de la atención: ");
                    int codTotal = sc.nextInt();
                    sc.nextLine();
                    Atencion atencionTotal = gestor.buscarAtencionInterna(codTotal);
                    if (atencionTotal != null) {
                        System.out.println("Total de la atención #" + codTotal +
                                           ": S/. " + atencionTotal.calcularTotal());
                    } else {
                        System.out.println("No se encontró la atención #" + codTotal);
                    }
                    break;

                case 4:
                    gestor.listarAtenciones();
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
