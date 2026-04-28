/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinariagrupo1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Atencion {
    private String fecha;
    private Mascota mascota;
    private ArrayList<Servicio> listaServicios;
    
    public Atencion(String fecha, Mascota mascota){    
        this.fecha = fecha;
        this.mascota = mascota;
        this.listaServicios = new ArrayList<>();  
    } 
    
   
    
    
}
