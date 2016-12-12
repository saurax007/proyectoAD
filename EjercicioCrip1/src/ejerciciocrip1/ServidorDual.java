/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteservidordes;

import java.net.*;
import java.io.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class ServidorDual
{
  final int                PUERTO          = 5000;
  private ServerSocket     Servidor;
  private Socket           socket;
 
 

  public static void main(String[] args) throws IOException, ClassNotFoundException
  {
    // Crea el servidor
    ServidorDual s = new ServidorDual();
    s.initServer();
  }

  public void initServer() throws IOException, ClassNotFoundException
  {
    
    
        System.out.println("Incializando servidor");
               
            
       // Crea el Socket de servicio
      Servidor = new ServerSocket(PUERTO);
      socket = new Socket();
      // Espera conexión de un cliente
      System.out.println("Esperando conexion cliente");
      while (true) {
          socket = Servidor.accept();

          hilo hilo = new hilo(socket);
          hilo.start();
      }
    }
}
