/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gregorio
 */
public class ConsultaPiezasCodigo extends javax.swing.JFrame {
private static final String usarBD = "USE proyecto";
ResultSet rs = null;
public String query = "select * FROM proyecto.piezas where CODIGO = ?";
Connection con;
    
    /**
     * Creates new form ConsultaProveedoreesCodigo
     */
    public ConsultaPiezasCodigo() throws SQLException {
        this.con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull",
                "root", "root");
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
        tfCodigo = new javax.swing.JTextField();
        btBuscarPiezas = new javax.swing.JButton();
        cbCodigo = new javax.swing.JComboBox<>();
        tfDatos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Escribe el codigo o parte del codigo");

        btBuscarPiezas.setText("Buscar Piezas");
        btBuscarPiezas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarPiezasActionPerformed(evt);
            }
        });

        cbCodigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btBuscarPiezas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(cbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(tfDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarPiezas))
                .addGap(18, 18, 18)
                .addComponent(cbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarPiezasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarPiezasActionPerformed
       String codigo = tfCodigo.getText();
         try {
        PreparedStatement statement = con.prepareStatement("SELECT * FROM piezas WHERE CODIGO = ? ");
        statement.setString(1, codigo);
        rs = statement.executeQuery();
         while (rs.next()) {
                cbCodigo.addItem(rs.getString(1));
            }
    } catch (SQLException ex) {
        Logger.getLogger(ConsultaPiezasNombre.class.getName()).log(Level.SEVERE, null, ex);
    }

    }//GEN-LAST:event_btBuscarPiezasActionPerformed

    private void cbCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCodigoActionPerformed
       String codigo = String.valueOf(cbCodigo.getSelectedItem());;
         try {
        PreparedStatement statement = con.prepareStatement("SELECT * FROM piezas WHERE CODIGO = '?'");
        statement.setString(1, codigo);
        rs = statement.executeQuery();
         while (rs.next()) {
             tfDatos.setText(rs.getString(1)+"\n"+rs.getString(2)+"\n"+rs.getString(3)+"\n"+rs.getString(4));   
            }
    } catch (SQLException ex) {
        Logger.getLogger(ConsultaPiezasNombre.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_cbCodigoActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarPiezas;
    private javax.swing.JComboBox<String> cbCodigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDatos;
    // End of variables declaration//GEN-END:variables
}
