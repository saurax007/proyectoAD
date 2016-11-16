/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_proyecto.GestionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
    private static final String borrarBD = "DROP DATABASE IF EXISTS proyecto";
    private static final String usarBD = "USE proyecto";

    private static final String TABLA_PIEZAS = "CREATE TABLE PIEZAS("
            + "CODIGO VARCHAR(6) NOT NULL PRIMARY KEY,"
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
    private static final String INSERT_GESTION = "INSERT INTO GESTION(CODPROVEEDOR, CODPIEZA, CODPROYECTO, CANTIDAD) VALUES('20000','10000','30000',2),"
            + "('20001', '10001', '30001', 5),"
            + "('20002', '10002', '30002', 8)";

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
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        return false;
    }

    public Connection Conectar() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CreacionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull",
                "root", "toor");
        return con;

    }

    public void CreacionBD() {
        try {
            Connection con = null;
            con = Conectar();
            Statement statement = con.createStatement();
            statement.executeUpdate(crearBD);
            statement.executeUpdate(usarBD);
            statement.executeUpdate(TABLA_PIEZAS);
            statement.executeUpdate(TABLA_PROVEEDORES);
            statement.executeUpdate(TABLA_PROYECTOS);
            statement.executeUpdate(TABLA_GESTION);
            statement.executeUpdate(INSERT_PIEZAS);
            statement.executeUpdate(INSERT_PROVEEDORES);
            statement.executeUpdate(INSERT_PROYECTOS);
            statement.executeUpdate(INSERT_GESTION);
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }

    public void BorrarBD() {
        try {
            Connection con = null;
            con = Conectar();
            Statement statement = con.createStatement();
            statement.executeUpdate(borrarBD);
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }

    public void AltaProveedores(String codigo, String nombre, String apellidos, String direccion) {
        try {
            Connection con = null;
            con = Conectar();
            Statement st = con.createStatement();
            st.executeUpdate(usarBD);
            PreparedStatement statement = con.prepareStatement("INSERT INTO PROVEEDORES VALUES (?,?,?,?)");
            statement.setString(1, codigo);
            statement.setString(2, nombre);
            statement.setString(3, apellidos);
            statement.setString(4, direccion);
            int retorno = statement.executeUpdate();
            if (retorno > 0) {
                System.out.println("Insertado correctamente");
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }

    public void BajaProveedores(String codigo, String nombre, String apellidos, String direccion) {
        try {
            Connection con = null;
            con = Conectar();
            Statement st = con.createStatement();
            st.executeUpdate(usarBD);
            PreparedStatement statement = con.prepareStatement("DELETE PROVEEDOR WHERE CODIGO = ?");
            statement.setString(1, codigo);
            int retorno = statement.executeUpdate();
            if (retorno > 0) {
                System.out.println("Borrado correctamente");
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }

    public void ModProveedores(String codigo, String nombre, String apellidos, String direccion) {
        try {
            Connection con = null;
            con = Conectar();
            Statement st = con.createStatement();
            st.executeUpdate(usarBD);
            PreparedStatement statement = con.prepareStatement("UPDATE PROVEEDORES SET NOMBRE = ?, APELLIDOS = ?, DIRECCION = ? WHERE CODIGO = ?");
            statement.setString(1, nombre);
            statement.setString(2, apellidos);
            statement.setString(3, direccion);
            statement.setString(4, codigo);
            int retorno = statement.executeUpdate();
            if (retorno > 0) {
                System.out.println("Modificado correctamente");
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }

    public ResultSet GetProveedores() {
        ResultSet rs = null;
        try {
            Connection con = null;
            con = Conectar();
            Statement st = con.createStatement();
            st.executeUpdate(usarBD);
            PreparedStatement statement = con.prepareStatement("SELECT * FROM PROVEEDORES");
            rs = statement.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return rs;
    }

    public void AltaPiezas(String codigo, String nombre, float precio, String descripcion) {
        try {
            Connection con = null;
            con = Conectar();
            Statement st = con.createStatement();
            st.executeUpdate(usarBD);
            PreparedStatement statement = con.prepareStatement("INSERT INTO PIEZAS VALUES (?,?,?,?)");
            statement.setString(1, codigo);
            statement.setString(2, nombre);
            statement.setFloat(3, precio);
            statement.setString(4, descripcion);
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }

    public void BajaPiezas(String codigo) {
        try {
            Connection con = null;
            con = Conectar();
            Statement st = con.createStatement();
            st.executeUpdate(usarBD);
            PreparedStatement statement = con.prepareStatement("DELETE PIEZAS WHERE CODIGO = ?");
            statement.setString(1, codigo);
            int retorno = statement.executeUpdate();
            if (retorno > 0) {
                System.out.println("Borrado correctamente");
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }

    public void ModPiezas(String codigo, String nombre, float precio, String descripcion) {
        try {
            Connection con = null;
            con = Conectar();
            Statement st = con.createStatement();
            st.executeUpdate(usarBD);
            PreparedStatement statement = con.prepareStatement("UPDATE PIEZAS SET NOMBRE = ?, PRECIO = ?, DESCRIPCION = ? WHERE CODIGO = ?");
            statement.setString(1, nombre);
            statement.setFloat(2, precio);
            statement.setString(3, descripcion);
            statement.setString(4, codigo);
            int retorno = statement.executeUpdate();
            if (retorno > 0) {
                System.out.println("Modificado correctamente");
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }

    public ResultSet GetPiezas() {
        ResultSet rs = null;
        try {
            Connection con = null;
            con = Conectar();
            Statement st = con.createStatement();
            st.executeUpdate(usarBD);
            PreparedStatement statement = con.prepareStatement("SELECT * FROM PIEZAS");
            rs = statement.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return rs;
    }

    public void AltaProyectos(String codigo, String nombre, String ciudad) {
        try {
            Connection con = null;
            con = Conectar();
            Statement st = con.createStatement();
            st.executeUpdate(usarBD);
            PreparedStatement statement = con.prepareStatement("INSERT INTO PROYECTOS VALUES (?,?,?)");
            statement.setString(1, codigo);
            statement.setString(2, nombre);
            statement.setString(3, ciudad);
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }

    public void BajaProyectos(String codigo) {
        try {
            Connection con = null;
            con = Conectar();
            Statement st = con.createStatement();
            st.executeUpdate(usarBD);
            PreparedStatement statement = con.prepareStatement("DELETE PPROYECTOS WHERE CODIGO = ?");
            statement.setString(1, codigo);
            int retorno = statement.executeUpdate();
            if (retorno > 0) {
                System.out.println("Borrado correctamente");
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }

    public void ModProyectos(String codigo, String nombre, String ciudad) {
        try {
            Connection con = null;
            con = Conectar();
            Statement st = con.createStatement();
            st.executeUpdate(usarBD);
            PreparedStatement statement = con.prepareStatement("UPDATE PROYECTOS SET NOMBRE = ?, CIUDAD = ? WHERE CODIGO = ?");
            statement.setString(1, nombre);
            statement.setString(2, ciudad);
            statement.setString(4, codigo);
            int retorno = statement.executeUpdate();
            if (retorno > 0) {
                System.out.println("Modificado correctamente");
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }

    public ResultSet GetProyectos() {
        ResultSet rs = null;
        try {
            Connection con = null;
            con = Conectar();
            Statement st = con.createStatement();
            st.executeUpdate(usarBD);
            PreparedStatement statement = con.prepareStatement("SELECT * FROM PROYECTOS");
            rs = statement.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return rs;
    }

}
