/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_ed;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Luciano
 */
public class DesenhaListaSEnc extends JPanel{
    int contador;

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public DesenhaListaSEnc(int contador) {
        this.contador = contador;
    }
    
    
    
    public void paintComponent( Graphics g){
        int x = 50;
        int k, b = 0;
        int j = 0;
        int alt = 10;
        this.contador = contador;
        int aux =+ contador;
        //declaração das coordenadas das linhas
        int x1l1=0, y1l1=0, x2l1=0, y2l1=0;
        int x1l2=0, y1l2=0, x2l2=0, y2l2=0;
        //declaração das coordenadas das feclhas
        int x1f1=0, y1f1=0, x2f1 = 0, y2f1=0;
        int x1f2=0, y1f2=0, x2f2 =0, y2f2 =0;
        
        int l = 1;
        
        int i=0; //ESSE I TA DIZENDO O TAMANHO DA LISTA
              
        
            
            
        
        
        
            //coordenadas da primeira linha
                x1l1 = 40;
                y1l1 = 20;
                x2l1 = 60;
                y2l1 = 20;
            //coordenadas da segunda linha
                x1l2 = 40;
                y1l2 = 30;
                x2l2 = 60;
                y2l2 = 30;
                
            // coordenadas para a feclha <
                x1f1 = 52;
                y1f1= 15;
                x2f1 = 57;
                y2f1 = 20;
            
            // coordenadas para a feclha >
                x1f2 = 47;
                y1f2 = 25;
                x2f2 = 42;
                y2f2 = 30;
                
            
        for(; i < contador; i++){
                
            k = (50 * j) + 10;
            b = k;
            j++;
            
                g.drawRect(k , alt , 30 , 30);
              
               if(j < contador ) {
                  
                g.drawLine(x1l1, y1l1, x2l1,y2l1);
                
                g.drawLine(x1f1, y1f1, x2f1, y2f1);
                y1f1 +=10;
                g.drawLine(x1f1, y1f1, x2f1, y2f1);
                y1f1 -=10;
                x1f1+=50;
                x2f1+=50;
                
             
                //g.drawLine(x1f2, y1f2, x2f2, y2f2);
                y1f2 +=10;
                // g.drawLine(x1f2, y1f2, x2f2, y2f2);
                y1f2 -=10;
                x1f2+=50;
                x2f2+=50;
              
                x1l1+= 50;
                x2l1+= 50;
               // g.drawLine(x1l2, 30, x2l2, 30);
               
                x1l2+= 50;
                x2l2+= 50;
               }
                
            
           
            
             
           
           // g.drawOval(460, 60, 40 , 40);
        }
        //g.dispose();
        // System.out.println("oAQI valor das variaveis 1 é: " + x1l1 + "\t" +x2l1 +  "\t" + contador);
          /*  g.drawLine(530, 40, 530, 60);
            g.drawLine(520, 40, 520, 60);
            g.drawRect(510, 60, 30, 30);
            g.drawRect(460, 60, 30, 30);*/
        //}
              // g.drawString((j) + "" , alt+235 , 30*j);         
        } //fim do for
   
    public static void main(String[] args){
        int contador=9;
        
        //contador++;
        DesenhaListaSEnc ro = new DesenhaListaSEnc(contador);
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(ro); //Adiciona o objeto jo ao jframe
        jf.setSize(640,700);
        //jPanel1.add(jf);
        jf.setVisible(true);
        //FormPilhaSeq item2 = new FormPilhaSeq(ro, jf, tamanhoL);
        //pack();
       // jf.add(item2);
        
    }
}
