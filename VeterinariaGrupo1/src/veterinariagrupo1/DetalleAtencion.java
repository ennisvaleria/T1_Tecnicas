/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinariagrupo1;

/**
 *
 * @author USER
 */
public class DetalleAtencion {
    
    private ServicioVeterinario servicio;
    private double costo;
    
    public DetalleAtencion(ServicioVeterinario servicio)
    {
        this.servicio = servicio;
        this.costo = servicio.getCosto();
    }
    
    public double calcularSubtotal(){
        return this.costo;
    }
    
    public void mostrarDetalle(){
        System.out.println(" Servicio " + servicio.getNombre() + 
                "/ Costo: S/. " + this.costo);
    }

}
