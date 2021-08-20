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
    private double chequeespecial;

    public void saldo(){
        System.out.println("Nome "+this.getNome());
        System.out.println("Saldo "+this.getSaldo());
        
    }

    public Conta(String nome, int conta, double saldo, double chequeespecial) {
        this.nome = nome;
        this.conta = conta;
        this.saldo = saldo;
        this.chequeespecial = chequeespecial;
    }
    
    public void sacar(double v){
       try{
      
           double resultado = this.saldo -v;
           if(resultado >= (this.chequeespecial * -1)){
                this.saldo = this.saldo -v;
            }
       }catch(Exception ex){
             System.err.println(ex.getMessage());
       }  
    }    
    
    public void deposito(double v){
        try{
        
            this.saldo = this.saldo +v;
        }catch(Exception e){
                System.err.println(e.getMessage());
        }
    }   
    
    public void transferencia(Conta transferencia, double v){
     try{
        sacar(v);
        transferencia.deposito(v);
      
     }catch(Exception ex){
         System.err.println(ex.getMessage());
     }
            
    }  

    public double getChequeespecial() {
        return chequeespecial;
    }

    public void setChequeespecial(double chequeespecial) {
        this.chequeespecial = chequeespecial;
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
