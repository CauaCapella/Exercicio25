

package com.mycompany.exercicio26;

import javax.swing.JOptionPane;
/**
 *
 * @author cauac
 */
public class Exercicio26 {

public static void main(String[] args) {
       int quant = 5;
       int vetor[] = new int[quant];
       for (int i=0; i < quant; i++){
           vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero " +i));
       }
       for(int i = 0; i < quant-1; i++){
           for (int j = i + 1; j < quant; j++){
               if (vetor[j] < vetor[i]){
                   int aux = vetor[i];
                   vetor[i] = vetor[j];
                   vetor[j] = aux;
               }
           }
        
        }
       for (int i = 0; i < quant; i++){
           System.out.println("Vetor i:" + vetor[i]);
       }
    }
}