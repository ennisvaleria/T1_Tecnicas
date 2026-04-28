/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinariagrupo1;

/**
 *
 * @author USER
 */
public class ServicioVeterinario {
    private String nombre;
    private double costo;
    
    public ServicioVeterinario(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }
    
    public String getNombre()
    {
    return this.nombre;
    }
    
   public double getCosto()
   {
       return this.costo;
   }
   
    @Override
   public String toString()
   {
       return this.nombre + " - S/.  " + this.costo;
   }
}


        
