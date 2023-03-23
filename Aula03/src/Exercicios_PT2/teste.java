/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios_PT2;
import javax.swing.JOptionPane;
        
public class teste {
    
    public static void main( String[] args){
        
        Funcao_calc chamar = new Funcao_calc();
        
        String op = JOptionPane.showInputDialog("Digite o Operador (+ , - , * ou /)");
        
        if(op.equals("+")){
            chamar.soma();
       }else if(op.equals("-")){
            chamar.sub();
       }else if(op.equals("/")){
            chamar.div();
       }else if(op.equals("*")){
            chamar.multi();
       }else{
            System.out.println("Valor inválido");
       }
    }
}
