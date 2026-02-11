/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_7_constructores;

/**
 *
 * @author Moren
 */
public class Persona {
    //ATRIBUTOS
    private String nombre;
    private String apellidos;
    private int edad;
    private char genero;
    //CONSTRUCTORES
    public Persona(){
        nombre = "----";
        apellidos = "----";
        edad = -1;
    }
    
    public Persona(String nombre, String apellidos, int edad){
        //this ----> operador para acceder al al contenido del objeto actual
        // permite visualizar todo lo que esta definido en la clase 
        
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String valor){
        nombre = valor;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public void setApellidos(String valor){
        apellidos = valor;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int valor){
        edad = valor;
    }
    
    public char getGenero(){
        return genero;
    }
    
    public void setGenero(char valor){
        genero = valor;
    }
    public void imprimirDatos(){
        System.out.println("--------- Datos de la persona ---------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
    }
    
    public String generarNombreCompleto(){
        return nombre + " " + apellidos;
    }
}

