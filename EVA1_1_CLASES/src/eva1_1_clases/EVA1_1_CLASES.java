/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_1_clases;

/**
 *
 * @author Moren
 */
public class EVA1_1_CLASES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear un objeto: ---> INSTANCIAR
        //Declarar = INTANCIACION
        // CLASE identificador = new CLASE (argumentos);
        // new --> crear el objeto en la memoria ram
        Persona perso1 = new Persona (); 
        System.out.println(perso1);
        perso1.nombre = "Juan";
        perso1.apellidos = "Perez";
        perso1.edad = 30;
        perso1.imprimir();
        // TODO code application logic here
    }
    
}

class Persona{
    //datos (estado), variables ---> atributos
    String nombre;
    String apellidos;
    int edad;
    //comportamiento --> metodos
    void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
    }
    
}
