/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_ed;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author Pedro2
 */
public class FormABP extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormABP
     */
    public FormABP(DesenhaArvore ro, JFrame jf) {
        this.arv = new ABP();
        this.ro = ro;
        this.jf = jf;
        //ro = new DesenhaListaSEnc(contador);
        dados = new LinkedList();
        
        //Criando os labels
        //nraiz
        
        ox = new JLabel();
        ox.setSize(15,15);
        ox.setLocation(262, 17);
        ox.setText("");
        ox.setOpaque(true);
        dados.add(ox);
        jf.add(ox);

        //no2
        ox = new JLabel();
        ox.setText("");
        ox.setSize(15,15);
        ox.setLocation(217 , 72);
        ox.setOpaque(true);
        dados.add(ox);
        jf.add(ox);
        
        //no3
        ox = new JLabel();
        ox.setText("");
        ox.setSize(15,15);
        ox.setLocation(305 , 72);
        ox.setOpaque(true);
        dados.add(ox);
        jf.add(ox);
                      
        //no4
        ox = new JLabel();
        ox.setText("");
        ox.setSize(15,15);
        ox.setLocation(182 , 132);
        ox.setOpaque(true);
        dados.add(ox);
        jf.add(ox);
        
        //no5
        ox = new JLabel();
        ox.setText("");
        ox.setSize(15,15);
        ox.setLocation(242, 132);
        ox.setOpaque(true);
        dados.add(ox);
        jf.add(ox);
        
        
        //no6
        ox = new JLabel();
        ox.setText("");
        ox.setSize(15,15);
        ox.setLocation(282 , 132);
        ox.setOpaque(true);
        dados.add(ox);
        jf.add(ox);
        
       
        
        //no7
         ox = new JLabel();
        ox.setText("");
        ox.setSize(15,15);
        ox.setLocation(342 , 132);
        ox.setOpaque(true);
        dados.add(ox);
        jf.add(ox);
        
        //no8
        ox = new JLabel();
        ox.setText("");
        ox.setSize(15,15);
        ox.setLocation(115 , 172);
        ox.setOpaque(true);
        dados.add(ox);
        jf.add(ox);
        
        
        //no9
        ox = new JLabel();
        ox.setText("");
        ox.setSize(15,15);
        ox.setLocation(185 , 217);
        ox.setOpaque(true);
        dados.add(ox);
        jf.add(ox);
        
        //no10
        ox = new JLabel();
        ox.setText("");
        ox.setSize(15,15);
        ox.setLocation(205 , 187);
        ox.setOpaque(true);
        dados.add(ox);
        jf.add(ox);  
        
        //no11
        ox = new JLabel();
        ox.setText("");
        ox.setSize(15,15);
        ox.setLocation(250 , 187);
        ox.setOpaque(true);
        dados.add(ox);
        jf.add(ox);
        
        //no12
        ox = new JLabel();
        ox.setText("");
        ox.setSize(15,15);
        ox.setLocation(282 , 187);
        ox.setOpaque(true);
        dados.add(ox);
        jf.add(ox);
        
        
        //no13
        ox = new JLabel();
        ox.setText("");
        ox.setSize(15,15);
        ox.setLocation(317, 187);
        ox.setOpaque(true);
        dados.add(ox);
        jf.add(ox);
        
        
        //no14
         ox = new JLabel();
        ox.setText("");
        ox.setSize(15,15);
        ox.setLocation(352 , 217);
        ox.setOpaque(true);
        dados.add(ox);
        jf.add(ox);
        
        
        //no15
        ox = new JLabel();
        ox.setText("");
        ox.setSize(15,15);
        ox.setLocation(407 , 172);
        ox.setOpaque(true);
        dados.add(ox);
        jf.add(ox);
        
        //no ignorado
        ox = new JLabel();
        ox.setText("15");
        ox.setSize(20,20);
        ox.setLocation(405 , 170);
        ox.setVisible(false);
        jf.add(ox);
        
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("Conteudo:");

        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Elemento:");

        jButton2.setText("Busca");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(33, 33, 33)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(!jTextField1.getText().equals(""))
        {
            int dado = Integer.parseInt(jTextField1.getText());
            int id;
            arv.insere(dado);
            id = arv.retornaID();
            ro.desenhaNo(jf.getGraphics(), id);
        
            dados.get(id - 1).setText(dado + "");
        }
        else
            JOptionPane.showMessageDialog(FormABP.this, "Insercao falhou! Informe o numero que deseja inserir!","ERRO", JOptionPane.INFORMATION_MESSAGE);
        
        jTextField1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int id;
        No elemento;
        String caminho;
        
        if(!jTextField2.getText().equals(""))
        {
            int dado = Integer.parseInt(jTextField2.getText());
            elemento = arv.busca(dado);
            caminho = arv.retornaCaminho();
            
            if(!(elemento == null))
            {
                JOptionPane.showMessageDialog(FormABP.this, "Elemento "  + dado + " encontrado!\nCaminho: " + arv.retornaCaminho(), "Encontrado", JOptionPane.INFORMATION_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(FormABP.this, "O elemento pesquisado nao esta na arvore!","ERRO", JOptionPane.INFORMATION_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(FormABP.this, "Campo do elemento vazio! Insira o elemento a ser pesquisado!","ERRO", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
    
    JFrame jf;
    DesenhaArvore ro;
    int contador = 0;
    int tamanho;
    LinkedList <JLabel> dados;
    JLabel ox;
    //Graphics g;
    int aux = 0;
    ABP arv;
}
