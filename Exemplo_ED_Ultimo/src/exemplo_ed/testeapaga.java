/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_ed;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 *
 * @author Luciano
 */
public class testeapaga extends JPanel {
     int contador;
     int j = 0;

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public testeapaga(int contador) {
        this.contador = contador;
    }
    public void paintComponent( Graphics g){
       /* if(contador == 0){
        g.drawRect(contador+10, 30, 30, 30);
        
        }
        else{*/
            /*for(int i = 0; i<contador; i++){
                
            int k = (50 * j) + 10;
            int b = k;   
                
                
            
            //int q = 100*i;
                System.out.println("o valor de b é: " + b);
                
                g.drawRect(k , 10 , 30 , 30);
            j++;
        
            
           g.drawLine(30*i, 10, 15*i, 15);
           g.drawLine(30*i, 25, 15*i, 15);
           g.drawLine(35*i, 10, 50*i, 15);
           g.drawLine(35*i, 25, 50*i, 15);
            }*/
            
            //SETAS <
           int x = 30;
            int z = 15;
         /*  g.drawLine(x, 10, z, 15);
           g.drawLine(x, 25, z, 15);
           x +=30;
           z +=30;
           g.drawLine(x, 10, z, 15);
           g.drawLine(x, 25, z, 15);
           x +=30;
           z +=30;
          // g.drawLine(30+30, 10, 45+30, 15);
           g.drawLine(x, 10, z, 15);
           g.drawLine(x, 25, z, 15);
           x +=30;
           z +=30;
           g.drawLine(x, 10, z, 15);
           g.drawLine(x, 25, z, 15);
           */
          //SETAS < EM LOOP
            for(int i = 0; i<10; i++){
          
             g.drawLine(x, 10, z, 15);
              g.drawLine(x, 25, z, 15);
            x +=30;
             z +=30;
            }
          
           
           //SETAS >
           /* int x = 30;
            int z = 15;
           /* g.drawLine(x, 25, z, 15);
           g.drawLine(x, 25, z, 30);
           x +=30;
           z +=30;
           g.drawLine(x, 25, z, 15);
           g.drawLine(x, 25, z, 30);
           x +=30;
           z +=30;
           g.drawLine(x, 25, z, 15);
           g.drawLine(x, 25, z, 30);*/
           //SETAS > EM LOOP
           for(int i = 0; i<10; i++){
            g.drawLine(x, 25, z, 15);
           g.drawLine(x, 25, z, 30);
           x +=30;
           z +=30;
    }
    
           
           //g.drawLine(30*2, 25, 15*2, 15);
         //  g.drawLine(35*2, 10, 50*2, 15);
          // g.drawLine(35*2, 25, 50*2, 15);
         // g.drawLine(30, 25, 15, 15);*/
    }
    
    public static void main(String[] args){
         int contador = 5;
         int aux = contador;
       
         //contador++;
        testeapaga ro = new testeapaga(contador);
        JFrame huas = new JFrame();
        huas.add(ro);
        huas.repaint();
        huas.setSize(700,700);
        huas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        huas.setVisible(true);
        
        System.out.println("o valor de c1 é: " + contador);
        contador--;
        huas.setVisible(false);
        huas = new JFrame();
        System.out.println("o valor de c2 é: " + contador);
        ro = new testeapaga(contador);
        /*jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(ro);
        jf.repaint();
        jf.setVisible(true);*/
        huas.add(ro);
        huas.repaint();
        huas.setSize(700,700);
        huas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        huas.setVisible(true);
    }
}


