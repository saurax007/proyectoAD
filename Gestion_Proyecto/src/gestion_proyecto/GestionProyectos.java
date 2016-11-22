/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_proyecto;

/**
 *
 * @author Gregorio
 */
public class GestionProyectos extends javax.swing.JFrame {

    /**
     * Creates new form GestionProyectos
     */
    public GestionProyectos() {     
        GestionGlobalPPP ggppp = new GestionGlobalPPP();
        SuministrosPorProveedor spp = new SuministrosPorProveedor();
        PiezasSuministradasProyectos psp = new PiezasSuministradasProyectos();
        ResumenesEstadisticas re = new ResumenesEstadisticas();
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
        proyectosMenu = new javax.swing.JMenu();
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

        proveedorCodigoButton.setText("Por codigo");
        proveedorCodigoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedorCodigoButtonActionPerformed(evt);
            }
        });
        consultaProveedorButton.add(proveedorCodigoButton);

        proveedorNombreButton.setText("Por Nombre");
        consultaProveedorButton.add(proveedorNombreButton);

        proveedorDireccionButton.setText("Por Direccion");
        consultaProveedorButton.add(proveedorDireccionButton);

        proveedorMenu.add(consultaProveedorButton);

        gestionProyectoMenu.add(proveedorMenu);

        piezasMenu.setText("Piezas");
        gestionProyectoMenu.add(piezasMenu);

        proyectosMenu.setText("Proyectos");
        gestionProyectoMenu.add(proyectosMenu);

        gestionGlobalMenu.setText("Gestion Global");

        pppButton.setText("Piezas, Proveedores y Proyectos");
        gestionGlobalMenu.add(pppButton);

        suministroProveedorButton.setText("Suministros por Proveedor");
        gestionGlobalMenu.add(suministroProveedorButton);

        suministroPiezasButton.setText("Suministros por Piezas");
        gestionGlobalMenu.add(suministroPiezasButton);

        estadisticasButton.setText("Estadisticas");
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
        // TODO add your handling code here:
    }//GEN-LAST:event_crearBDButtonActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
                GestionDeProveedores gp = new GestionDeProveedores();
        gp.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void proveedorCodigoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedorCodigoButtonActionPerformed
        ConsultaProveedoreesCodigo cp = new ConsultaProveedoreesCodigo();
        cp.show();
    }//GEN-LAST:event_proveedorCodigoButtonActionPerformed

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
    private javax.swing.JMenuItem jMenuItem1;
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