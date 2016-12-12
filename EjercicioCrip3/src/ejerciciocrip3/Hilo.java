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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;

/**
 *
 * @author 9fad09
 */
public class Hilo implements Runnable {

    SSLSocket clienteConectado = null;
    public Hilo(SSLSocket clienteConectado) {
        this.clienteConectado = clienteConectado;
    }

    @Override
    public void run() {
        try {
            DataOutputStream oos = new DataOutputStream(clienteConectado.getOutputStream());
        DataInputStream ois = new DataInputStream(clienteConectado.getInputStream());
            //Enviamos mensaje
            oos.writeUTF("Hola Cliente");
            System.out.println("Mensaje enviado");
            //Recibimos mensaje
            String m = ois.readUTF();
            System.out.println("Mensaje recibido: ");
            clienteConectado.close();
            oos.close();
            ois.close();
        } catch (IOException ex) {
            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
