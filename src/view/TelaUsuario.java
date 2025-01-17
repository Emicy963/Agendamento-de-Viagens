/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AppointmentController;
import controller.UsuarioController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Appointment;
import model.Usuario;

/**
 *
 * @author Anderson Cafurica
 */
public class TelaUsuario extends javax.swing.JFrame {

    /**
     * Creates new form TelaUsuario
     */
    private Usuario usuarioLogado;
    public TelaUsuario() {
        initComponents();
        UsuarioController usuarioController = new UsuarioController();
        this.usuarioLogado = usuarioController.getUsuarioLogado();
        btnVer.setEnabled(false);
        btnEditar.setEnabled(false);
        btnApagar.setEnabled(false);

        // Se não estiver logado, feche a tela
        if (this.usuarioLogado == null) {
            JOptionPane.showMessageDialog(null, 
                "Usuário não autenticado. Faça login novamente.", 
                "Erro de Autenticação", 
                JOptionPane.ERROR_MESSAGE);
            dispose();
            new Login().setVisible(true);
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
        btn_exit = new javax.swing.JButton();
        btnMarcar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbConsulta = new javax.swing.JTable();
        cbTipoConsulta = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbPro = new javax.swing.JComboBox<>();
        txtData = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtObs = new javax.swing.JTextField();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(730, 604));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btn_exit.setText("Fechar");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        btnMarcar.setText("Marcar Consulta");
        btnMarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcarActionPerformed(evt);
            }
        });

        btnVer.setText("Ver Consultas");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar Consultas");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnApagar.setText("Apagar Consulta");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        tbConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Paciente", "Dr/Dra", "Tipo de Consulta:", "Data da Consulta:", "Observações:", "Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbConsultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbConsulta);

        cbTipoConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Geral", "Dentista", "Oftamologia", "Análise", "Outras" }));

        jLabel1.setText("Tipo de Consulta:");

        jLabel2.setText("Profissional:");

        cbPro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dr. Raúl", "Dra. Carla", "Dra. Paula", "Dr. Antonio" }));
        cbPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProActionPerformed(evt);
            }
        });

        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        jLabel3.setText("Data da Consulta(dd/mm/aaaa HH:MM):");

        jLabel4.setText("Observações:");

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMarcar)
                        .addGap(82, 82, 82)
                        .addComponent(btnVer)
                        .addGap(57, 57, 57)
                        .addComponent(btnEditar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbPro, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(txtObs))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_exit)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(499, 499, 499)
                                .addComponent(btnApagar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(547, 547, 547)
                        .addComponent(btnLogout)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_exit)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbTipoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cbPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMarcar)
                    .addComponent(btnVer)
                    .addComponent(btnEditar)
                    .addComponent(btnApagar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbConsultaMouseClicked
        int selectedRow = tbConsulta.getSelectedRow();

        if(selectedRow >= 0){
            btnApagar.setEnabled(true);
            btnEditar.setEnabled(true);
            
            txtData.setText(tbConsulta.getValueAt(selectedRow, 3).toString());
            txtObs.setText(tbConsulta.getValueAt(selectedRow, 4).toString());
        }
    }//GEN-LAST:event_tbConsultaMouseClicked

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        int selectedRow = tbConsulta.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, 
                "Selecione uma consulta para apagar.", 
                "Erro", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirmar = JOptionPane.showConfirmDialog(null, 
            "Tem certeza que deseja apagar esta consulta?", 
            "Confirmar Exclusão", 
            JOptionPane.YES_NO_OPTION);

        if (confirmar == JOptionPane.YES_OPTION) {
            try {
                int consultaId = Integer.parseInt(tbConsulta.getValueAt(selectedRow, 5).toString());

                AppointmentController consultaController = new AppointmentController();
                boolean excluido = consultaController.excluirConsulta(consultaId);

                if (excluido) {
                    btnVerActionPerformed(evt);

                    JOptionPane.showMessageDialog(null, 
                        "Consulta apagada com sucesso!", 
                        "Sucesso", 
                        JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, 
                        "Não foi possível apagar a consulta.", 
                        "Erro", 
                        JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, 
                    "Erro ao apagar consulta: " + e.getMessage(), 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int selectedRow = tbConsulta.getSelectedRow();
    
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, 
                "Selecione uma consulta para editar.", 
                "Erro", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            String dataAtual = tbConsulta.getValueAt(selectedRow, 3).toString();
            String tipoConsultaAtual = tbConsulta.getValueAt(selectedRow, 2).toString();
            String obsAtual = tbConsulta.getValueAt(selectedRow, 4).toString();

            String novaData = JOptionPane.showInputDialog(null, 
                "Digite a nova data (dd/mm/aaaa HH:mm):", 
                dataAtual);

            String novoTipo = (String) JOptionPane.showInputDialog(null, 
                "Selecione o novo tipo de consulta:", 
                "Editar Consulta", 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                new String[]{"Geral", "Dentista", "Oftamologia", "Análise", "Outras"}, 
                tipoConsultaAtual);

            String novaObs = JOptionPane.showInputDialog(null, 
                "Digite novas observações:", 
                obsAtual);

            if (novaData == null || novoTipo == null || novaObs == null) {
                return;
            }

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            LocalDateTime novaDataHora = LocalDateTime.parse(novaData, formatter);

            int consultaId = Integer.parseInt(tbConsulta.getValueAt(selectedRow, 5).toString());

            AppointmentController consultaController = new AppointmentController();
            consultaController.editarConsulta(consultaId, novaDataHora, novoTipo, novaObs);

            btnVerActionPerformed(evt);

            JOptionPane.showMessageDialog(null, 
                "Consulta editada com sucesso!", 
                "Sucesso", 
                JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                "Erro ao editar consulta: " + e.getMessage(), 
                "Erro", 
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
         try {
            DefaultTableModel model = (DefaultTableModel) tbConsulta.getModel();
            model.setRowCount(0);

            AppointmentController consultaController = new AppointmentController();

            List<Appointment> consultas = consultaController.listarConsultas(usuarioLogado.getId());

            for (Appointment consulta : consultas) {
                String profissional = "";
                switch(consulta.getProfissionalId()) {
                    case 1: profissional = "Dr. Raúl"; break;
                    case 2: profissional = "Dra. Carla"; break;
                    case 3: profissional = "Dra. Paula"; break;
                    case 4: profissional = "Dr. Antonio"; break;
                }

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                String dataFormatada = consulta.getDataHora().format(formatter);

                model.addRow(new Object[]{
                    usuarioLogado.getNome(), 
                    profissional, 
                    consulta.getTipoConsulta(), 
                    dataFormatada, 
                    consulta.getObservacao(),
                    consulta.getId()
                });
            }

            if (consultas.isEmpty()) {
                JOptionPane.showMessageDialog(null, 
                    "Você não tem consultas marcadas.", 
                    "Consultas", 
                    JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                "Erro ao listar consultas: " + e.getMessage(), 
                "Erro", 
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnMarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcarActionPerformed
        try {
            UsuarioController usuario = new UsuarioController();
            if (usuarioLogado == null) {
                JOptionPane.showMessageDialog(null, 
                    "Usuário não está logado. Por favor, faça login primeiro.", 
                    "Erro de Autenticação", 
                    JOptionPane.ERROR_MESSAGE);
            return;
             }

            String profissional = (String) cbPro.getSelectedItem();
            String tipoConsulta = (String) cbTipoConsulta.getSelectedItem();
            String dataHoraStr = txtData.getText().trim();
            String obs = txtObs.getText().trim();

            if (profissional == null || profissional.isEmpty()) {
                JOptionPane.showMessageDialog(null, 
                    "Por favor, selecione um profissional.", 
                    "Campos Obrigatórios", 
                    JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (tipoConsulta == null || tipoConsulta.isEmpty()) {
                JOptionPane.showMessageDialog(null, 
                    "Por favor, selecione o tipo de consulta.", 
                    "Campos Obrigatórios", 
                    JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (dataHoraStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, 
                    "Por favor, insira a data e hora da consulta.", 
                    "Campos Obrigatórios", 
                    JOptionPane.WARNING_MESSAGE);
                return;
            }

            DateTimeFormatter formato;
            LocalDateTime dataHora;
            try {
                formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                dataHora = LocalDateTime.parse(dataHoraStr, formato);
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(null, 
                    "Formato de data inválido. Use o formato dd/MM/yyyy HH:mm", 
                    "Erro de Formato", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (dataHora.isBefore(LocalDateTime.now())) {
                JOptionPane.showMessageDialog(null, 
                    "Não é possível marcar consultas para datas passadas.", 
                    "Data Inválida", 
                    JOptionPane.WARNING_MESSAGE);
                return;
            }

            int profissionalId;
            switch (profissional) {
                case "Dr. Raúl": 
                    profissionalId = 1; 
                    break;
                case "Dra. Carla": 
                    profissionalId = 2; 
                    break;
                case "Dra. Paula": 
                    profissionalId = 3; 
                    break;
                case "Dr. Antonio": 
                    profissionalId = 4; 
                    break;
                default:
                    throw new IllegalArgumentException("Profissional não reconhecido");
            }

            AppointmentController consulta = new AppointmentController();
            Appointment novaConsulta = consulta.marcarConsulta(
                usuarioLogado.getId(), 
                profissionalId, 
                dataHora, 
                tipoConsulta, 
                obs
            );

            btnVer.setEnabled(true);
            txtData.setText("");
            txtObs.setText("");

            JOptionPane.showMessageDialog(null,
                "Consulta Marcada Com Sucesso!",
                "Sucesso na Marcação",
                JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            // Tratamento genérico de exceções
            JOptionPane.showMessageDialog(null,
                "Erro ao Marcar Consulta: " + e.getMessage(),
                "Erro na Marcação",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnMarcarActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        dispose();
    }//GEN-LAST:event_btn_exitActionPerformed

    private void cbProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        UsuarioController usuarioController = new UsuarioController();
        usuarioController.logout();
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMarcar;
    private javax.swing.JButton btnVer;
    private javax.swing.JButton btn_exit;
    private javax.swing.JComboBox<String> cbPro;
    private javax.swing.JComboBox<String> cbTipoConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbConsulta;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtObs;
    // End of variables declaration//GEN-END:variables
}
