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
public class Atencion {
    private int codigo;
    private ArrayList<DetalleAtencion> detalles;
    
    public Atencion(int codigo)
    {
        this.codigo = codigo;
        this.detalles = new ArrayList<>();
    }
    
    public int getCodigo()
    {
        return this.codigo;
    }
    public ArrayList<DetalleAtencion> getDetalles()
    {
        return detalles;
    }
}
