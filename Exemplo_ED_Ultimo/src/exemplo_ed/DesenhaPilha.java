/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_ed;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Luciano
 */
public class DesenhaPilha extends JPanel {
    public int choice;
    public ArrayList valor;
    public int tamanhoL;
    public static String[] add;
    static int nelementos = 0;
    //public int alt = 10;
    //public int q;
    
    public DesenhaPilha(int choice, int tamanhoL) {
        this.choice = choice;
        //throw new UnsupportedOperationException("Not supported yet.");
        //this.valor = valor;
        this.tamanhoL = tamanhoL;
        add = new String[tamanhoL];
    }
    
    public DesenhaPilha(int choice, int tamanhoL, String str) {
        this.choice = choice;
        //throw new UnsupportedOperationException("Not supported yet.");
        //this.valor = valor;
        this.tamanhoL = tamanhoL;
        add[nelementos] = str;
        nelementos++;
    }
    
     public void paintComponent(Graphics g){
        int x = 50;
        String aux;
        int j = 0;
        int alt = 10;
                
        //22 e 37
        
        for(int i = 0; i < tamanhoL; i++){
            int q = 100*i;
                
               
                g.drawRect(alt+250 , (30*i) +10 , 80 , 25);
                //g.drawString((i + 1) + "" , 27 + 100*j , alt);
                g.drawString((tamanhoL - i + 1) + "" , alt+235 , 30*i);
               
                j++;
                        
            }
               g.drawString((tamanhoL - j + 1) + "" , alt+235 , 30*j);         
        } //fim do for
            
     
     public static void main(String[] args){
         int choice = 2;
         
     }
        } 
    
