/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_constructores;

/**
 *
 * @author Moren
 */
public class EVA1_7_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona perso = new Persona();
        perso.imprimirDatos();
        
        Persona perso2 = new Persona("Juan", "Perez Jolote", 30);
        perso2.imprimirDatos();
        // TODO code application logic here
    }
    
}
