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
public class ConsultaPiezasNombre extends javax.swing.JFrame {

    ResultSet rs = null;

    public ConsultaPiezasNombre() {
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
        btBuscarProveedor = new javax.swing.JButton();
        cbCodigo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        datosText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Escriba el nombre de la pieza");

        btBuscarProveedor.setText("Buscar Pieza");
        btBuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarProveedorActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btBuscarProveedor))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(cbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 75, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarProveedor))
                .addGap(18, 18, 18)
                .addComponent(cbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarProveedorActionPerformed
 ControladorBD bd = new ControladorBD();
        rs = bd.GetPiezasPorNombre(tfCodigo.getText());
        cbCodigo.removeAllItems();
        try {
            if (rs.next()) {
                do {
                    cbCodigo.addItem(rs.getString(2));
                } while (rs.next());

            } else {
                System.out.println("No hay nada");
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConsultaProveedoresCodigo.class.getName()).log(Level.SEVERE, null, ex);
        }



    }//GEN-LAST:event_btBuscarProveedorActionPerformed

    private void cbCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbCodigoMouseClicked
        try {
            datosText.setText("");
            rs.first();
            if (rs.next()) {
                rs.first();
                do {
                    if (cbCodigo.getSelectedItem().toString().equalsIgnoreCase(rs.getString(2))) {
                        datosText.append(rs.getString(1) + " " + rs.getString(2) + " " + String.valueOf(rs.getFloat(3)) + " " + rs.getString(4)+ "\n");
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
    private javax.swing.JButton btBuscarProveedor;
    private javax.swing.JComboBox<String> cbCodigo;
    private javax.swing.JTextArea datosText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfCodigo;
    // End of variables declaration//GEN-END:variables
}
