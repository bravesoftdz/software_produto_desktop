/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visao;

import controlador.Controlador;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import negocio.Linha;
import negocio.Produto;
import negocio.Tipoproduto;

/**
 *
 * @author Ruan
 */
public class JanelaProdutoDialog extends javax.swing.JDialog {

    Controlador control;
    Produto prod = null;
    /**
     * Creates new form JanelaProdutoDialog
     */
    public JanelaProdutoDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        try {
            control = new Controlador();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO de conexão com o BANCO. Procure o suporte. " + 
                        e.getMessage() );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO não esperado. " + 
                        e.getMessage() );
        }
        
    }

    private void habilitarModo(int op) {
        if (op == 1) {
            // NOVO
            btnNovo.setEnabled(true);
            btnAlterar.setEnabled(false);            
        } else {
            btnNovo.setEnabled(false);
            btnAlterar.setEnabled(true);
        }
        
    }
    private void limpaDados(){
        jtfCod.setText("");
        jtfDescricao.setText("");
        jtfPreco.setText("");
        rbAtivo.setSelected(true);
        cmbLinha.setSelectedIndex(0);
        cmbTipo.setSelectedIndex(0);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGrupStatusProd = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        rbAtivo = new javax.swing.JRadioButton();
        rbInativo = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        cmbLinha = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jtfDescricao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfCod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtfPreco = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produto");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(241, 240, 240));

        jPanel1.setBackground(new java.awt.Color(241, 240, 240));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Venda"));

        bGrupStatusProd.add(rbAtivo);
        rbAtivo.setMnemonic('T');
        rbAtivo.setText("Ativo");

        bGrupStatusProd.add(rbInativo);
        rbInativo.setMnemonic('F');
        rbInativo.setText("Inativo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(rbAtivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbInativo)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAtivo)
                    .addComponent(rbInativo))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel3.setText("Tipo");

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Descrição");

        jtfCod.setEnabled(false);

        jLabel2.setText("COD");

        jLabel4.setText("Linha");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel5.setText("Preço");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtfPreco))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbLinha, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfCod, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10)))
                .addGap(11, 11, 11))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtfCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbLinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnAlterar)
                    .addComponent(btnCancelar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        try{
                if ( prod != null ) {
                    control.alterarProduto(prod.getIdProduto(), jtfDescricao.getText(),(Linha) cmbLinha.getSelectedItem(), (Tipoproduto)cmbTipo.getSelectedItem(), jtfPreco.getText(), (char) (bGrupStatusProd.getSelection().getMnemonic()));
                    JOptionPane.showMessageDialog(this, "Produto " + prod.getDescricao()+ " alterado com sucesso."  );

                    // Limpa a janela
                    jtfCod.setText("");
                    jtfDescricao.setText("");
                    jtfPreco.setText("");
                    cmbLinha.setSelectedIndex(0);
                    cmbTipo.setSelectedIndex(0);
                    rbAtivo.setSelected(true);

                    habilitarModo(1);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO ao ALTERAR. " + ex.getMessage() );
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ERRO ao ALTERAR. " + ex.getMessage() );
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
                
        habilitarModo(1);
        if(jtfDescricao.getText().trim().equals("") && jtfPreco.getText().trim().equals("")){
            this.setVisible(false); 
        }else{
            limpaDados();
        }
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        rbAtivo.setSelected(true);
        try {        
            control.carregarComboLinhas(cmbLinha);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(this, "Erro ao consultar LINHAS. " + 
                    erro.getMessage() + erro.getClass() );            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Erro não esperado ao consultar LINHAS. " + 
                    erro.getMessage() + erro.getClass() );
        }
        
        try {        
            control.carregarComboTipo(cmbTipo);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(this, "Erro ao consultar TIPOS. " + 
                    erro.getMessage() + erro.getClass() );            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Erro não esperado ao consultar TIPOS. " + 
                    erro.getMessage() + erro.getClass() );
        }
    }//GEN-LAST:event_formComponentShown

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        
        try {
                control.inserirProduto(jtfDescricao.getText(), (Linha) cmbLinha.getSelectedItem(), (Tipoproduto) cmbTipo.getSelectedItem(), Float.parseFloat(jtfPreco.getText()), (char) bGrupStatusProd.getSelection().getMnemonic());
                JOptionPane.showMessageDialog(this, "Produto '" + jtfDescricao.getText() + "' inserido com sucesso.");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(this, "Erro desconhecimento. " + 
                    erro.getMessage() + erro.getClass() );            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Erro desconhecimento. " + 
                    erro.getMessage() + erro.getClass() );
        }   
        limpaDados();  // Limpa os campos para que na proxima vez que a janela for chamada não apareça os ultimos dados cadastrados.
    }//GEN-LAST:event_btnNovoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JanelaProdutoPesqDialog prodPesq;
        try {
            prodPesq = new JanelaProdutoPesqDialog(null, true);
            prodPesq.setVisible(true); 
            
            prod = prodPesq.getProduto();
            
            if ( prod != null ){
                jtfCod.setText(String.valueOf(prod.getIdProduto()));
                jtfDescricao.setText(prod.getDescricao());
                jtfPreco.setText(String.valueOf(prod.getPreco()));

                cmbLinha.setSelectedItem(prod.getLinha());                     
                
                cmbTipo.setSelectedItem(prod.getTipoproduto());                      
                
                if(prod.isStatusVenda() == true){
                    rbAtivo.setSelected(true);
                }else{
                    if(prod.isStatusVenda() == false){
                        rbInativo.setSelected(true);
                    }
                }
                habilitarModo(2);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO ao PESQUISAR. " + ex.getMessage() );
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ERRO ao PESQUISAR. " + ex.getMessage() );
        }        

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaProdutoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaProdutoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaProdutoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaProdutoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaProdutoDialog dialog = new JanelaProdutoDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGrupStatusProd;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JComboBox cmbLinha;
    private javax.swing.JComboBox cmbTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jtfCod;
    private javax.swing.JTextField jtfDescricao;
    private javax.swing.JTextField jtfPreco;
    private javax.swing.JRadioButton rbAtivo;
    private javax.swing.JRadioButton rbInativo;
    // End of variables declaration//GEN-END:variables
}
