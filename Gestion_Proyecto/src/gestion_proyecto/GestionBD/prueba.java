/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_proyecto.GestionBD;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ion
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        CreacionBD bd = new CreacionBD();
        ResultSet rs = null;
        rs = bd.GetProveedoresPorCod("2");
        while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
            }
        }
    }


