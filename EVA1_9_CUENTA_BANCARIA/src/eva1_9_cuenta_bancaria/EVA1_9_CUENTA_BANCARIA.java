/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_cuenta_bancaria;

/**
 *
 * @author Moren
 */
public class EVA1_9_CUENTA_BANCARIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Carlos Noche", 1000);
        cuenta.imprimirSaldo();
        cuenta.depositar(500);
        cuenta.imprimirSaldo();
        cuenta.depositar(180);
        cuenta.imprimirSaldo();
        cuenta.retirar(1976);
        cuenta.imprimirSaldo();
        // TODO code application logic here
    }
    
}
