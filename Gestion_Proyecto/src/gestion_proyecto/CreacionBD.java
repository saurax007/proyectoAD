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
    private static final String INSERT_PIEZAS = "INSERT INTO PIEZAS(CODIGO, NOMBRE, PRECIO, DESCRIPCION) VALUES ('10000', 'PROCESADOR', 129.90, 'INTEL I76700'),"
            + "('10001', 'PROCESADOR', 179.00, 'AMD 8800'),"
            + "('10002', 'TARGETA GRAFICA', 249.90, 'NVIDIA GTX 1060')";
    private static final String INSERT_PROVEEDORES = "INSERT INTO PROVEEDORES(CODIGO, NOMBRE, APELLIDOS, DIRECCION) VALUES('20000', 'MARIO', 'GARCIA PEREZ', 'CALLE ARRIAGA 2'),"
            + "('20001','AITOR','FERNANDEZ ETXEBERRIA','CALLE ANDORRA 43'),"
            + "('20002','JORDI','SANCHEZ RECIO','CALLE ROMERO 26')";
    private static final String INSERT_PROYECTOS = "INSERT INTO PROYECTOS(CODIGO, NOMBRE, CIUDAD) VALUES('30000','MSI X8','MADRID'),"
            + "('30001','ASUS P9','BARCELONA'),"
            + "('30002','HP 4500','BILBAO')";
    private static final String INSER_GESTION = "INSERT INTO GESTION(CODPROVEEDOR, CODPIEZA, CODPROYECTO, CANTIDAD) VALUES('10000','20000','30000',2),"
            + "('10001', '20001', '30001', 5),"
            + "('10002', '20002', '30003', 8)";

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
            statement.executeUpdate(INSERT_PIEZAS);
            statement.executeUpdate(INSERT_PROVEEDORES);
            statement.executeUpdate(INSERT_PROYECTOS);
            statement.executeUpdate(INSER_GESTION);

        } catch (SQLException ex) {
        }
    }

}
