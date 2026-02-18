/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_temp;

/**
 *
 * @author Moren
 */
public class EVA1_12_TEMP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("50C = " + Temperatura.centAFahr(50) + "F");
        System.out.println("122F = " + Temperatura.fahrACent(122) + "C");
        System.out.println("50C = " + Temperatura.celAKel(50) + "K");
        System.out.println("323.15K = " + Temperatura.kelACel(323.15) + "C");
        System.out.println("122F = " + Temperatura.fahrAKel(122) + "K");
        System.out.println("323.15K = " + Temperatura.kelAFahr(323.15) + "F");
        // TODO code application logic here
    }
    
}
class Temperatura{
    public static double centAFahr (double cent){
        double resu;
        resu = (cent * (9.0/5.0)) + 32;
        return resu;
    }
    
    public static double fahrACent (double fahr){
        double resu;
        resu = (9.0/5.0) * (fahr - 32);
        return resu;
    }
    
    public static double celAKel (double cel){
        double resu;
        resu = cel + 273.15;
        return resu;
    }
    
    public static double kelACel (double kel){
        double resu;
        resu = kel - 273.15;
        return resu;
    }
    
    public static double fahrAKel (double fahr){
        double resu;
        resu = ((5)*(fahr - 32))/9 + 273.15;
        return resu;
    }
    
    public static double kelAFahr (double kel){
        double resu;
        resu = ((9)*(kel - 273.15))/5 + 32;
        return resu;
    }
}

