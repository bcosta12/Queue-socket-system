import java.net.*;
import java.io.*;

public class ServerTCP {
  public static void main(String[] args) throws IOException{
    
    // socket listening 
    ServerSocket server = new ServerSocket(Integer.parseInt(args[0]));
    System.out.println("Listening " + args[0] + " port");

    // accept() freeze until a connection request
    Socket client = server.accept();

    Worker34 worker3 = new Worker34(3);
    Worker34 worker4 = new Worker34(4);
    int receivedCounter = 0;
    while(true) {
      receivedCounter++;
      DataInputStream input = new DataInputStream(client.getInputStream());

      for(int index = 0; index < 100; index++){


        worker3.setTestPrime(index, input.readInt());
        worker4.setTestPrime(index, input.readInt());
        
      }
      for(int index = 0; index < 100; index++){

        worker3.printResult(worker3.getTestPrime(index),index);
        worker4.printResult(worker4.getTestPrime(index),index);
        
      }
      System.out.println("--------received "+ receivedCounter+"---------");
    } 
  }     
}