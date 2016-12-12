/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocrip3;

import java.io.IOException;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;

/**
 *
 * @author 9fad09
 */
public class Servidor {

    static final int PUERTO = 6000;
    
    public static void main(String[] args) throws IOException {
       SSLServerSocketFactory sfact = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
        SSLServerSocket servidorSSL = (SSLServerSocket) sfact.createServerSocket(PUERTO);
        SSLSocket clienteConectado = null;
        while(true){
        clienteConectado = (SSLSocket) servidorSSL.accept();
        Hilo hiloServidor = new Hilo(clienteConectado);
        hiloServidor.run();
        }
    }
    
}
