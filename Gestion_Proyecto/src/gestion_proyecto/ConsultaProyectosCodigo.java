/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_proyecto;

import gestion_proyecto.GestionBD.ControladorBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gregorio
 */
public class ConsultaProyectosCodigo extends javax.swing.JFrame {

    ResultSet rs = null;

    public ConsultaProyectosCodigo() {
        initComponents();
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        cbCodigo.removeAllItems();

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
        proyectoButton = new javax.swing.JButton();
        cbCodigo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        datosText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Escribe el codigo o parte del codigo");

        proyectoButton.setText("Buscar Proveedor");
        proyectoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proyectoButtonActionPerformed(evt);
            }
        });

        cbCodigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbCodigoMouseClicked(evt);
            }
        });

        datosText.setColumns(20);
        datosText.setRows(5);
        jScrollPane1.setViewportView(datosText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(proyectoButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(cbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proyectoButton))
                .addGap(18, 18, 18)
                .addComponent(cbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proyectoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proyectoButtonActionPerformed
        ControladorBD bd = new ControladorBD();
        rs = bd.GetProyectosPorCod(tfCodigo.getText());
        cbCodigo.removeAllItems();
        try {
            if (rs.next()) {
                do {
                    cbCodigo.addItem(rs.getString(1));
                } while (rs.next());

            } else {
                System.out.println("No hay nada");
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConsultaProveedoresCodigo.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_proyectoButtonActionPerformed

    private void cbCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbCodigoMouseClicked
try {
            datosText.setText("");
            rs.first();
            if (rs.next()) {
                rs.first();
                do {
                    if (cbCodigo.getSelectedItem().toString().equalsIgnoreCase(rs.getString(1))) {
                        datosText.append(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3)+ "\n");
                    }
                } while (rs.next());
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConsultaProveedoresCodigo.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }//GEN-LAST:event_cbCodigoMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbCodigo;
    private javax.swing.JTextArea datosText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton proyectoButton;
    private javax.swing.JTextField tfCodigo;
    // End of variables declaration//GEN-END:variables
}
