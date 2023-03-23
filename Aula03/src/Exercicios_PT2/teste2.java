/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios_PT2;
import javax.swing.JOptionPane;

public class teste2 {
    
    public static void main(String[] args) {
    
    Funcao_calc chamar = new Funcao_calc();
    try {
    
    int op = Integer.parseInt(JOptionPane.showInputDialog("Digite o operador"));
    
    if(op == 1){
        chamar.soma();
        
   }else if (op == 2){
        chamar.sub();
        
   }else if (op == 3){
        chamar.div();
    
   }else if (op == 4){
        chamar.multi();
 
   }else{
    System.out.println("Valor Inválido");
   }
    
   }catch (Exception e) {
        JOptionPane.showMessageDialog(null,"Valor inválido");
        
}        
}          
}
