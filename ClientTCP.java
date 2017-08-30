import java.net.*;
import java.io.*;
import java.util.Date;


public class ClientTCP {
  public static void main(String[] args) {
    try {
      Socket client = new Socket("127.0.0.1",12345);
      ObjectInputStream input = new ObjectInputStream(client.getInputStream());
      Date date = (Date)input.readObject();
      System.out.println("Server date:" + date.toString());
      input.close();
      System.out.println("connection released");
    }
    catch(Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}