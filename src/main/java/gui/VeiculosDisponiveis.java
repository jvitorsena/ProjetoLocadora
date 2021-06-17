/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.VeiculoDB;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Veiculo;

import dao.ClienteDB;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import models.Cliente;

/**
 *
 * @author jvito
 */
public class VeiculosDisponiveis extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    public VeiculosDisponiveis() {
        initComponents();
        carregaTabelaAtivos();
        desabilitarCampos();
        this.BtnAlterar.setEnabled(false);
        this.btnLimpar.setEnabled(false);
    }
    
    private void habilitarCampos(){
        this.txtAno.setEditable(true);
        this.txtChassi.setEditable(true);
        this.txtCor.setEditable(true);
        this.txtDescricao.setEditable(true);
        this.txtFabricante.setEditable(true);
        this.txtModelo.setEditable(true);
        this.txtPlaca.setEditable(true);
        this.btnSalvar.setEnabled(true);
    }
    
    private void desabilitarCampos(){ 
        this.txtAno.setEditable(false);
        this.txtChassi.setEditable(false);
        this.txtCor.setEditable(false);
        this.txtDescricao.setEditable(false);
        this.txtFabricante.setEditable(false);
        this.txtModelo.setEditable(false);
        this.txtPlaca.setEditable(false);
        this.btnSalvar.setEnabled(false);
    }
    
    private void carregaTabelaAtivos(){
        
        DefaultTableModel modelo = (DefaultTableModel) tbVeiculos.getModel();
        modelo.setNumRows(0);
        
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        
        
        tbVeiculos.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        tbVeiculos.getColumnModel().getColumn(1).setCellRenderer(centralizado);
        tbVeiculos.getColumnModel().getColumn(2).setCellRenderer(centralizado);
        tbVeiculos.getColumnModel().getColumn(3).setCellRenderer(centralizado);
        tbVeiculos.getColumnModel().getColumn(4).setCellRenderer(centralizado);
        tbVeiculos.getColumnModel().getColumn(5).setCellRenderer(centralizado);
        tbVeiculos.getColumnModel().getColumn(6).setCellRenderer(centralizado);
        tbVeiculos.getColumnModel().getColumn(7).setCellRenderer(centralizado);
        
        VeiculoDB veiculodb = new VeiculoDB();
        ArrayList<Veiculo> veiculos = veiculodb.listarVeiculosDisponiveis();
        
        
        if (veiculos != null){
            for (Veiculo v : veiculos){
                
                modelo.addRow(new Object[]{
                    
                    v.getIdVeiculo(),
                    v.getModelo(),
                    v.getCor(),
                    v.getPlaca(),
                    v.getDescricao(),
                    v.getChassi(),
                    v.getFabricante(),
                    v.getAno(),
//                    v.isIsActive(),
                    v.isDisponibilidade()
      
                });
            }
        }

    }
    
    
    
    private void carregaTabelaDisponiveis(){
        
        DefaultTableModel modelo = (DefaultTableModel) tbVeiculos.getModel();
        modelo.setNumRows(0);
        
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        
        
        tbVeiculos.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        tbVeiculos.getColumnModel().getColumn(1).setCellRenderer(centralizado);
        tbVeiculos.getColumnModel().getColumn(2).setCellRenderer(centralizado);
        tbVeiculos.getColumnModel().getColumn(3).setCellRenderer(centralizado);
        tbVeiculos.getColumnModel().getColumn(4).setCellRenderer(centralizado);
        tbVeiculos.getColumnModel().getColumn(5).setCellRenderer(centralizado);
        tbVeiculos.getColumnModel().getColumn(6).setCellRenderer(centralizado);
        tbVeiculos.getColumnModel().getColumn(7).setCellRenderer(centralizado);
        
        VeiculoDB veiculodb = new VeiculoDB();
        ArrayList<Veiculo> veiculos = veiculodb.listarVeiculosDisponiveis();
        
        
        if (veiculos != null){
            for (Veiculo v : veiculos){
                
                modelo.addRow(new Object[]{
                    
                    v.getIdVeiculo(),
                    v.getModelo(),
                    v.getCor(),
                    v.getPlaca(),
                    v.getDescricao(),
                    v.getChassi(),
                    v.getFabricante(),
                    v.getAno(),
//                    v.isIsActive(),
                    v.isDisponibilidade()
      
                });
            }
        }

    }
    
    private void carregaTabelaIndisponiveis(){
        
        DefaultTableModel modelo = (DefaultTableModel) tbVeiculos.getModel();
        modelo.setNumRows(0);
        
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        
        
        tbVeiculos.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        tbVeiculos.getColumnModel().getColumn(1).setCellRenderer(centralizado);
        tbVeiculos.getColumnModel().getColumn(2).setCellRenderer(centralizado);
        tbVeiculos.getColumnModel().getColumn(3).setCellRenderer(centralizado);
        tbVeiculos.getColumnModel().getColumn(4).setCellRenderer(centralizado);
        tbVeiculos.getColumnModel().getColumn(5).setCellRenderer(centralizado);
        tbVeiculos.getColumnModel().getColumn(6).setCellRenderer(centralizado);
        tbVeiculos.getColumnModel().getColumn(7).setCellRenderer(centralizado);
        
        VeiculoDB veiculodb = new VeiculoDB();
        ArrayList<Veiculo> veiculos = veiculodb.listarVeiculosIndisponiveis();
        
        
        if (veiculos != null){
            for (Veiculo v : veiculos){
                
                modelo.addRow(new Object[]{
                    
                    v.getIdVeiculo(),
                    v.getModelo(),
                    v.getCor(),
                    v.getPlaca(),
                    v.getDescricao(),
                    v.getChassi(),
                    v.getFabricante(),
                    v.getAno()
//                    v.isIsActive(),
//                    v.isDisponibilidade()
      
                });
            }
        }

    }
    
    private void limparCampos(){
        this.txtCode.setText("");
        this.txtModelo.setText("");
        this.txtCor.setText("");
        this.txtPlaca.setText("");
        this.txtDescricao.setText("");
        this.txtChassi.setText("");
        this.txtFabricante.setText("");
        this.txtAno.setText("");
    }
    
    private boolean verificaCampos(){
        
        if ("".equals(this.txtModelo.getText()) || "".equals(this.txtCor.getText()) || "".equals(this.txtPlaca.getText()) || "".equals(this.txtDescricao.getText()) || "".equals(this.txtChassi.getText()) || "".equals(this.txtFabricante.getText()) || "".equals(this.txtAno.getText())){
            return true;
        } else {
            return false;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVeiculos = new javax.swing.JTable();
        txtModelo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtChassi = new javax.swing.JTextField();
        txtFabricante = new javax.swing.JTextField();
        BtnAlterar = new javax.swing.JButton();
        txtCode = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        txtAno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Veiculos"));

        tbVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "IdVeiculo", "Modelo", "Cor", "Placa", "Descricao", "Chassi", "Fabricante", "Ano"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbVeiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbVeiculosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbVeiculos);
        if (tbVeiculos.getColumnModel().getColumnCount() > 0) {
            tbVeiculos.getColumnModel().getColumn(0).setMinWidth(50);
            tbVeiculos.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jLabel1.setText("Modelo:");

        jLabel2.setText("Cor:");

        jLabel3.setText("Placa:");

        jLabel4.setText("Descricao:");

        jLabel5.setText("Chassi:");

        jLabel6.setText("Fabricante:");

        BtnAlterar.setText("Editar");
        BtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlterarActionPerformed(evt);
            }
        });

        txtCode.setEditable(false);

        jLabel7.setText("ID:");

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar(evt);
            }
        });

        jLabel8.setText("Ano:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel7))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCor, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(txtModelo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(txtChassi))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(BtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVoltar)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbVeiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbVeiculosMouseClicked
        // TODO add your handling code here:
        
        Veiculo v = new Veiculo();
        VeiculoDB vdb = new VeiculoDB();
        
        int index = tbVeiculos.getSelectedRow();
        
        v = vdb.listarVeiculosDisponiveis().get(index);
        
        txtCode.setText(String.valueOf(v.getIdVeiculo()));
        txtModelo.setText(v.getModelo());
        txtCor.setText(v.getCor());
        txtPlaca.setText(v.getPlaca());
        txtDescricao.setText(v.getDescricao());
        txtChassi.setText(v.getChassi());
        txtFabricante.setText(v.getFabricante());
        txtAno.setText(String.valueOf(v.getAno()));
        
        BtnAlterar.setEnabled(true);
        btnLimpar.setEnabled(true);
        
        
    }//GEN-LAST:event_tbVeiculosMouseClicked

    private void BtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlterarActionPerformed
        // TODO add your handling code here:
        habilitarCampos();
        
             
    }//GEN-LAST:event_BtnAlterarActionPerformed

    private void btnVoltar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar
        // TODO add your handling code here:
        Home homeObj = new Home();
        homeObj.setVisible(true);
        homeObj.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVoltar

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        if ("".equals(this.txtCode.getText())){
            
            JOptionPane.showMessageDialog(rootPane, "Por favor, selecione um registro na tabela.");
            
        } else if (verificaCampos() == true){
            
            JOptionPane.showMessageDialog(rootPane, "Por favor, preencha todos os campos.");

            
        } else {
        
            String modelo = txtModelo.getText();
            
            Veiculo v = new Veiculo();
            VeiculoDB vdb = new VeiculoDB();
            
            int index = tbVeiculos.getSelectedRow();
            
            v = vdb.readAll().get(index);
            
            v.setModelo(txtModelo.getText());
            v.setCor(txtCor.getText());
            v.setPlaca(txtPlaca.getText());
            v.setDescricao(txtDescricao.getText());
            v.setChassi(txtChassi.getText());
            v.setFabricante(txtFabricante.getText());
            int ano = Integer.parseInt(txtAno.getText());
            v.setAno(ano);
            
            vdb.alterar(v);
            
            carregaTabelaAtivos();
            limparCampos();
            desabilitarCampos();
            BtnAlterar.setEnabled(false);
            btnLimpar.setEnabled(false);
            
            JOptionPane.showMessageDialog(rootPane, "Cliente " + modelo + " alterado com sucesso !");
            
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        limparCampos();
        desabilitarCampos();
        BtnAlterar.setEnabled(false);
        btnLimpar.setEnabled(false);
        btnSalvar.setEnabled(false);
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(VeiculosDisponiveis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VeiculosDisponiveis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VeiculosDisponiveis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VeiculosDisponiveis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VeiculosDisponiveis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAlterar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbVeiculos;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtChassi;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtFabricante;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}