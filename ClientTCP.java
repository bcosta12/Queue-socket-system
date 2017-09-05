import java.net.*;
import java.io.*;

public class ClientTCP {
  public static void main(String[] args) throws IOException{

    Socket client = new Socket(args[0],Integer.parseInt(args[1]));

    Worker12 worker1 = new Worker12(1);
    Worker12 worker2 = new Worker12(2);

    int sentCounter = 0;
    while(true){
      sentCounter++;
      DataOutputStream output = new DataOutputStream(client.getOutputStream());
      output.flush();
      worker1.setRandNumber(50000, 10000);
      worker2.setRandNumber(50000, 10000);

      for(int index = 0; index < 100; index++){

        output.writeInt( worker1.getRandNumber(index));
        output.writeInt( worker2.getRandNumber(index));
         
      }
      System.out.println("--------sent "+ sentCounter+"---------");

    }
  }
}