 ///beecrowd problemss......areaofcircle_1002
package problemsolving;

import java.util.Scanner;
public class 1002 {
    public static void main(String[] args) {
        
       double A,B,C,TRIANGULO,CIRCULO,TRAPEZIO,QUADRADO,RETANGULO;
       
       Scanner input=new Scanner(System.in);
        A=input.nextDouble();
        B=input.nextDouble();
        C=input.nextDouble();
        TRIANGULO = 0.5*A*C;
        CIRCULO  = C*C*3.14159;
        TRAPEZIO = ((A+B)/2*C);
        QUADRADO = B*B;
        RETANGULO= A*B;
        System.out.printf("TRIANGULO  %.3f\n",TRIANGULO);
        System.out.printf("CIRCULO   = %.3f\n",  CIRCULO );
        System.out.printf("TRAPEZIO  = %.3f\n", TRAPEZIO);
        System.out.printf(" QUADRADO = %.3f\n",QUADRADO);
        System.out.printf("RETANGULO = %.3f\n",RETANGULO);
        
        
        
        
        
           
       
        
        
    }
       
            
    
}
