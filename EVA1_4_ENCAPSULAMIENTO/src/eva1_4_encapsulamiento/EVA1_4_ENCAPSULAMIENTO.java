/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_encapsulamiento;

/**
 *
 * @author Moren
 */
public class EVA1_4_ENCAPSULAMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Carlos");
        persona.setApellidos("Noche");
        persona.setEdad(19);
        persona.setGenero('H');
        
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellidos: " + persona.getApellidos());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Genero: " + persona.getGenero());
        persona.imprimirDatos();
        persona.generarNombreCompleto();
        System.out.println("Nombre Completo: " + persona.generarNombreCompleto());
        
        // TODO code application logic here
    }
    
}
