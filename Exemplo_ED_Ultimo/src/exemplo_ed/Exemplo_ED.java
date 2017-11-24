/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_ed;

import java.lang.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Luciano
 */
public class Exemplo_ED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String aux;
        int i = 0;
        //int tamanhoL = 0;
        ArrayList valor = new ArrayList();
        //Obtem um dado de entrada do teclado
        //String entrada = JOptionPane.showInputDialog("Digite 1 para desenhar retangulo\n 2 para desenhar oval\n");
        int tamanhoL = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamaho da lista: "));
        for(; i< tamanhoL;i++)
        {
            //= JOptionPane.showInputDialog("digite o valor a ser inserido: ");
            //aux = JOptionPane.showInputDialog("digite o valor a ser inserido na posiÃ§Ã£o: "+ (i+1));
            valor.add(i, "");
        }
        //Converte o valor digitado de String para Inteiro
        int choice = 1; //Integer.parseInt(entrada);
        
        
        
        //Cria um objeto do tipo RetangOval e passa o choice como parametro para o construtor
        RetangOval ro = new RetangOval(choice, tamanhoL);
        
        
        //Criando a janela de exibicao
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(ro); //Adiciona o objeto jo ao jframe
        jf.setSize(500,500);
        jf.setVisible(true);
    }
    
}
