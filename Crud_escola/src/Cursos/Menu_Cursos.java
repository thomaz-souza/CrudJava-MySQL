
package Cursos;

import DB.DB;
import DB.DbException;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import Operacoes.Atualizar_Curso;
import java.awt.event.*;
import Operacoes.Cadastrar_Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Menu_Cursos extends javax.swing.JFrame implements ActionListener {

    public List<Curso> read(){
        
        Connection conn = DB.getConnection();
        PreparedStatement stmt = null; 
        ResultSet rs = null;
        
        List<Curso> cursos = new ArrayList<>();
        
        try{
            stmt = conn.prepareStatement("SELECT * FROM curso");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Curso curso =  new Curso();
                curso.setCodigo(rs.getInt("codigo"));
                curso.setDescricao("descricao");
                curso.setEmenta("ementa");
                cursos.add(curso);
            }
        }
        
        catch(SQLException e){
            throw new DbException(e.getMessage()); 
        }
        
        finally{
            DB.closeConnection();
         } 
        
        return cursos;        
    }
    
    
    public Menu_Cursos() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) MenuCursos_Table.getModel();
        MenuCursos_Table.setRowSorter(new TableRowSorter(modelo));
   
        readJtable();
    }
    
    public void readJtable(){
        DefaultTableModel modelo = (DefaultTableModel) MenuCursos_Table.getModel();
        modelo.setNumRows(0);
        Menu_Cursos curs = new Menu_Cursos();
        
        for(Curso a: curs.read()){
            modelo.addRow(new Object[]{
                a.getCodigo(),
                a.getDescricao(),
                a.getEmenta()
            });
            
        }    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        CadastrarCurso_Button = new javax.swing.JButton();
        AtualizarCurso_Button = new javax.swing.JButton();
        DeletarCurso_Button = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        MenuCursos_Table = new javax.swing.JTable();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Área de Cursos"));

        CadastrarCurso_Button.setText("Cadastrar");
        CadastrarCurso_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarCurso_ButtonActionPerformed(evt);
            }
        });

        AtualizarCurso_Button.setText("Atualizar");
        AtualizarCurso_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarCurso_ButtonActionPerformed(evt);
            }
        });

        DeletarCurso_Button.setText("Deletar");
        DeletarCurso_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarCurso_ButtonActionPerformed(evt);
            }
        });

        MenuCursos_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Descricao", "Ementa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(MenuCursos_Table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AtualizarCurso_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CadastrarCurso_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeletarCurso_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(CadastrarCurso_Button)
                .addGap(18, 18, 18)
                .addComponent(AtualizarCurso_Button)
                .addGap(18, 18, 18)
                .addComponent(DeletarCurso_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarCurso_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarCurso_ButtonActionPerformed
        CadastrarCurso_Button.addActionListener(this);
    }//GEN-LAST:event_CadastrarCurso_ButtonActionPerformed

    private void AtualizarCurso_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarCurso_ButtonActionPerformed
        AtualizarCurso_Button.addActionListener(this);
    }//GEN-LAST:event_AtualizarCurso_ButtonActionPerformed

    private void DeletarCurso_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarCurso_ButtonActionPerformed
        if(MenuCursos_Table.getSelectedRow() != -1){
        
            Curso c = new Curso();
            Cursos.DeletarCursos dell = new Cursos.DeletarCursos();
            Menu_Cursos MC = new Menu_Cursos();

            c.setCodigo((int)MenuCursos_Table.getValueAt(MenuCursos_Table.getSelectedRow(), 0));
                       
            dell.delete(c);
            readJtable();
        }        DeletarCurso_Button.addActionListener(this);
    }//GEN-LAST:event_DeletarCurso_ButtonActionPerformed

 
    public static void main(String args[]) {
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu_Cursos().setVisible(true);
            }
        });
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {    
        if(e.getSource() == CadastrarCurso_Button ){
        
            Cadastrar_Curso CC = new Cadastrar_Curso();
            CC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(false);
            CC.setVisible(true);
        
        } 
        
        if(e.getSource() == AtualizarCurso_Button ){
        
            Atualizar_Curso AC = new Atualizar_Curso();
            AC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(false);
            AC.setVisible(true);
        
        } 
        
        else{
        
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtualizarCurso_Button;
    private javax.swing.JButton CadastrarCurso_Button;
    private javax.swing.JButton DeletarCurso_Button;
    private javax.swing.JTable MenuCursos_Table;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    
    
}
