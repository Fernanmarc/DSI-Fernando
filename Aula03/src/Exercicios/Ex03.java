/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;
import javax.swing.JOptionPane;

public class Ex03 {
    
    public static void main(String[] args) {
       
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro valor: "));
        int soma = a + b;
        
        JOptionPane.showMessageDialog(null, "O valor da soma é: "+ soma);
    }
    
}
