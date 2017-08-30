import java.net.*;
import java.io.*;
import java.util.Date;

public class ServerTCP {
  public static void main(String[] args) {
    try {
      // socket listening 
      ServerSocket server = new ServerSocket(12345);
      System.out.println("Listening 12345 port");
      while(true) {
        // accept() freeze until a connection request
        Socket client = server.accept();
        System.out.println("Client connected: " + client.getInetAddress().getHostAddress());
        ObjectOutputStream output = new ObjectOutputStream(client.getOutputStream());
        output.flush();
        output.writeObject(new Date());
        output.close();
        client.close();
      }  
    }   
    catch(Exception e) {
       System.out.println("Error: " + e.getMessage());
    }
    //finally {...}  
  }     
}