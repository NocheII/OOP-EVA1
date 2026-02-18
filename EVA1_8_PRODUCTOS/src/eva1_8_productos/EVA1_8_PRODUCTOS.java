/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_productos;

/**
 *
 * @author Moren
 */
public class EVA1_8_PRODUCTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Productos producto = new Productos ("Tomates", "Heinz", 5.49, 5, "kg");
        producto.imprimirDatos();
        producto.imprimirConMonto();
        // TODO code application logic here
    }
    
}
