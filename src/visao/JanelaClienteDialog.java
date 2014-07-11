/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visao;

import com.sun.awt.AWTUtilities;
import controlador.Controlador;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import negocio.Cidade;
import negocio.Cliente;


/**
 *
 * @author Ruan
 */
public class JanelaClienteDialog extends javax.swing.JDialog {

    Controlador control;
    Cliente cli = null;
    /**
     * Creates new form JanelaClienteDialog
     */
    public JanelaClienteDialog(java.awt.Frame parent, boolean modal) { 
        super(parent, modal);
        
        // Tentando deixar a tela transparente
        //AWTUtilities.setWindowOpacity(this, 0.5f);
        
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
        jtfNome.setText("");
        jtfEndereco.setText("");
        jtfNumero.setText("");
        jtfComplemento.setText("");
        jtfBairro.setText("");
        jtfCnpj.setText("");
        jtfTel.setText("");
        jtfCel.setText("");
        jtfEmail.setText("");
        cmbCidade.setSelectedIndex(0);
        jtfCep.setText("");
        jtfCpf.setText("");
        jtfIe.setText("");
        rbJuridica.setSelected(true); // ao limpar, pessoa juridica deve ficar selecionada
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGroupTipo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jtfComplemento = new javax.swing.JTextField();
        lblEnder3 = new javax.swing.JLabel();
        lblEnder2 = new javax.swing.JLabel();
        jtfNumero = new javax.swing.JTextField();
        jtfCel = new javax.swing.JTextField();
        lblEnder5 = new javax.swing.JLabel();
        jtfTel = new javax.swing.JTextField();
        lblEnder4 = new javax.swing.JLabel();
        jtfBairro = new javax.swing.JTextField();
        lblEnder = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        jtfEndereco = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jtfEmail = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        lblEnder7 = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        jtfNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblEnder1 = new javax.swing.JLabel();
        btnPesqCli = new javax.swing.JButton();
        lblCnpj = new javax.swing.JLabel();
        jtfCnpj = new javax.swing.JTextField();
        jtfIe = new javax.swing.JTextField();
        lblCGC1 = new javax.swing.JLabel();
        PanelPessoa = new javax.swing.JPanel();
        rbFisica = new javax.swing.JRadioButton();
        rbJuridica = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jtfCpf = new javax.swing.JTextField();
        cmbCidade = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jtfCep = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cliente");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(241, 240, 240));

        jtfComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfComplementoActionPerformed(evt);
            }
        });

        lblEnder3.setText("Complemento");

        lblEnder2.setText("Nº");

        lblEnder5.setText("Tel. Cel.");

        lblEnder4.setText("Tel. Fixo");

        lblEnder.setText("Endereço");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        jtfEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEnderecoActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblCidade.setText("Cidade");

        lblEnder7.setText("E-mail");

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.setPreferredSize(new java.awt.Dimension(57, 23));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        lblNome.setText("Nome");

        lblEnder1.setText("Bairro");

        btnPesqCli.setBackground(new java.awt.Color(241, 240, 240));
        btnPesqCli.setText("...");
        btnPesqCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqCliActionPerformed(evt);
            }
        });

        lblCnpj.setText("Cnpj");

        jtfIe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIeActionPerformed(evt);
            }
        });

        lblCGC1.setText("IE");

        PanelPessoa.setBackground(new java.awt.Color(241, 240, 240));
        PanelPessoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Pessoa"));

        bGroupTipo.add(rbFisica);
        rbFisica.setMnemonic('f');
        rbFisica.setText("Física");
        rbFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFisicaActionPerformed(evt);
            }
        });

        bGroupTipo.add(rbJuridica);
        rbJuridica.setMnemonic('j');
        rbJuridica.setText("Jurídica");
        rbJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbJuridicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPessoaLayout = new javax.swing.GroupLayout(PanelPessoa);
        PanelPessoa.setLayout(PanelPessoaLayout);
        PanelPessoaLayout.setHorizontalGroup(
            PanelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPessoaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbFisica)
                .addGap(18, 18, 18)
                .addComponent(rbJuridica)
                .addGap(33, 33, 33))
        );
        PanelPessoaLayout.setVerticalGroup(
            PanelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPessoaLayout.createSequentialGroup()
                .addGroup(PanelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFisica)
                    .addComponent(rbJuridica))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("CPF");

        cmbCidade.setBackground(new java.awt.Color(241, 240, 240));
        cmbCidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cmbCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCidadeActionPerformed(evt);
            }
        });

        jLabel2.setText("CEP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblEnder)
                                            .addComponent(lblEnder2)
                                            .addComponent(lblEnder1)
                                            .addComponent(lblNome)
                                            .addComponent(lblEnder7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jtfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(lblEnder4)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jtfTel))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(lblEnder5)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jtfCel))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel1)
                                                        .addGap(25, 25, 25)
                                                        .addComponent(jtfCpf))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btnPesqCli, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jtfEndereco))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(PanelPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblEnder3)
                                                    .addComponent(lblCidade))
                                                .addGap(10, 10, 10)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel2)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jtfCep))
                                                    .addComponent(jtfComplemento)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblCnpj)
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtfIe, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(9, 9, 9)))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCGC1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesqCli))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEnder)
                            .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(PanelPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnder2)
                    .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEnder3)
                    .addComponent(jtfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnder1)
                    .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade)
                    .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jtfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCnpj)
                    .addComponent(jtfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jtfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCGC1)
                        .addComponent(jtfIe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblEnder5)
                    .addComponent(jtfCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEnder4)
                        .addComponent(jtfTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEnder7))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnCancelar)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    
    
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        int id = 0;
        try {
                id = control.inserirCliente(jtfNome.getText(), jtfEndereco.getText(), jtfNumero.getText(), jtfBairro.getText(), jtfComplemento.getText(),
                    jtfTel.getText(), jtfCel.getText(), (Cidade) cmbCidade.getSelectedItem(),jtfCep.getText(), (char) bGroupTipo.getSelection().getMnemonic(), jtfEmail.getText(),
                    jtfCpf.getText(), jtfCnpj.getText(), jtfIe.getText());
            
                JOptionPane.showMessageDialog(this, "Cliente " + id + " - " + jtfNome.getText() + " inserido com sucesso.");

        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(this, "Digite um ID numerico." + 
                    erro.getMessage() + erro.getCause() );
        } catch (util.ClienteException erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage() );
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(this, "Erro desconhecimento. " + 
                    erro.getMessage() + erro.getClass() );            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Erro desconhecimento. " + 
                    erro.getMessage() + erro.getClass() );
        }   
        
        limpaDados();  // Limpa os campos para que na proxima vez que a janela for chamada não apareça os ultimos dados cadastrados.
        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        rbFisica.setEnabled(true);
        rbJuridica.setEnabled(true);
        btnNovo.setVisible(true);
        habilitarModo(1);
        if((jtfNome.getText().trim().equals(""))&& (jtfEndereco.getText().trim().equals("")) && (jtfBairro.getText().trim().equals("")
                && (jtfCel.getText().trim().equals(""))&&(jtfCep.getText().trim().equals(""))&&(jtfCnpj.getText().trim().equals(""))
                && (jtfComplemento.getText().trim().equals(""))&&(jtfCpf.getText().trim().equals(""))&&(jtfEmail.getText().trim().equals("")
                && (jtfIe.getText().trim().equals(""))&&(jtfTel.getText().trim().equals(""))&&(jtfNumero.getText().trim().equals(""))))){
            this.setVisible(false); 
        }else{
            limpaDados();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jtfComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfComplementoActionPerformed

    private void jtfIeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIeActionPerformed

    private void rbFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFisicaActionPerformed
        // TODO add your handling code here:
        jtfCpf.setEnabled(true);
        jtfCnpj.setEnabled(false);
        jtfIe.setEnabled(false);
    }//GEN-LAST:event_rbFisicaActionPerformed

    private void jtfEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEnderecoActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        
        rbJuridica.setSelected(true);
        jtfCpf.setEnabled(false);
        jtfCnpj.setEnabled(true);
        jtfIe.setEnabled(true);
        
        try {        
            control.carregarComboCidade(cmbCidade);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(this, "Erro ao consultar CIDADES. " + 
                    erro.getMessage() + erro.getClass() );            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Erro não esperado ao consultar CIDADES. " + 
                    erro.getMessage() + erro.getClass() );
        } 
        
    }//GEN-LAST:event_formComponentShown

    private void btnPesqCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqCliActionPerformed
        // TODO add your handling code here:
        JanelaClientePesqDialog cliPesq;
        
        try {
            cliPesq = new JanelaClientePesqDialog(null, true);
            cliPesq.setVisible(true); 
            
            cli = cliPesq.getCliente();

            if ( cli != null ){
                
                jtfNome.setText( cli.getNome()  );
                jtfEndereco.setText( cli.getEndereco()  );
                jtfBairro.setText( cli.getBairro()  );
                jtfNumero.setText(cli.getNumero());
                jtfComplemento.setText(cli.getComplemento());
                jtfCep.setText(cli.getCep());
                jtfTel.setText(cli.getTelFixo());
                jtfCel.setText(cli.getTelCel());
                jtfEmail.setText(cli.getEmail());
                cmbCidade.getModel().setSelectedItem(cli.getCidade());
                if(cli.getTipoCliente() == 'F'){
                    jtfCpf.setEnabled(true);
                    jtfCpf.setText(cli.getPessoafisica().getCpf()); 
                    rbFisica.setSelected(true);
                    jtfCnpj.setEnabled(false);
                    jtfIe.setEnabled(false);
                }else{
                    if(cli.getTipoCliente() == 'J'){                        
                        jtfCnpj.setEnabled(true);
                        jtfIe.setEnabled(true);
                        rbJuridica.setSelected(true);
                        jtfCnpj.setText(cli.getPessoajuridica().getCnpj());
                        jtfIe.setText(cli.getPessoajuridica().getIe()); 
                        
                        jtfCpf.setEnabled(false);
                    }
                }
                
                rbFisica.setEnabled(false);
                rbJuridica.setEnabled(false);
                
                btnNovo.setVisible(false);
                btnAlterar.setVisible(true);
                btnAlterar.setEnabled(true);
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO ao PESQUISAR. " + ex.getMessage() );
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ERRO ao PESQUISAR. " + ex.getMessage() );
        }        

    }//GEN-LAST:event_btnPesqCliActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        
        
        
        try{
            if ( cli != null ) {   
                control.alterarCliente(cli.getIdCliente(),jtfNome.getText(), jtfEndereco.getText(), jtfNumero.getText(), jtfBairro.getText(), jtfComplemento.getText(),
                    jtfTel.getText(), jtfCel.getText(), (Cidade) cmbCidade.getSelectedItem(),jtfCep.getText(), (char) bGroupTipo.getSelection().getMnemonic(), jtfEmail.getText(),
                    jtfCpf.getText(), jtfCnpj.getText(), jtfIe.getText());
                        
                JOptionPane.showMessageDialog(this, "Cliente " + cli.getNome() + " alterado com sucesso."  );
                
                rbFisica.setEnabled(true);
                rbJuridica.setEnabled(true);
                jtfCnpj.setEnabled(true);
                jtfIe.setEnabled(true);
                jtfCpf.setEnabled(false);
                
                limpaDados();
                btnNovo.setVisible(true);
                habilitarModo(1);
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO ao ALTERAR. " + ex.getMessage() );
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ERRO ao ALTERAR. " + ex.getMessage() );
        }                  
 
        
        
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void rbJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbJuridicaActionPerformed
        // TODO add your handling code here:
        jtfCpf.setEnabled(false);
        jtfCnpj.setEnabled(true);
        jtfIe.setEnabled(true);
    }//GEN-LAST:event_rbJuridicaActionPerformed

    private void cmbCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCidadeActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaClienteDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaClienteDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaClienteDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaClienteDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaClienteDialog dialog = new JanelaClienteDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel PanelPessoa;
    private javax.swing.ButtonGroup bGroupTipo;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesqCli;
    private javax.swing.JComboBox cmbCidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtfBairro;
    private javax.swing.JTextField jtfCel;
    private javax.swing.JTextField jtfCep;
    private javax.swing.JTextField jtfCnpj;
    private javax.swing.JTextField jtfComplemento;
    private javax.swing.JTextField jtfCpf;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JTextField jtfIe;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfNumero;
    private javax.swing.JTextField jtfTel;
    private javax.swing.JLabel lblCGC1;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCnpj;
    private javax.swing.JLabel lblEnder;
    private javax.swing.JLabel lblEnder1;
    private javax.swing.JLabel lblEnder2;
    private javax.swing.JLabel lblEnder3;
    private javax.swing.JLabel lblEnder4;
    private javax.swing.JLabel lblEnder5;
    private javax.swing.JLabel lblEnder7;
    private javax.swing.JLabel lblNome;
    private javax.swing.JRadioButton rbFisica;
    private javax.swing.JRadioButton rbJuridica;
    // End of variables declaration//GEN-END:variables
}
