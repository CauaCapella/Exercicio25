package com.mycompany.exercicio25;

import javax.swing.JOptionPane;
/**
 *
 * @author cauac
 */
public class Exercicio25 {

    public static void main(String[] args) {
       //variaveis
       int quant = 20;
        int soma = 0;
        int numeros[] = new int[quant];
        //entrada
        for (int i=0; i<quant; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        }
        //processamento
        for (int i=0; i<quant; i++){
            soma = soma + numeros[i];
        }
        double media = soma / quant;
        //saida
        JOptionPane.showMessageDialog(null,"A media é:" + media);
        }
}
