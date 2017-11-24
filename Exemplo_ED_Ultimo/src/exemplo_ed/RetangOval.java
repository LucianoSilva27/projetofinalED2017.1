package exemplo_ed;

import java.awt.Graphics;
import java.text.AttributedCharacterIterator;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Luciano
 */

public class RetangOval extends JPanel {
    public int choice;
    public ArrayList valor;
    public int tamanhoL;
    public static String[] add;
    static int nelementos = 0;
    //public int alt = 10;
    //public int q;
    
    public RetangOval(int choice, int tamanhoL) {
        this.choice = choice;
        //throw new UnsupportedOperationException("Not supported yet.");
        //this.valor = valor;
        this.tamanhoL = tamanhoL;
        add = new String[tamanhoL];
    }
    
    public RetangOval(int choice, int tamanhoL, String str) {
        this.choice = choice;
        //throw new UnsupportedOperationException("Not supported yet.");
        //this.valor = valor;
        this.tamanhoL = tamanhoL;
        add[nelementos] = str;
        nelementos++;
    }
    
    public void remove(int pos, Graphics g)
    {
        int p = pos;
        int h = 30;
        int aux = 0;
        if(pos <= 5)
        {
            h = 30;
            aux = 0;
        }
        else
        {
            if(pos <= 10)
            {
                h = h + 100;
                aux = 5;
            }
            else
            {
                if(pos <= 15)
                {
                    h = h + 200;
                    aux = 10;
                }
                else
                {
                    h = h + 300;
                    aux = 15;
                }
            }
        }
        g.drawString("    " , (100*((pos - 1) - aux))+ 5 , 37+h);
    }
    
    public void add(int con, int pos, Graphics g)
    {
        int i = con;
        int p = pos;
        int h = 30;
        int aux = 0;
        if(pos <= 5)
        {
            h = 30;
            aux = 0;
        }
        else
        {
            if(pos <= 10)
            {
                h = h + 100;
                aux = 5;
            }
            else
            {
                if(pos <= 15)
                {
                    h = h + 200;
                    aux = 10;
                }
                else
                {
                    h = h + 300;
                    aux = 15;
                }
            }
        }
        g.drawString(con+"" , (100*((pos - 1) - aux))+ 35 , 37+h);
    }
    /* RetangOval(int choice, ArrayList valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
    public void paintComponent(int con, int pos, Graphics g)
    {
        int i = con;
        int p = pos;
        g.drawString(i+"" , (110*p)+2 , 37+10);
    }
    
    @Override
    public void paintComponent(Graphics g){
        int x = 50;
        String aux;
        int j = 0;
        int alt = 10;
                
        //22 e 37
        
        for(int i = 0; i < tamanhoL; i++){
            int q = 100*i;
                
            for(j = 0; i < tamanhoL; i++){
                q = 100 * j;
                if(q > 450){
                    j = 0;
                    q= 0;
                    alt = alt+100;
                }
                g.drawRect((100 * j) , alt , x+10 , x);
                g.drawString((i + 1) + "" , 27 + 100*j , alt);
                        
                j++;
                        
            }
                        
        } //fim do for
    } //fim do metodo
} //fim da classe