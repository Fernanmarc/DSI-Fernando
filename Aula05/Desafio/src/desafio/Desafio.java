package desafio;

import javax.swing.JOptionPane;

public class Desafio {

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
