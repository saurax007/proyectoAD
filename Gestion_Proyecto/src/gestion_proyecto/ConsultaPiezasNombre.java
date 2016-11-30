/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_proyecto;

import gestion_proyecto.GestionBD.CreacionBD;
import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gregorio
 */
public class ConsultaPiezasNombre extends javax.swing.JFrame {

private static final String usarBD = "USE proyecto";
ResultSet rs = null;
Connection con;
    /**
     * Creates new form ConsultaProveedoreesCodigo
     */
    public ConsultaPiezasNombre() throws SQLException {
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
        proveedorText = new javax.swing.JTextField();
        btBuscarPieza = new javax.swing.JButton();
        proveedorCombo = new javax.swing.JComboBox<>();
        datosText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Escriba el nombre de la pieza");

        btBuscarPieza.setText("Buscar Pieza");
        btBuscarPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarPiezaActionPerformed(evt);
            }
        });

        proveedorCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        proveedorCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedorComboActionPerformed(evt);
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
                        .addComponent(proveedorText, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btBuscarPieza))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(proveedorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(datosText, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(proveedorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarPieza))
                .addGap(18, 18, 18)
                .addComponent(proveedorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(datosText, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarPiezaActionPerformed
    String nombre = btBuscarPieza.getText();
         try {
        PreparedStatement statement = con.prepareStatement("SELECT * FROM piezas WHERE NOMBRE = '?'*");
        statement.setString(1, nombre);
        rs = statement.executeQuery();
         while (rs.next()) {
                proveedorCombo.addItem(rs.getString(1));
            }
    } catch (SQLException ex) {
        Logger.getLogger(ConsultaPiezasNombre.class.getName()).log(Level.SEVERE, null, ex);
    }

    }//GEN-LAST:event_btBuscarPiezaActionPerformed

    private void proveedorComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedorComboActionPerformed
       String nombre = String.valueOf(proveedorCombo.getSelectedItem());;
         try {
        PreparedStatement statement = con.prepareStatement("SELECT * FROM piezas WHERE NOMBRE = '?'");
        statement.setString(1, nombre);
        rs = statement.executeQuery();
         while (rs.next()) {
             datosText.setText(rs.getString(1)+"\n"+rs.getString(2)+"\n"+rs.getString(3)+"\n"+rs.getString(4));   
            }
    } catch (SQLException ex) {
        Logger.getLogger(ConsultaPiezasNombre.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_proveedorComboActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarPieza;
    private javax.swing.JTextField datosText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> proveedorCombo;
    private javax.swing.JTextField proveedorText;
    // End of variables declaration//GEN-END:variables
}
