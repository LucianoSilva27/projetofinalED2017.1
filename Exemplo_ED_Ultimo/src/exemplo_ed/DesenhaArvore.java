/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_ed;


import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Luciano
 */
public class DesenhaArvore extends JPanel{
    static int contador = 0;
    static ABP huas = new ABP();
    static No s;
    static int[] f = new int[10];
    static JLabel ox = new JLabel();
    static JFrame jf = new JFrame();
   /* int contador = 0;
    ABP huas = new ABP();
     No s;
   int[] f = new int[10];
     JLabel ox = new JLabel();
    JFrame jf = new JFrame();
   */
   
   
    public int getContador() {
        return contador;
    }

    public DesenhaArvore(ABP huas) {
        this.huas = huas;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public DesenhaArvore(int contador) {
        this.contador = contador;
    }
    public DesenhaArvore() {
       
    }
    
    public void desenhaNo(Graphics gr, int id)
    {
        int n = id;
        Graphics g = gr;
        
        g.drawOval(260 , 40 , 30 , 30);
        switch(n)
        {
            case 1:
                g.drawOval(260 , 40 , 30 , 30);
                break;
            case 2:
                g.drawOval(215 , 95 , 30 , 30);
                g.drawLine(255, 65, 235, 90);
                break;
            case 3:
                g.drawLine(305, 90, 295, 65);
                g.drawOval(305 , 95 , 30 , 30);
                break;
            case 4:
                g.drawLine(215, 125, 200, 150);
                g.drawOval(180 , 155 , 30 , 30);
                break;
            case 5:
                g.drawOval(240 , 155 , 30 , 30);
                g.drawLine(245, 125, 260, 150);
                break;
            case 6:
                g.drawLine(305, 125, 290, 150);
                g.drawOval(280 , 155 , 30 , 30);
                break;
            case 7:
                g.drawOval(340 , 155 , 30 , 30);
                g.drawLine(335, 125, 350, 150);
                break;
            case 8:
                g.drawOval(115 , 195 , 30 , 30);
                g.drawLine(150, 210, 185, 185);
                break;
            case 9:
                g.drawOval(180 , 240 , 30 , 30);
                g.drawLine(195, 235, 195, 190);
                break;
            case 10:
                g.drawOval(205 , 210 , 30 , 30);
                g.drawLine(235, 210, 245, 190);
                break;
            case 11:
                g.drawOval(245 , 210 , 30 , 30);
                g.drawLine(255, 205, 255, 190);
                break;
            case 12:
                g.drawOval(280 , 210 , 30 , 30);
                g.drawLine(295, 205, 295, 190);
                break;
            case 13:
                g.drawOval(315 , 210 , 30 , 30);
                g.drawLine(315, 205, 305, 190);
                break;
            case 14:
                g.drawOval(350 , 240 , 30 , 30);
                g.drawLine(360, 235, 360, 190);
                break;
            case 15:
                g.drawOval(405 , 195 , 30 , 30);
                g.drawLine(400, 200, 370, 190);
                break;
        }
    }
    
    public void paintComponent(Graphics g){
        

    }

    public static void main(String[] args){
       
        contador = 0;
         
         
        DesenhaArvore ro = new DesenhaArvore();
        JFrame jf = new JFrame();
        jf.setSize(800,700);
        jf.add(ro);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //  jf.add();
      //  JLabel ox = new JLabel();
     
        //nraiz
          
        ox.setSize(20,20);
        ox.setLocation(270,45);
        ox.setText("RA");
        jf.add(ox);

        //no3
        ox = new JLabel();
        ox.setText("3");
        ox.setSize(200,20);
        ox.setLocation(315 , 100);
        
        jf.add(ox);
        
        
        
        //no2
        ox = new JLabel();
        ox.setText("2");
        ox.setSize(20,20);
        ox.setLocation(225 , 100);
        jf.add(ox);
        
        
      
        
        
        //no4
        ox = new JLabel();
        ox.setText("4");
        ox.setSize(20,20);
        ox.setLocation(190 , 160);
        jf.add(ox);
        
        
        
        
        
        //no5
        ox = new JLabel();
        ox.setText("5");
        ox.setSize(20,20);
        ox.setLocation(250, 160);
        jf.add(ox);
        
        
        //no6
        ox = new JLabel();
        ox.setText("6");
        ox.setSize(20,20);
        ox.setLocation(290 , 160);
        jf.add(ox);
        
       
        
        //no7
         ox = new JLabel();
        ox.setText("7");
        ox.setSize(20,20);
        ox.setLocation(350 , 160);
        jf.add(ox);
        
        //no8
        ox = new JLabel();
        ox.setText("8");
        ox.setSize(20,20);
        ox.setLocation(120 , 200);
        jf.add(ox);
        
        
        //no9
        ox = new JLabel();
        ox.setText("9");
        ox.setSize(20,20);
        ox.setLocation(190 , 245);
        jf.add(ox);
        
        //no10
        ox = new JLabel();
        ox.setText("10");
        ox.setSize(20,20);
        ox.setLocation(210 , 215);
        jf.add(ox);  
        
        //no11
        ox = new JLabel();
        ox.setText("11");
        ox.setSize(20,20);
        ox.setLocation(255 , 215);
        jf.add(ox);
        
        //no12
        ox = new JLabel();
        ox.setText("12");
        ox.setSize(20,20);
        ox.setLocation(285 , 215);
        jf.add(ox);
        
        
        //no13
        ox = new JLabel();
        ox.setText("13");
        ox.setSize(20,20);
        ox.setLocation(325 , 215);
        jf.add(ox);
        
        
        //no14
         ox = new JLabel();
        ox.setText("14");
        ox.setSize(20,20);
        ox.setLocation(360 , 245);
        jf.add(ox);
        
        
        //no15
        ox = new JLabel();
        ox.setText("15");
        ox.setSize(20,20);
        ox.setLocation(410 , 200);
        jf.add(ox);
        
        
        for(int i = 1; i <= 15; i++)
        {
            ro.desenhaNo(jf.getGraphics(), i);
        }
        
        
        
     }
        
}


