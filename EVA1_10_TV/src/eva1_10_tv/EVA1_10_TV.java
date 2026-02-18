/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_tv;

/**
 *
 * @author Moren
 */
public class EVA1_10_TV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TV tele = new TV();
        tele.consultarEstadoTV();
        tele.prenderYapagar();
        tele.consultarEstadoTV();
        tele.aumentarCanal();
        tele.aumentarCanal();
        tele.aumentarCanal();
        tele.consultarEstadoTV();
        tele.cambiarCanal(2);
        tele.consultarEstadoTV();
        tele.aumentarVol();
        tele.aumentarVol();
        tele.aumentarVol();
        tele.aumentarVol();
        tele.consultarEstadoTV();
        tele.decrementarVol();
        tele.decrementarVol();
        tele.consultarEstadoTV();
        tele.cambiarVol(100);
        tele.consultarEstadoTV();
        tele.prenderYapagar();
        tele.decrementarCanal();
        tele.decrementarCanal();
        tele.consultarEstadoTV();
        tele.prenderYapagar();
        tele.consultarEstadoTV();
        tele.decrementarCanal();
        tele.decrementarCanal();
        tele.consultarEstadoTV();
        // TODO code application logic here
    }
    
}
