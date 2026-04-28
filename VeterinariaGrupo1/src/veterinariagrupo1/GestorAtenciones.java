/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinariagrupo1;

import java.util.ArrayList;

/**
 *
 * @author valer
 */
public class GestorAtenciones {
    private ArrayList<Atencion> atenciones;
    
    public GestorAtenciones() 
    {
        this.atenciones = new ArrayList<>();
    }
    
    public void registrarAtencion(Atencion atencion)
    {
        atenciones.add(atencion);
        System.out.println("Atención #" + atencion.getCodigo() + " registrada.");
    }
    
    public void listarAtenciones() {
        if(atenciones.isEmpty())
        {
            System.out.println("No hay atenciones registradas.");
            return; 
        }
        System.out.println("\n---- Lista de Atenciones ----");
        for (Atencion a: atenciones)
        {
            a.mostrarAtencion();
        }
    }
    
    public Atencion buscarAtencionInterna(int codigo) {
    for (Atencion a : atenciones) {
        if (a.getCodigo() == codigo) {
            return a;
        }
    }
    return null;
}
    public Atencion obtenerMayorAtencion() {
    if (atenciones.isEmpty()) {
        return null;
    }

    Atencion mayor = atenciones.get(0);

    for (Atencion a : atenciones) {
        if (a.calcularTotal() > mayor.calcularTotal()) {
            mayor = a;
        }
    }

    return mayor;
}
    
}
