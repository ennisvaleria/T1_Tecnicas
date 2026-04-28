/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinariagrupo1;

/**
 *
 * @author USER
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    private Cliente dueño; 
    
    public Mascota(String nombre, String especie, int edad, Cliente dueño) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.dueño = dueño;
    }
    
    
    
}
