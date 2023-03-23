/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05;

import javax.swing.JOptionPane;
public class Aula05 {

    public static void main(String[] args) {
        // TODO code application logic here
    }
        void quadrado() {
        try {
            int L1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do L1: "));
            int L2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do L2: "));
            int quadrado = L1 * L2;

            JOptionPane.showMessageDialog(null, "A área do quadrado é: " + quadrado);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor Inválido");
        }
    }

    void retangulo() {
        try {
            int B = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do Base: "));
            int H = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do Altura: "));
            int retangulo = B * H;

            JOptionPane.showMessageDialog(null, "A área do retangulo é: " + retangulo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor Inválido");
        }
    }

    void triangulo() {
        try {
            int B = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do Base: "));
            int H = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do Altura: "));
            int triangulo = (B * H) / 2;

            JOptionPane.showMessageDialog(null, "A área do triangulo é: " + triangulo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor Inválido");

        }
    }

}
