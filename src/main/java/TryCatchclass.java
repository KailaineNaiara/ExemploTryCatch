import java.util.Scanner;

public class TryCatchclass {
    public static void main ( String args []){
        
    Scanner t = new Scanner(System.in);
    
      try {
             
      int dividendo;
      int divisor;
      
      System.out.println ("             DIVISÃO              ");
        
      System.out.println (" Por favor, insira um dividendo : ");
      dividendo = t.nextInt();
      System.out.println (" Por favor, insira um divisor   : ");
      divisor = t.nextInt();


      System.out.println(dividendo+" / "+divisor+" = "+(dividendo / divisor));
      
    } catch (Exception ex) {
        
      System.out.println("Erro: " + ex.getMessage()); 
      
    } finally {
          
      System.out.println("Finally");
      
    }
  }
}
  
