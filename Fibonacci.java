
import javax.swing.JOptionPane;

//Método iterativo
   
public class Fibonacci {
    public static void fibo(int n){
       int num1 =0, num2=1; //se inicializa el primer y segundo numero en 0 y 1
       int count=0;
       //iterativo 
       while(count<n){
           System.out.println(num1 + "");
       int num3 = num2+num1;
       num1=num2; 
       num2=num3;
       count=count+1;
       
       }
        
      
    }
 public static void main(String[] args)
 {
     int n=10;
     fibo(n);
    
 }
}





