/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_10_tv;

/**
 *
 * @author Moren
 */
public class TV {
    private boolean estadoTV;
    private int canal;
    private int vol;
    
    public TV(){
        estadoTV = false;
        canal = 5;
        vol = 50;
    }
    
    public void prenderYapagar(){
        estadoTV = !estadoTV;
    }
    
    public void consultarEstadoTV(){
        if(estadoTV){
            System.out.println("Encendida");
            System.out.println("Canal: " + canal);
            System.out.println("Volumen: " + vol + "%");
        }else{
            System.out.println("Apagada");
        }
    }
    
    public void aumentarCanal(){
        if(estadoTV){
            if(canal > 99){
                this.canal++;
            }else{
                this.canal = 1;
            }
        }else{
        }
    }
    
    public void decrementarCanal(){
        if(estadoTV){
            if(canal > 1){
                this.canal--;
            }else{
                this.canal = 99;
            }
        }else{
        }
    }
    
    public void cambiarCanal(int canal){
        if(estadoTV){
            if(canal > 0 && canal < 100){
                this.canal = canal;
            }else if(canal >= 100){
                this.canal = 1;
            }else{
                this.canal = 99;
            }
        }else{}
    }
    
    public void aumentarVol(){
        if(estadoTV){
            if(this.vol == 100){
                System.out.println("volumen maximo");
            }else{
                this.vol++;
            }
        }else{
        }
    }
    
    public void decrementarVol(){
        if(estadoTV){
            if(this.vol == 0){
                System.out.println("volumen minimo");
            }else{
                this.vol--;
            }
        }else{
        }
    }
    
    public void cambiarVol(int vol){
        if(estadoTV){
            if(vol > 100){
                this.vol = 100;
            }else if(vol <= 100 && vol >= 0){
                this.vol = vol;
            }else{
                this.vol = 0;
            }
        }else{
        }
    }
}
