/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Leandro
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    public void estadoAtual(){
        System.out.println("ESTADO ATUAL DA CONTA");
        System.out.println("-------------------------");
        System.out.println("");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("saldo: " + this.getSaldo());
        if(this.isStatus() == true){
            System.out.println("Estado da conta: Aberta");
        } else{
            System.out.println("Estado da conta: Fechada");
        }
        System.out.println("");
    }
    
    
    
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if(tipo.equals("CC")){
            this.setSaldo(50);
        } else if(tipo.equals("CP")){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
        
        
    }
    
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada pois possui saldo");
            System.out.println("");
        }
        else if(this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada pois tem débito");
            System.out.println("");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
            System.out.println("");
        }
        
        
    }
    
    public void depositar(double valor){
        if(this.isStatus() == true){
            this.setSaldo(this.getSaldo()+valor);
            System.out.println("Depósito realizado com sucesso na conta de " 
            + this.getDono());
            System.out.println("Saldo: " + this.getSaldo());
            System.out.println("");
            
        } else{
            System.out.println("Impossivel depositar(conta fechada)");
            System.out.println("");
        }
        
    }
    
    public void sacar(double valor){
        if(this.isStatus() == true){
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de: "
                + this.getDono());
                System.out.println("Saldo: " + this.getSaldo());
                System.out.println("");
            }else{
                System.out.println("Saldo Insuficiente");
                System.out.println("");
            }
        }else{
            System.out.println("Impossivel sacar (Conta Fechada)");
            System.out.println("");
        }
            
        
    }
    
    public void pagarMensal(){
        double valor = 0;
        if(this.getTipo().equals("CC")){
            valor = 12;
        }else if(this.getTipo().equals("CP")){
            valor = 20;
        }
        
        if(this.isStatus() == true){
            if(this.getSaldo() > valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Mensalidade paga com sucesso por "
                + this.getDono());
                System.out.println("Saldo: " + this.getSaldo());
            }
        }else{
            System.out.println("Impossivel pagar (Conta Fechada)");
            
        }
        
    }
    
    

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
