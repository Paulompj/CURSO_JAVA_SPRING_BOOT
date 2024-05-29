package Exercicios2;

import javax.swing.*;

public class testeMensagem {
    public static void main(String[] args) {
    JOptionPane.showMessageDialog(null,"Digite um número na próxima aba: ");
    String a = JOptionPane.showInputDialog("Digite um número: ");
    String b = JOptionPane.showInputDialog("Digite um segundo número: ");
    Integer x = Integer.parseInt(a);
    Integer y = Integer.parseInt(b);
    int soma = x+y;
    String message = String.format("A soma de %d com %d é: %d",x,y,soma);
    JOptionPane.showMessageDialog(null,message);



    }
}
