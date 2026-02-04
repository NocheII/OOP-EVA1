/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_2_modificadores.de.acceso;

/**
 *
 * @author Moren
 */
public class EVA1_2_MODIFICADORESDEACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona();
        //persona. //No se pueden ver los atributos (son privados)
        // TODO code application logic here
    }
    
}
class Persona{
    //datos (estado), variables ---> atributos
    private String nombre;
    private String apellidos;
    private int edad;
}