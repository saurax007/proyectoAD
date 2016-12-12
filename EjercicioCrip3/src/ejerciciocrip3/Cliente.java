/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocrip3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/**
 *
 * @author 9fad09
 */
public class Cliente {

    static final String host = "localhost";
    static final int puerto = 6000;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SSLSocketFactory sfact = (SSLSocketFactory) SSLSocketFactory.getDefault();
        SSLSocket cliente = (SSLSocket) sfact.createSocket(host, puerto);
        DataOutputStream oos = new DataOutputStream(cliente.getOutputStream());
        DataInputStream ois = new DataInputStream(cliente.getInputStream());
       
        System.out.println("Mensaje recibido del servidor: " + ois.readUTF());
        oos.writeUTF("Hola Servidor");
        System.out.println("Mensaje enviado!");
        cliente.close();
        oos.close();
        ois.close();
        
    }

}
