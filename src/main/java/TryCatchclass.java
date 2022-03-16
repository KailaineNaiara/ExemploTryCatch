
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TryCatchclass {
    public static void main ( String args []){
    int[] valor = {5, 23, 76, 3};     
    
    System.out.println(valor[4]); 

    System.exit(0);
        
        try {
            
      DataInputStream in = new DataInputStream(new BufferedInputStream(
        new FileInputStream("C:\\java\\conteudo.txt")));
         
      while (in.available() != 0){
        System.out.print((char) in.readByte());
      }
    } 
    catch (IOException e){
      System.out.println("Erro: " + e.getMessage());
    }
 
    System.exit(0);
 
  }

}
