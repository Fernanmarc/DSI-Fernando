/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios_PT2;
import javax.swing.JOptionPane;

public class Funcao_calc {
    
        void soma(){
    
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro valor: "));
        int soma = a + b;
        
        JOptionPane.showMessageDialog(null, "O valor da soma é: "+ soma);


       }
    
        void sub(){
    
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro valor: "));
        int sub = a - b;
        
        JOptionPane.showMessageDialog(null, "O valor da subtração é: "+ sub);


       }
        
        void div(){
    
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro valor: "));
        int div = a / b;
        
        JOptionPane.showMessageDialog(null, "O valor da divisão é: "+ div);


       }
        
        void multi(){
    
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro valor: "));
        int multi = a * b;
        
        JOptionPane.showMessageDialog(null, "O valor da multiplicação é: "+ multi);


       }
}

