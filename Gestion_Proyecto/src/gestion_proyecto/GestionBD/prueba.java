/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_proyecto.GestionBD;

/**
 *
 * @author ion
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CreacionBD bd = new CreacionBD();
        Boolean flag = bd.ComprobarBD();
        /*if (!flag) {
        if (!flag) {
            System.out.println("No hay bd creada"
                    + "Creando..");
            bd.CreacionBD();
            System.out.println("Creada!");

        } else {
            System.out.println("Hay una bd creada, borrando...");
            bd.BorrarBD();
            System.out.println("Creando otra vez...");
            bd.CreacionBD();
        }*/
        bd.GetProveedores();
        bd.GetPiezas();
        bd.GetProyectos();
        }
    }


