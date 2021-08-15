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
public class Conta {

   
    
    private String nome;
    private int conta;
    private int agencia;
    private double saldo;

    public void saldo(){
        System.out.println("Nome "+this.getNome());
        System.out.println("Saldo "+this.getSaldo());
        
    }

    public Conta(String nome, int conta, double saldo) {
        this.nome = nome;
        this.conta = conta;
        this.saldo = saldo;
    }
    
    public void sacar(int contaBanco, double v){
        System.out.println("Sacando");
        if(contaBanco == getConta()){
        double saldoo = this.getSaldo() -v;
        this.saldo = saldoo;
        }
            
    }    
    
    public void deposito(int contaBanco, double v){
        System.out.println("Depositando");
        if(contaBanco == getConta()){
         double saldoo = this.getSaldo() +v;
         this.saldo = saldoo;
        }
    }   
    
    public void transferencia(int contaBanco1, int contaBanco2, double v){
        System.out.println("Transferindo");
          sacar(contaBanco1, v);
          
          deposito(contaBanco2, v);
      
            
    }  
    
   
    
    
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    
}
