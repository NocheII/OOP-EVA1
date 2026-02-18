/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_static;

/**
 *
 * @author Moren
 */
public class EVA1_11_STATIC {
    public int x = 100;

    public static void main(String[] args) {
        System.out.println("--------Math--------");
        //Math math = new Math();
        System.out.println("pi: " + Math.PI);
        System.out.println("Random: " + Math.random());
        System.out.println("Cuadrado(5): " + Math.pow(5,2));
        System.out.println("--------Matematicas--------");
        //Matematicas mate = new Matematicas();
        //System.out.println("pi: " + mate.PI);
        System.out.println("pi: " + Matematicas.PI);
        Matematicas mate = new Matematicas();
        System.out.println("Cuadrado(5): " + mate.cuadrado(5));
        EVA1_11_STATIC obj = new EVA1_11_STATIC();
        System.out.println("X: " + obj.x);
        // TODO code application logic here
    }
    
}

class Matematicas{
    public final static double PI = 3.1416;
    public double cuadrado (double valor){
        return valor * valor;
    }
    
}
