/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thais
 */
public class ContaEspecial extends Contas{
    int limite;
    double multa;
    
    void descontar(double multa){
        multa = multa / 100;   
        double resto = ((-1) * getSaldo());
        sacar(resto*multa);
    }
    
    void tipoConta(){
        System.out.println("conta-especial");
    }
    
}