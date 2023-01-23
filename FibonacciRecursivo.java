
import javax.swing.JOptionPane;

public class FibonacciRecursivo {
   public static int fibo(int n){
    if(n==0|| n==1)
        return n; //caso Base
   else
        return fibo(n-1)+fibo(n-2);
   } 
 
   public static void main (String args[]){
   
       int n= Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de n?"));
       for (int i=0; i<=n; i++){
         int fibonacci=   fibo(i);
           System.out.println("Resultado:"+fibonacci);
   
       }
   }
   
   
   
   
   
   
   
}
