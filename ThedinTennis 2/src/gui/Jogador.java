/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controle.ControlFuncionario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author JoaoPedroThedin
 */
public class Jogador extends javax.swing.JFrame {

    private controle.ControlFuncionario ControleFuncionario;

    /**
     * Creates new form Funcionario
     */
    public Jogador() {
        ControleFuncionario = new ControlFuncionario();
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

        jLabel1 = new javax.swing.JLabel();
        btngravar = new javax.swing.JButton();
        btnremover = new javax.swing.JButton();
        btnalterar = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        txtfuncao = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listafuncionario = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("JOGADORES");

        btngravar.setText("Gravar");
        btngravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngravarActionPerformed(evt);
            }
        });

        btnremover.setText("Remover");
        btnremover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoverActionPerformed(evt);
            }
        });

        btnalterar.setText("Alterar");
        btnalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalterarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        jLabel3.setText("Categoria");

        listafuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listafuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listafuncionario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnalterar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnremover, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(btngravar, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnalterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnremover)
                        .addGap(8, 8, 8)
                        .addComponent(btngravar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(3, 3, 3)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtfuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngravarActionPerformed
        // TODO add your handling code here:
        model.Funcionario funcionario = new model.Funcionario();
        funcionario.setNome(txtnome.getText());
        funcionario.setFuncao(txtfuncao.getText());

        try {
            ControleFuncionario.cadastrar(funcionario);
        } catch (SQLException ex) {
            Logger.getLogger(model.Empresa.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            listafuncionario.setListData(ControleFuncionario.atualizarLista().toArray());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        //limpar tela;
        txtnome.setText("");
        txtfuncao.setText("");
    }//GEN-LAST:event_btngravarActionPerformed

    private void btnalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalterarActionPerformed
        model.Funcionario funcionario = new model.Funcionario();
        funcionario.setNome(txtnome.getText());
        funcionario.setFuncao(txtfuncao.getText());
        funcionario.setId(Integer.parseInt(id.getText()));
        try {
            ControleFuncionario.alterar(funcionario);
        } catch (SQLException ex) {
            Logger.getLogger(model.Empresa.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            listafuncionario.setListData(ControleFuncionario.atualizarLista().toArray());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        //limpar tela;
        txtnome.setText("");
        txtfuncao.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_btnalterarActionPerformed

    private void btnremoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoverActionPerformed
        if (listafuncionario.getSelectedValue() != null) {
            model.Funcionario funcionario = new model.Funcionario();
            funcionario.setNome(txtnome.getText());
            funcionario.setFuncao(txtfuncao.getText());
            funcionario.setId(Integer.parseInt(id.getText()));
            // TODO add your handling code here:
            try {
                ControleFuncionario.excluir(funcionario.getId());
            } catch (SQLException ex) {
                Logger.getLogger(model.Funcionario.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                listafuncionario.setListData(ControleFuncionario.atualizarLista().toArray());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
    }//GEN-LAST:event_btnremoverActionPerformed
    }
    private void listafuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listafuncionarioMouseClicked
       model.Funcionario e = (model.Funcionario) listafuncionario.getSelectedValue();
        txtnome.setText(e.getNome());
        txtfuncao.setText(e.getFuncao());
        id.setText(e.getId().toString());
        

// TODO add your handling code here:
    }//GEN-LAST:event_listafuncionarioMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
  
     try {
            listafuncionario.setListData(ControleFuncionario.atualizarLista().toArray());
        } catch (SQLException ex) {
            Logger.getLogger(Jogador.class.getName()).log(Level.SEVERE, null, ex);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnalterar;
    private javax.swing.JButton btngravar;
    private javax.swing.JButton btnremover;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listafuncionario;
    private javax.swing.JTextField txtfuncao;
    private javax.swing.JTextField txtnome;
    // End of variables declaration//GEN-END:variables
}
