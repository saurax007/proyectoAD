/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_proyecto;

import gestion_proyecto.GestionBD.CreacionBD;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Gregorio
 */
public class GestionProyectos extends javax.swing.JFrame {

    /**
     * Creates new form GestionProyectos
     */
    public GestionProyectos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * reerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gestionProyectoMenu = new javax.swing.JMenuBar();
        bdMenu = new javax.swing.JMenu();
        crearBDButton = new javax.swing.JMenuItem();
        borrarBDButton = new javax.swing.JMenuItem();
        salirAppButton = new javax.swing.JMenuItem();
        proveedorMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        consultaProveedorButton = new javax.swing.JMenu();
        proveedorCodigoButton = new javax.swing.JMenuItem();
        proveedorNombreButton = new javax.swing.JMenuItem();
        proveedorDireccionButton = new javax.swing.JMenuItem();
        piezasMenu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        proyectosMenu = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        gestionGlobalMenu = new javax.swing.JMenu();
        pppButton = new javax.swing.JMenuItem();
        suministroProveedorButton = new javax.swing.JMenuItem();
        suministroPiezasButton = new javax.swing.JMenuItem();
        estadisticasButton = new javax.swing.JMenuItem();
        ayudaMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bdMenu.setText("Base de Datos");

        crearBDButton.setText("Crear Base de Datos");
        crearBDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearBDButtonActionPerformed(evt);
            }
        });
        bdMenu.add(crearBDButton);

        borrarBDButton.setText("Borrar Base de Datos");
        borrarBDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarBDButtonActionPerformed(evt);
            }
        });
        bdMenu.add(borrarBDButton);

        salirAppButton.setText("Salir");
        bdMenu.add(salirAppButton);

        gestionProyectoMenu.add(bdMenu);

        proveedorMenu.setText("Proveedores");

        jMenuItem1.setText("Gestion de Proveedores");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        proveedorMenu.add(jMenuItem1);

        consultaProveedorButton.setText("Consulta de Proveedores");

        proveedorCodigoButton.setText("Por Codigo");
        proveedorCodigoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedorCodigoButtonActionPerformed(evt);
            }
        });
        consultaProveedorButton.add(proveedorCodigoButton);

        proveedorNombreButton.setText("Por Nombre");
        proveedorNombreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedorNombreButtonActionPerformed(evt);
            }
        });
        consultaProveedorButton.add(proveedorNombreButton);

        proveedorDireccionButton.setText("Por Direccion");
        proveedorDireccionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedorDireccionButtonActionPerformed(evt);
            }
        });
        consultaProveedorButton.add(proveedorDireccionButton);

        proveedorMenu.add(consultaProveedorButton);

        gestionProyectoMenu.add(proveedorMenu);

        piezasMenu.setText("Piezas");

        jMenuItem2.setText("Gestion Piezas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        piezasMenu.add(jMenuItem2);

        jMenu2.setText("Consulta Piezas");

        jMenuItem3.setText("Por Codigo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Por Nombre");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        piezasMenu.add(jMenu2);

        gestionProyectoMenu.add(piezasMenu);

        proyectosMenu.setText("Proyectos");

        jMenuItem5.setText("Gestion Proyectos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        proyectosMenu.add(jMenuItem5);

        jMenu1.setText("Consulta Proyectos");

        jMenuItem6.setText("Por Codigo");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Por Nombre");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem8.setText("Por Ciudad");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        proyectosMenu.add(jMenu1);

        gestionProyectoMenu.add(proyectosMenu);

        gestionGlobalMenu.setText("Gestion Global");

        pppButton.setText("Piezas, Proveedores y Proyectos");
        pppButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pppButtonActionPerformed(evt);
            }
        });
        gestionGlobalMenu.add(pppButton);

        suministroProveedorButton.setText("Suministros por Proveedor");
        suministroProveedorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suministroProveedorButtonActionPerformed(evt);
            }
        });
        gestionGlobalMenu.add(suministroProveedorButton);

        suministroPiezasButton.setText("Suministros por Piezas");
        suministroPiezasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suministroPiezasButtonActionPerformed(evt);
            }
        });
        gestionGlobalMenu.add(suministroPiezasButton);

        estadisticasButton.setText("Estadisticas");
        estadisticasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadisticasButtonActionPerformed(evt);
            }
        });
        gestionGlobalMenu.add(estadisticasButton);

        gestionProyectoMenu.add(gestionGlobalMenu);

        ayudaMenu.setText("Ayuda");
        gestionProyectoMenu.add(ayudaMenu);

        setJMenuBar(gestionProyectoMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearBDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearBDButtonActionPerformed
        CreacionBD bd = new CreacionBD();
        //comprueba si existe
        Boolean existe = bd.ComprobarBD();
        if (existe) {
            JOptionPane.showMessageDialog(null, "YA EXISTE LA BD", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else {
            bd.CreacionBD();
            JOptionPane.showMessageDialog(null, "BD CREADA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_crearBDButtonActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        GestionDeProveedores gp = new GestionDeProveedores();
        gp.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void proveedorCodigoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedorCodigoButtonActionPerformed
        ConsultaProveedoresCodigo cp = new ConsultaProveedoresCodigo();
        cp.show();
    }//GEN-LAST:event_proveedorCodigoButtonActionPerformed

    private void borrarBDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarBDButtonActionPerformed
        CreacionBD bd = new CreacionBD();
        JFrame parent = new JFrame();
        //comprueba si existe
        Boolean existe = bd.ComprobarBD();
        if (existe) {

            bd.BorrarBD();
            JOptionPane.showMessageDialog(null, "BD BORRADA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "NO EXISTE BD", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

        }    }//GEN-LAST:event_borrarBDButtonActionPerformed

    private void proveedorNombreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedorNombreButtonActionPerformed
        ConsultaProveedoresNombre cpn = new ConsultaProveedoresNombre();
        cpn.show();
    }//GEN-LAST:event_proveedorNombreButtonActionPerformed

    private void proveedorDireccionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedorDireccionButtonActionPerformed
        ConsultaProveedoresDireccion cpd = new ConsultaProveedoresDireccion();
        cpd.show();
    }//GEN-LAST:event_proveedorDireccionButtonActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        GestionDePiezas gdp = new GestionDePiezas();
        gdp.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ConsultaPiezasCodigo cpc = new ConsultaPiezasCodigo();
        cpc.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        ConsultaPiezasNombre cpn = new ConsultaPiezasNombre();
        cpn.show();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
//Falta crear la GestionDeProyectos
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        ConsultaProyectosCodigo cproyectosc = new ConsultaProyectosCodigo();
        cproyectosc.show();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        ConsultaProyectosNombre cproyectosn = new ConsultaProyectosNombre();
        cproyectosn.show();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        ConsultaProyectosCiudad cproyectoscd = new ConsultaProyectosCiudad();
        cproyectoscd.show();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void pppButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pppButtonActionPerformed
        GestionGlobalPPP ggppp = new GestionGlobalPPP();
        ggppp.show();
    }//GEN-LAST:event_pppButtonActionPerformed

    private void suministroProveedorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suministroProveedorButtonActionPerformed
        SuministrosPorProveedor spp = new SuministrosPorProveedor();
        spp.show();
    }//GEN-LAST:event_suministroProveedorButtonActionPerformed

    private void suministroPiezasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suministroPiezasButtonActionPerformed
        NumeroPiezasSuministradasEnProyecto npsep = new NumeroPiezasSuministradasEnProyecto();
        npsep.show();
    }//GEN-LAST:event_suministroPiezasButtonActionPerformed

    private void estadisticasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadisticasButtonActionPerformed
        ResumenesEstadisticas re = new ResumenesEstadisticas();
        re.show();
    }//GEN-LAST:event_estadisticasButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GestionProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionProyectos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ayudaMenu;
    private javax.swing.JMenu bdMenu;
    private javax.swing.JMenuItem borrarBDButton;
    private javax.swing.JMenu consultaProveedorButton;
    private javax.swing.JMenuItem crearBDButton;
    private javax.swing.JMenuItem estadisticasButton;
    private javax.swing.JMenu gestionGlobalMenu;
    private javax.swing.JMenuBar gestionProyectoMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenu piezasMenu;
    private javax.swing.JMenuItem pppButton;
    private javax.swing.JMenuItem proveedorCodigoButton;
    private javax.swing.JMenuItem proveedorDireccionButton;
    private javax.swing.JMenu proveedorMenu;
    private javax.swing.JMenuItem proveedorNombreButton;
    private javax.swing.JMenu proyectosMenu;
    private javax.swing.JMenuItem salirAppButton;
    private javax.swing.JMenuItem suministroPiezasButton;
    private javax.swing.JMenuItem suministroProveedorButton;
    // End of variables declaration//GEN-END:variables
}
