/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_geometria;

/**
 *
 * @author Moren
 */
public class EVA1_13_GEOMETRIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Area de un Cuadrado (lado: 5): " + geometria.CuadArea(5));
        System.out.println("Area de un Rectangulo (base: 3 |altura: 5): " + geometria.RectArea(3, 5));
        System.out.println("Area de un Triangulo (base: 3 |lado: 4): " + geometria.TriaArea(3, 4));
        System.out.println("Area de un Circulo (radio: 3): " + geometria.CircArea(3));
        System.out.println("Area de un Rombo (diagonal mayor: 5 | diagonal menor: 4): " + geometria.RombArea(5, 4));
        System.out.println("Area de un Circulo (base mayor: 5 | base menor: 3 | altura: 3): " + geometria.TrapArea(5, 3, 3));
        // TODO code application logic here
    }
    
}
class geometria{
    public static double CuadArea (double lado){
        double resu;
        resu = lado*lado;
        return resu;
    }
    
    public static double CuadPeri (double lado){
        double resu;
        resu = 4*lado;
        return resu;
    }
    
    public static double RectArea (double base, double high){
        double resu;
        resu = base*high;
        return resu;
    }
    
    public static double RectPeri (double base, double high){
        double resu;
        resu = (2*base)+(2*high);
        return resu;
    }
    
    public static double TriaArea (double base, double high){
        double resu;
        resu = (base*high)/2;
        return resu;
    }
    
    public static double TriaPeri (double lado1, double lado2, double lado3){
        double resu;
        resu = lado1 + lado2 + lado3;
        return resu;
    }
    
    public static double CircArea (double radio){
        double resu;
        resu = (radio*radio)*Math.PI;
        return resu;
    }
    
    public static double CircPeri (double radio){
        double resu;
        resu = (2*radio)*Math.PI;
        return resu;
    }
    
    public static double RombArea (double diagonalM, double diagonalm){
        double resu;
        resu = (diagonalM*diagonalm)/2;
        return resu;
    }
    
    public static double RombPeri (double lado1, double lado2, double lado3,double lado4){
        double resu;
        resu = lado1 + lado2 + lado3 + lado4;
        return resu;
    }
    
    public static double TrapArea (double baseM, double basem, double high){
        double resu;
        resu = (baseM+basem)*high/2;
        return resu;
    }
    
    public static double TrapPeri (double lado1, double lado2, double lado3,double lado4){
        double resu;
        resu = lado1 + lado2 + lado3 + lado4;
        return resu;
    }
}
