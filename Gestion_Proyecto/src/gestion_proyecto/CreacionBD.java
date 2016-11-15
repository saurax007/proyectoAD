/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 9fad09
 */
public class CreacionBD {

    private static final String crearBD = "CREATE DATABASE proyecto";

    private static final String TABLA_PIEZAS = "CREATE TABLE PIEZAS("
            + "CODIGO VARCHAR(6) NOT NULL,"
            + "NOMBRE VARCHAR(20) NOT NULL,"
            + "PRECIO FLOAT NOT NULL,"
            + "DESCRIPCION TEXT)";
    private static final String TABLA_PROVEEDORES = "CREATE TABLE PROVEEDORES("
            + "CODIGO VARCHAR(6) NOT NULL PRIMARY KEY,"
            + "NOMBRE VARCHAR(20) NOT NULL,"
            + "APELLIDOS VARCHAR(30) NOT NULL,"
            + "DIRECCION VARCHAR(40) NOT NULL)";
    private static final String TABLA_PROYECTOS = "CREATE TABLE PROYECTOS("
            + "CODIGO VARCHAR(6) NOT NULL PRIMARY KEY,"
            + "NOMBRE VARCHAR(40) NOT NULL,"
            + "CIUDAD VARCHAR(40))";
    private static final String TABLA_GESTION = "CREATE TABLE GESTION("
            + "CODPROVEEDOR VARCHAR(6),"
            + "CODPIEZA VARCHAR(6) NOT NULL,"
            + "CODPROYECTO VARCHAR(6) NOT NULL,"
            + "CANTIDAD FLOAT,"
            + "PRIMARY KEY (CODPROVEEDOR, CODPIEZA, CODPROYECTO),"
            + "FOREIGN KEY (CODPROVEEDOR) REFERENCES PROVEEDORES(CODIGO),"
            + "FOREIGN KEY (CODPIEZA) REFERENCES PIEZAS(CODIGO),"
            + "FOREIGN KEY (CODPROYECTO) REFERENCES PROYECTOS(CODIGO))";

    public boolean ComprobarBD() {
        try {
            Connection con = null;
            con = Conectar();
            ResultSet resultSet = con.getMetaData().getCatalogs();

            while (resultSet.next()) {

                String databaseName = resultSet.getString(1);
                if (databaseName.equals("proyecto")) {
                    return true;
                }
            }
            resultSet.close();
        } catch (SQLException ex) {
        }

        return false;
    }

    public Connection Conectar() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=toor");
        return con;

    }

    public CreacionBD() {
        try {
            Connection con = null;
            con = Conectar();
            Statement statement = con.createStatement();
            statement.executeUpdate(crearBD);
            statement.executeUpdate(TABLA_PIEZAS);
            statement.executeUpdate(TABLA_PROVEEDORES);
            statement.executeUpdate(TABLA_PROYECTOS);
            statement.executeUpdate(TABLA_GESTION);
        } catch (SQLException ex) {
        }
    }

}
