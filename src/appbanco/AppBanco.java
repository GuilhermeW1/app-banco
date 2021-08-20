/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbanco;

/**
 *
 * @author guiaw
 */
public class AppBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta conta1 = new Conta("Joao", 10, 2000, 2000);
        Conta conta2 = new Conta("Pedro", 11, 3000, 3000);
        conta1.saldo();
        System.out.println("==========");
        conta1.deposito( 100);
        conta1.sacar(2000);
        conta1.saldo();
        
        /*
        conta1.saldo();
         System.out.println("==========");
         conta2.saldo();
         System.out.println("==========");
        conta1.transferencia(10, 11, 100);
        
        conta1.saldo();
         System.out.println("==========");
         conta2.saldo();
         */        
    }
    
    
    
}
