/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_8_productos;

/**
 *
 * @author Moren
 */
public class Productos {
    //ATRIBUTOS
    private String nombre;
    private String marca;
    private double precio;
    private int cantidad;
    private String unidad;
    //CONSTRUCTORES
    public Productos(){
        nombre = "----";
        marca = "----";
        precio = -1;
        cantidad = -1;
        unidad = "?";
    }
    
    public Productos(String nombre, String marca, double precio, int cantidad, String unidad){
        //this ----> operador para acceder al al contenido del objeto actual
        // permite visualizar todo lo que esta definido en la clase 
        
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidad = cantidad;
        this.unidad = unidad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String valor){
        nombre = valor;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String valor){
        marca = valor;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double valor){
        precio = valor;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public void setCantidad(int valor){
        cantidad = valor;
    }
    
    public String getUnidad(){
        return unidad;
    }
    
    public void setUnidad(String valor){
        unidad = valor;
    }
    
    public void imprimirDatos(){
        System.out.println("--------- Datos del producto ---------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Unidad: " + unidad);
    }
    
    public double calcularMonto(){
        return precio*cantidad;
    }
    
    public void imprimirConMonto(){
        imprimirDatos();
        System.out.println("Monto: " + calcularMonto());
    }
    
}
