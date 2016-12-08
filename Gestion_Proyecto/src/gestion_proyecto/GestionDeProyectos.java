/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_proyecto;

import gestion_proyecto.GestionBD.ControladorBD;
import java.awt.event.ActionEvent;
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
public class GestionDeProyectos extends javax.swing.JFrame {

    ResultSet rs;
    ControladorBD bd = new ControladorBD();
    int pagina;
    int ultimaPagina;
    ArrayList<String> CodigoProyecto = new ArrayList<String>();
    ArrayList<String> Nombre = new ArrayList<String>();
    ArrayList<String> Ciudad = new ArrayList<String>();

    /**
     * Creates new form GestionDeProveedores
     */
    public GestionDeProyectos() {
        initComponents();
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
        btLimpiar = new javax.swing.JButton();
        btInsertar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        tfCodigoProyecto = new javax.swing.JTextField();
        tfCiudad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfListadoCodProyecto = new javax.swing.JTextField();
        tfListadoNombre = new javax.swing.JTextField();
        tfListadoPagina = new javax.swing.JTextField();
        tfListadoPagTotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btListadoEjecutarConsulta = new javax.swing.JButton();
        btListadoIzquierdaMas = new javax.swing.JButton();
        btListadoIzquierda = new javax.swing.JButton();
        btListadoDerechaMas = new javax.swing.JButton();
        btListadoBaja = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        tfListadoCiudad = new javax.swing.JTextField();
        btizquierd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("ALTAS BAJAS Y MODIFICACIONES");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Codigo de Proyecto");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nombre");

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Ciudad");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(tfCodigoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(100, 100, 100))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Gestion de Proyectos", jPanel3);
        jPanel3.getAccessibleContext().setAccessibleName("form1");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("LISTA DE PROYECTOS - UTILIZA LOS BOTONES PARA IR DE UN REG A OTRO");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Codigo de Proyecto");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Nombre");

        tfListadoCodProyecto.setEditable(false);

        tfListadoNombre.setEditable(false);

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

        btListadoDerechaMas.setText(">>|");
        btListadoDerechaMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListadoDerechaMasActionPerformed(evt);
            }
        });

        btListadoBaja.setText("Eliminar");
        btListadoBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListadoBajaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Ciudad");

        tfListadoCiudad.setEditable(false);

        btizquierd.setText(">>");
        btizquierd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btizquierdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfListadoCodProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfListadoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfListadoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btListadoIzquierdaMas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btListadoIzquierda)
                        .addGap(18, 18, 18)
                        .addComponent(btizquierd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btListadoDerechaMas))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btListadoEjecutarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(tfListadoPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfListadoPagTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btListadoBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfListadoCodProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfListadoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(tfListadoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfListadoPagTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(tfListadoPagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btListadoBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btListadoEjecutarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btListadoIzquierdaMas)
                    .addComponent(btListadoIzquierda)
                    .addComponent(btizquierd)
                    .addComponent(btListadoDerechaMas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listado de Proyectos", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btListadoDerechaMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListadoDerechaMasActionPerformed
        //Va al ultimo registro
        pagina = ultimaPagina;
        tfListadoCodProyecto.setText(CodigoProyecto.get(pagina));
        tfListadoNombre.setText(Nombre.get(pagina));
        tfListadoCiudad.setText(Ciudad.get(pagina));
    }//GEN-LAST:event_btListadoDerechaMasActionPerformed

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        tfCodigoProyecto.setText("");
        tfNombre.setText("");
        tfCiudad.setText("");
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void btInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsertarActionPerformed
        if (tfCodigoProyecto.getText().equals("") || tfNombre.getText().equals("") || tfCiudad.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "HAY ALGUN CAMPO VACIO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else {
            float precio = Float.parseFloat(tfCiudad.getText());
            bd.AltaProyectos(tfCodigoProyecto.getText(), tfNombre.getText(), tfCiudad.getText());
            JOptionPane.showMessageDialog(null, "PROYECTO AÑADIDO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btInsertarActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        ControladorBD bd = new ControladorBD();
        if (tfCodigoProyecto.getText().equals("") || tfNombre.getText().equals("") || tfCiudad.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "HAY ALGUN CAMPO VACIO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else {
            float precio = Float.parseFloat(tfCiudad.getText());
            bd.ModProyectos(tfCodigoProyecto.getText(), tfNombre.getText(), tfCiudad.getText());
            JOptionPane.showMessageDialog(null, "PROYECTO MODIFICADO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }    }//GEN-LAST:event_btModificarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        ControladorBD bd = new ControladorBD();
        if (tfCodigoProyecto.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "EL CAMPO CODIGO ESTA VACIO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int flag = bd.BajaProyectos(tfCodigoProyecto.getText());
            if (flag == 0) {
                JOptionPane.showMessageDialog(null, "HA HABIDO UN ERROR INTENTADO BORRAR EL PROYECTO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "BORRADO CORRECTAMENTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btListadoBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListadoBajaActionPerformed
        if (tfListadoCodProyecto.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "EL CAMPO CODIGO ESTA VACIO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int flag = bd.BajaProyectos(tfListadoCodProyecto.getText());
            if (flag == 0) {
                JOptionPane.showMessageDialog(null, "HA HABIDO UN ERROR INTENTADO BORRAR LA PIEZA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "BORRADO CORRECTAMENTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btListadoBajaActionPerformed

    private void btListadoEjecutarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListadoEjecutarConsultaActionPerformed
        //Se itera y guarda la informacion del resultset
        try {
            rs = bd.GetProyectos();
            while (rs.next()) {
                CodigoProyecto.add(rs.getString(1));
                Nombre.add(rs.getString(2));
                Ciudad.add(rs.getString(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionDeProveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Se muestra el primer registro y se pone la pagina en 1
        pagina = 0;
        ultimaPagina = CodigoProyecto.size() - 1;

        tfListadoPagina.setText(String.valueOf(pagina + 1));
        tfListadoPagTotal.setText(String.valueOf(ultimaPagina + 1));
        tfListadoCodProyecto.setText(CodigoProyecto.get(pagina));
        tfListadoNombre.setText(Nombre.get(pagina));
        tfListadoCiudad.setText(Ciudad.get(pagina));    
        }//GEN-LAST:event_btListadoEjecutarConsultaActionPerformed


    private void btListadoIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListadoIzquierdaActionPerformed
        if (pagina == 0) {
        } else {
            pagina--;
            tfListadoCodProyecto.setText(CodigoProyecto.get(pagina));
            tfListadoNombre.setText(Nombre.get(pagina));
            tfListadoCiudad.setText(Ciudad.get(pagina).toString());
            tfListadoPagina.setText(String.valueOf(pagina + 1));
        }    
        }//GEN-LAST:event_btListadoIzquierdaActionPerformed

    private void btListadoIzquierdaMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListadoIzquierdaMasActionPerformed
        pagina = 0;
        tfListadoCodProyecto.setText(CodigoProyecto.get(pagina));
        tfListadoNombre.setText(Nombre.get(pagina));
        tfListadoCiudad.setText(Ciudad.get(pagina));
        tfListadoPagina.setText(String.valueOf(pagina + 1));
    }//GEN-LAST:event_btListadoIzquierdaMasActionPerformed

    private void btizquierdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btizquierdActionPerformed
if (pagina == ultimaPagina) {
            //No pasa pagina
        } else {
            pagina++;
            tfListadoCodProyecto.setText(CodigoProyecto.get(pagina));
            tfListadoNombre.setText(Nombre.get(pagina));
            tfListadoCiudad.setText(Ciudad.get(pagina));
            tfListadoPagina.setText(String.valueOf(pagina + 1));

        }    }//GEN-LAST:event_btizquierdActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btInsertar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btListadoBaja;
    private javax.swing.JButton btListadoDerechaMas;
    private javax.swing.JButton btListadoEjecutarConsulta;
    private javax.swing.JButton btListadoIzquierda;
    private javax.swing.JButton btListadoIzquierdaMas;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btizquierd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField tfCiudad;
    private javax.swing.JTextField tfCodigoProyecto;
    private javax.swing.JTextField tfListadoCiudad;
    private javax.swing.JTextField tfListadoCodProyecto;
    private javax.swing.JTextField tfListadoNombre;
    private javax.swing.JTextField tfListadoPagTotal;
    private javax.swing.JTextField tfListadoPagina;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
