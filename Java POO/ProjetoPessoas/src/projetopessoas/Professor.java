/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetopessoas;

/**
 *
 * @author Leandro
 */
public class Professor extends Pessoa {
    private String Especialidade;
    private double salario;
    
    public void receberAum(int v){
        this.setSalario(this.getSalario() + v);
        System.out.println("O novo salario de " + this.getNome() + 
                " é R$: " + this.getSalario());
        
    }

    public String getEspecialidade() {
        return Especialidade;
    }

    public void setEspecialidade(String Especialidade) {
        this.Especialidade = Especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
}
