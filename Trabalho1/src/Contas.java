
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thais
 */
public class Contas {
    private String nome;
    private int numero; 
    private double saldo;
    
    String getNome(){ 
        return nome;
    }
    
    void setNome(String nome){
        this.nome = nome;
    }
    
    int getNumero(){
        return numero;
    }
    
    void setNumero(int numero){
        this.numero = numero;
    }
    
    double getSaldo(){
        return saldo;
    }
    
    void depositar(double valor){
        saldo = saldo + valor;
    }
    
    void sacar(double valor){
        saldo = saldo - valor;
    }
    
    void transferir(Contas conta1, Contas conta2, double valor){
        if(conta1.getSaldo() >= valor){
            conta1.sacar(valor);
            conta2.depositar(valor);
            JOptionPane.showMessageDialog(null, "Transferencia realizada com sucesso");
        }else{
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para transferencia");
        }
    }
    
    void tipoConta(){
        System.out.println("Conta-Comum");
    }

}