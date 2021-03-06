/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_ed;
import java.awt.Point;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author Dayane
 */
public class FormFilaSeq extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormFilaSeq
     */
    public FormFilaSeq(RetangOval ro,JFrame jf,int tamanho) {
        initComponents();
        this.ro = ro;
        this.jf = jf;
        this.tamanho = tamanho;
        minhaLista = new FilasSeq(this.tamanho);
        dados = new LinkedList();
        int h = 27;
        int x = 23;
        
        for(int j = 0; j <= tamanho; j++)
        {
            Point p = new Point(x, h);
            JLabel test = new JLabel();
            test.setOpaque(true);
            this.jf.add(test);
            test.setSize(20, 20);
            test.setText("");
            test.setLocation(p);
            if(j == 4 || j == 9 || j == 15)
            {
                x = 23;
                h = h + 100;
                //System.out.println("oi1");
            }
            else
            {
                //System.out.println(test.getLocation());
                x = x + 100;
            }
            dados.add(test);
            if(j == tamanho)
            {
                //test.setText("safado");
                test.setVisible(false);
            }
            else
                test.setVisible(true);            
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Conteúdo:");

        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Remover");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(98, 98, 98))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int  dado;
        System.out.println("tamanho: " + minhaLista.tamanho());
        
        dado = Integer.parseInt(jTextField2.getText());
        //pos++;
        if(!jTextField2.getText().equals("") && !minhaLista.cheia())
        {
            boolean teste;
            teste = minhaLista.insere(dado);
            if(!teste)
            {
                JOptionPane.showMessageDialog(FormFilaSeq.this, "Inserção falhou!","ERRO", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
               
                
                dados.get(pos).setText(jTextField2.getText()); //Adiciona o objeto ao ao jframe
                pos++;
            }
            
        }
        else
            JOptionPane.showMessageDialog(FormFilaSeq.this, "A fila está cheia!","ERRO", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //int pos = 0;
        if(!minhaLista.vazia()){
            minhaLista.remove();
        
            for (int i = 0; i < minhaLista.tamanho(); i++)
            {
	 	dados.get(i).setText(dados.get(i+1).getText());
            }
            dados.get(minhaLista.tamanho()).setText("");
            pos--;
        }
        else
            JOptionPane.showMessageDialog(FormFilaSeq.this, "A fila está vazia!","ERRO", JOptionPane.INFORMATION_MESSAGE);
        for(int j = 0; j < minhaLista.tamanho(); j++)
        {
            System.out.println("elemento "+ j +" :" + minhaLista.elemento(j+1));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    FilasSeq minhaLista;
    JFrame jf;
    RetangOval ro;
    int tamanho,pos = 0;
    LinkedList <JLabel> dados;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
