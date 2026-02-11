/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_vehiculo;

/**
 *
 * @author Moren
 */
public class EVA1_5_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setMarca("Lamborghini");
        vehiculo.setModelo("Murcielago GT");
        vehiculo.setYear(1995);
        vehiculo.setColor("Negro");
        vehiculo.setKilometraje(1232);
        vehiculo.setPrecio(1200000);
        vehiculo.imprimirDatos();
        
        Vehiculo[] agencia = new Vehiculo[10];
        for (int i = 0; i < agencia.length; i++){
            agencia[i] = new Vehiculo();
            agencia[i].setMarca("Lamborghini");
            agencia[i].setModelo("Murcielago GT");
            agencia[i].setYear(1995);
            agencia[i].setColor("Negro");
            agencia[i].setKilometraje(1232);
            agencia[i].setPrecio(1200000);
            agencia[i].imprimirDatos();
        }
        // TODO code application logic here
    }
    
}
