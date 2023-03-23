/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

import javax.swing.JOptionPane;


public class teste {
    
    public static void main(String[] args) {
       try{
        
            Desafio x = new Desafio();

            Integer forma = Integer.parseInt(JOptionPane.showInputDialog("Selecione qual forma quer calcular: \n 1 - Quadrado, 2 - Retangulo, 3 - Triangulo"));

            if(1 == forma){

                x.quadrado();

            }else if(2 == forma){

                x.retangulo();

            }else if(3 == forma){

                x.triangulo();

            }else{
                JOptionPane.showMessageDialog(null, "Valor inválido!");
            }
       }catch(Exception e){
               
            JOptionPane.showMessageDialog(null, "Valor inválido!");
       }
    }           
}        
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
 