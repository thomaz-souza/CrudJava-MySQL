package Operacoes;

import DB.DB;
import DB.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Alunos.Aluno;
import Alunos.Menu_Alunos;
import javax.swing.JFrame;


public class Atualizar_Aluno extends javax.swing.JFrame {

    public Atualizar_Aluno() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        AtualizarCodigoAluno_Field = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        AtualizarNomeAluno_Field = new javax.swing.JTextField();
        CancelarAtualizacaoAluno_Button = new javax.swing.JButton();
        AtualizarAluno_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Codigo do Aluno:");

        jLabel1.setText("Nome do Aluno:");

        CancelarAtualizacaoAluno_Button.setText("Cancelar");
        CancelarAtualizacaoAluno_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarAtualizacaoAluno_ButtonActionPerformed(evt);
            }
        });

        AtualizarAluno_Button.setText("Atualizar");
        AtualizarAluno_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarAluno_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AtualizarCodigoAluno_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 130, Short.MAX_VALUE))
                            .addComponent(AtualizarNomeAluno_Field)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CancelarAtualizacaoAluno_Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AtualizarAluno_Button)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AtualizarCodigoAluno_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AtualizarNomeAluno_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AtualizarAluno_Button)
                    .addComponent(CancelarAtualizacaoAluno_Button))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtualizarAluno_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarAluno_ButtonActionPerformed
                
        Aluno a = new Aluno();
        Atualizar_Aluno AA = new Atualizar_Aluno();
        Menu_Alunos alun = new Menu_Alunos();
        
        a.setCodigo(Integer.parseInt(AtualizarCodigoAluno_Field.getText()));
        a.setNome(AtualizarNomeAluno_Field.getText());
        
        AA.create(a);
        
        AtualizarCodigoAluno_Field.setText("");
        AtualizarNomeAluno_Field.setText("");
        alun.readJtable();
        
    }//GEN-LAST:event_AtualizarAluno_ButtonActionPerformed

    private void CancelarAtualizacaoAluno_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarAtualizacaoAluno_ButtonActionPerformed
        Menu_Alunos MA = new Menu_Alunos();
            MA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(false);
            MA.setVisible(true);
    }//GEN-LAST:event_CancelarAtualizacaoAluno_ButtonActionPerformed

    public void create(Aluno a) {
                Connection conn = DB.getConnection();
                PreparedStatement stmt = null;

                try{
                    stmt = conn.prepareStatement("UPDATE aluno SET codigo = ?, nome = ?");
                    
                    stmt.setInt(1, a.getCodigo());
                    stmt.setString(2, a.getNome());

                    stmt.executeUpdate();
                }

                catch(SQLException e){
                    throw new DbException(e.getMessage());
                }
                
                finally{
                    DB.closeConnection();
                }       
    } 
    
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
            java.util.logging.Logger.getLogger(Atualizar_Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Atualizar_Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Atualizar_Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Atualizar_Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Atualizar_Aluno().setVisible(true);
            }
        });
       
    }    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtualizarAluno_Button;
    private javax.swing.JTextField AtualizarCodigoAluno_Field;
    private javax.swing.JTextField AtualizarNomeAluno_Field;
    private javax.swing.JButton CancelarAtualizacaoAluno_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
