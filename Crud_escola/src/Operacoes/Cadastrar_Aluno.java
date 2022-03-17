package Operacoes;
        
import DB.DB;
import DB.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Alunos.Aluno;
import Alunos.Menu_Alunos;
import javax.swing.JFrame;

public class Cadastrar_Aluno extends javax.swing.JFrame {

    public Cadastrar_Aluno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        area_alunos = new javax.swing.JButton();
        area_cursos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CadastrarCodigoAluno_Field = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        CadastrarNomeAluno_Field = new javax.swing.JTextField();
        CancelarCadastroAluno_Button = new javax.swing.JButton();
        CadastrarAluno_Button = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("VR Cursos"));

        jLabel3.setText("Bem Vindo!");

        jLabel4.setText("Selecione abaixo a opção desejada:");

        area_alunos.setText("Área de Alunos");

        area_cursos.setText("Área de Cursos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(area_alunos)
                        .addGap(76, 76, 76)
                        .addComponent(area_cursos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(area_alunos)
                    .addComponent(area_cursos))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Codigo do Aluno:");

        jLabel1.setText("Nome do Aluno:");

        CancelarCadastroAluno_Button.setText("Voltar");
        CancelarCadastroAluno_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarCadastroAluno_ButtonActionPerformed(evt);
            }
        });

        CadastrarAluno_Button.setText("Cadastrar");
        CadastrarAluno_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarAluno_ButtonActionPerformed(evt);
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
                            .addComponent(CadastrarCodigoAluno_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 130, Short.MAX_VALUE))
                            .addComponent(CadastrarNomeAluno_Field)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CancelarCadastroAluno_Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CadastrarAluno_Button)))
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
                    .addComponent(CadastrarCodigoAluno_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CadastrarNomeAluno_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadastrarAluno_Button)
                    .addComponent(CancelarCadastroAluno_Button))
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarAluno_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarAluno_ButtonActionPerformed
        Aluno a = new Aluno();
        Cadastrar_Aluno CA = new Cadastrar_Aluno();
        Menu_Alunos alun = new Menu_Alunos();
        a.setCodigo(Integer.parseInt(CadastrarCodigoAluno_Field.getText()));
        a.setNome(CadastrarNomeAluno_Field.getText());
        
        CA.create(a);
        
        CadastrarCodigoAluno_Field.setText("");
        CadastrarNomeAluno_Field.setText("");
        
        alun.readJtable();
    }//GEN-LAST:event_CadastrarAluno_ButtonActionPerformed

    private void CancelarCadastroAluno_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarCadastroAluno_ButtonActionPerformed
            Menu_Alunos MA = new Menu_Alunos();
            MA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(false);
            MA.setVisible(true);
    }//GEN-LAST:event_CancelarCadastroAluno_ButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Cadastrar_Aluno().setVisible(true);
            }
        });
    }
 
       
    public void create(Aluno a) {
        Connection conn = DB.getConnection();
        PreparedStatement stmt = null;

        try{
            stmt = conn.prepareStatement("INSERT INTO aluno (codigo, nome)VALUES(?,?)");

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
           
        

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarAluno_Button;
    private javax.swing.JTextField CadastrarCodigoAluno_Field;
    private javax.swing.JTextField CadastrarNomeAluno_Field;
    private javax.swing.JButton CancelarCadastroAluno_Button;
    private javax.swing.JButton area_alunos;
    private javax.swing.JButton area_cursos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
