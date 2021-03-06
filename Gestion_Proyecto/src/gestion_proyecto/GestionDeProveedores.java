/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_proyecto;

import gestion_proyecto.GestionBD.CreacionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gregorio
 */
public class GestionDeProveedores extends javax.swing.JFrame {

    ResultSet rs = null;
    int pagina;
    int ultimaPagina;
    ArrayList<String> CodigoProveedor = new ArrayList<String>();
    ArrayList<String> Nombre = new ArrayList<String>();
    ArrayList<String> Apellidos = new ArrayList<String>();
    ArrayList<String> Direccion = new ArrayList<String>();

    /**
     * Creates new form GestionDeProveedores
     */
    public GestionDeProveedores() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btLimpiar = new javax.swing.JButton();
        btInsertar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        tfCodigoProveedor = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfApellidos = new javax.swing.JTextField();
        tfDireccion = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfListadoCodProveedor = new javax.swing.JTextField();
        tfListadoNombre = new javax.swing.JTextField();
        tfListadoApellidos = new javax.swing.JTextField();
        tfListadoDireccion = new javax.swing.JTextField();
        tfListadoPagina = new javax.swing.JTextField();
        tfListadoPagTotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btListadoEjecutarConsulta = new javax.swing.JButton();
        btListadoIzquierdaMas = new javax.swing.JButton();
        btListadoIzquierda = new javax.swing.JButton();
        btListadoDerecha = new javax.swing.JButton();
        btListadoDerechaMas = new javax.swing.JButton();
        btListadoBaja = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("ALTAS BAJAS Y MODIFICACIONES");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Codigo de Proveedor");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Apellidos");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Direccion");

        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        btInsertar.setText("Insertar");
        btInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsertarActionPerformed(evt);
            }
        });

        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });

        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(btLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(tfCodigoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel2)
                                    .addGap(25, 25, 25)))
                            .addGap(14, 14, 14)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(48, 48, 48)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(31, 31, 31)
                        .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Gestion de Proveedores", jPanel3);
        jPanel3.getAccessibleContext().setAccessibleName("form1");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("LISTA DE PROVEEDORES - UTILIZA LOS BOTONES PARA IR DE UN REG A OTRO");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Codigo de Proveedor");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Nombre");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Apellidos");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Direccion");

        tfListadoCodProveedor.setEditable(false);

        tfListadoNombre.setEditable(false);

        tfListadoApellidos.setEditable(false);

        tfListadoDireccion.setEditable(false);

        tfListadoPagina.setEditable(false);

        tfListadoPagTotal.setEditable(false);

        jLabel11.setText("////");

        btListadoEjecutarConsulta.setText("Ejecutar Consulta");
        btListadoEjecutarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListadoEjecutarConsultaActionPerformed(evt);
            }
        });

        btListadoIzquierdaMas.setText("|<<");
        btListadoIzquierdaMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListadoIzquierdaMasActionPerformed(evt);
            }
        });

        btListadoIzquierda.setText("<<");
        btListadoIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListadoIzquierdaActionPerformed(evt);
            }
        });

        btListadoDerecha.setText(">>");
        btListadoDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListadoDerechaActionPerformed(evt);
            }
        });

        btListadoDerechaMas.setText(">>|");
        btListadoDerechaMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListadoDerechaMasActionPerformed(evt);
            }
        });

        btListadoBaja.setText("Baja");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfListadoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfListadoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfListadoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(tfListadoCodProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(tfListadoPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfListadoPagTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btListadoEjecutarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(btListadoBaja))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btListadoIzquierdaMas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btListadoIzquierda)
                                .addGap(18, 18, 18)
                                .addComponent(btListadoDerecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btListadoDerechaMas)))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfListadoCodProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfListadoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfListadoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfListadoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfListadoPagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfListadoPagTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btListadoEjecutarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btListadoBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btListadoIzquierdaMas)
                    .addComponent(btListadoIzquierda)
                    .addComponent(btListadoDerecha)
                    .addComponent(btListadoDerechaMas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listado de Proveedores", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btListadoDerechaMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListadoDerechaMasActionPerformed
        //Va al ultimo registro
        pagina = ultimaPagina;
        tfListadoCodProveedor.setText(CodigoProveedor.get(pagina));
        tfListadoNombre.setText(Nombre.get(pagina));
        tfListadoApellidos.setText(Apellidos.get(pagina));
        tfListadoDireccion.setText(Direccion.get(pagina));
        tfListadoPagina.setText(String.valueOf(pagina + 1));

    }//GEN-LAST:event_btListadoDerechaMasActionPerformed

    private void btInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsertarActionPerformed
        //Insertar Proveedor
        CreacionBD bd = new CreacionBD();
        if (tfCodigoProveedor.getText().equals("") || tfNombre.getText().equals("") || tfApellidos.getText().equals("") || tfDireccion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "HAY ALGUN CAMPO VACIO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else {
            bd.AltaProveedores(tfCodigoProveedor.getText(), tfNombre.getText(), tfApellidos.getText(), tfDireccion.getText());
            JOptionPane.showMessageDialog(null, "PROVEEDOR AÑADIDO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btInsertarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        CreacionBD bd = new CreacionBD();
        if (tfCodigoProveedor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "EL CAMPO CODIGO ESTA VACIO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int flag = bd.BajaProveedores(tfCodigoProveedor.getText());
            if (flag == 0) {
                JOptionPane.showMessageDialog(null, "HA HABIDO UN ERROR INTENTADO BORRAR EL PROVEEDOR", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "BORRADO CORRECTAMENTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

            }
        }
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        CreacionBD bd = new CreacionBD();
        if (tfCodigoProveedor.getText().equals("") || tfNombre.getText().equals("") || tfApellidos.getText().equals("") || tfDireccion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "HAY ALGUN CAMPO VACIO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else {
            bd.ModProveedores(tfCodigoProveedor.getText(), tfNombre.getText(), tfApellidos.getText(), tfDireccion.getText());
            JOptionPane.showMessageDialog(null, "PROVEEDOR MODIFICADO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btModificarActionPerformed

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        tfCodigoProveedor.setText("");
        tfNombre.setText("");
        tfApellidos.setText("");
        tfDireccion.setText("");
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void btListadoEjecutarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListadoEjecutarConsultaActionPerformed
        ResultSet rs = null;
        CreacionBD bd = new CreacionBD();

        //Se itera y guarda la informacion del resultset
        try {
            rs = bd.GetProveedores();
            while (rs.next()) {
                CodigoProveedor.add(rs.getString(1));
                Nombre.add(rs.getString(2));
                Apellidos.add(rs.getString(3));
                Direccion.add(rs.getString(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionDeProveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Se muestra el primer registro y se pone la pagina en 1
        pagina = 0;
        ultimaPagina = Nombre.size() - 1;

        tfListadoPagina.setText(String.valueOf(pagina + 1));
        tfListadoPagTotal.setText(String.valueOf(ultimaPagina+1));
        tfListadoCodProveedor.setText(CodigoProveedor.get(pagina));
        tfListadoNombre.setText(Nombre.get(pagina));
        tfListadoApellidos.setText(Apellidos.get(pagina));
        tfListadoDireccion.setText(Direccion.get(pagina));
    }//GEN-LAST:event_btListadoEjecutarConsultaActionPerformed

    private void btListadoIzquierdaMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListadoIzquierdaMasActionPerformed
        //Va a la primera pagina
        pagina = 0;
        tfListadoPagina.setText(String.valueOf(pagina));
        tfListadoCodProveedor.setText(CodigoProveedor.get(pagina));
        tfListadoNombre.setText(Nombre.get(pagina));
        tfListadoApellidos.setText(Apellidos.get(pagina));
        tfListadoDireccion.setText(Direccion.get(pagina));
        tfListadoPagina.setText(String.valueOf(pagina + 1));

    }//GEN-LAST:event_btListadoIzquierdaMasActionPerformed

    private void btListadoDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListadoDerechaActionPerformed
        //Suma 1 con el tope del size del arraylist
        if (pagina == ultimaPagina) {
            //No pasa pagina
        } else {
            pagina++;
            tfListadoCodProveedor.setText(CodigoProveedor.get(pagina));
            tfListadoNombre.setText(Nombre.get(pagina));
            tfListadoApellidos.setText(Apellidos.get(pagina));
            tfListadoDireccion.setText(Direccion.get(pagina));
            tfListadoPagina.setText(String.valueOf(pagina + 1));

        }

    }//GEN-LAST:event_btListadoDerechaActionPerformed

    private void btListadoIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListadoIzquierdaActionPerformed
        if (pagina == 0) {
            JOptionPane.showMessageDialog(null, "YA ESTAS EN LA PRIMERA PAGINA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else {
            pagina--;
            tfListadoCodProveedor.setText(CodigoProveedor.get(pagina));
            tfListadoNombre.setText(Nombre.get(pagina));
            tfListadoApellidos.setText(Apellidos.get(pagina));
            tfListadoDireccion.setText(Direccion.get(pagina));
            tfListadoPagina.setText(String.valueOf(pagina + 1));
        }


    }//GEN-LAST:event_btListadoIzquierdaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btInsertar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btListadoBaja;
    private javax.swing.JButton btListadoDerecha;
    private javax.swing.JButton btListadoDerechaMas;
    private javax.swing.JButton btListadoEjecutarConsulta;
    private javax.swing.JButton btListadoIzquierda;
    private javax.swing.JButton btListadoIzquierdaMas;
    private javax.swing.JButton btModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfCodigoProveedor;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfListadoApellidos;
    private javax.swing.JTextField tfListadoCodProveedor;
    private javax.swing.JTextField tfListadoDireccion;
    private javax.swing.JTextField tfListadoNombre;
    private javax.swing.JTextField tfListadoPagTotal;
    private javax.swing.JTextField tfListadoPagina;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
