import java.util.Scanner;

public class TryCatchclass {
    public static void main ( String args []){
        
    Scanner t = new Scanner(System.in);
    
      try {
             
      int dividendo, divisor;
      System.out.println("Digite um valor para dividir : ");
      dividendo = t.nextInt();
      System.out.println("Digite outro valor para dividir : ");
      divisor = t.nextInt();

      if(divisor == 0) {
          
        throw new Exception("Nao eh permitido fazer uma divisao por zero!");
        
      }

      System.out.println(dividendo+" / "+divisor+" = "+(dividendo / divisor));
      
    } catch (Exception ex) {
        
      System.out.println("Erro: " + ex.getMessage()); 
      
    } finally {
          
      System.out.println("Finally");
      
    }
  }
}
