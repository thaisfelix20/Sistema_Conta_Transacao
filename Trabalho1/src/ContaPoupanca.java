/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thais
 */
public class ContaPoupanca extends Contas{
    
    void reajustar(double taxa){
        double valor = getSaldo();
        valor = valor * taxa;
        depositar(valor);
    }
    
    void reajustar(){
        double valor = getSaldo();
        valor = valor * 0.1;
        depositar(valor);
    }
    
    void tipoConta(){
        System.out.println("Conta-poupança");
    }
    
}