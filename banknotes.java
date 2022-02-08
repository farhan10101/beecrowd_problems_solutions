 
package problemsolving;

 import java.util.Scanner;
public class banknotes {
    public static void main(String[] args) {
        
          float N;
        Scanner input=new Scanner(System.in);
        N=input.nextFloat();
        System.out.printf("NOTAS:\n");
        System.out.printf("%f nota(s) de R$ 100.00\n",N/100);
        N%=100;
        System.out.printf("%f nota(s) de R$ 50.00\n",N/50);
        N%=50;
        System.out.printf("%f nota(s) de R$ 20.00\n",N/20);
        N%=20;
        System.out.printf("%f nota(s) de R$ 10.00\n",N/10);
        N%=10;
        System.out.printf("%f nota(s) de R$ 5.00\n",N/5);
        N%=5;
        System.out.printf("%1f nota(s) de R$ 2.00\n",N/2);
       
        N%=2;
        
        
         System.out.printf("MOEDAS::\n");
        System.out.printf("%f moeda(s) de R$ 1.00\n",N/1.00);
        N%=1.00;
        System.out.printf("%f moeda(s) de R$ 0.50\n",N/0.50);
        N%=0.50;
        System.out.printf("%f moeda(s) de R$ 0.25\n",N/0.25);
        N%=0.25;
        System.out.printf("%f moeda(s) de R$ 0.10\n",N/0.10);
        N%=0.10;
        System.out.printf("%f moeda(s) de R$ 0.05\n",N/0.05);
        N%=0.05;
        System.out.printf("%.0f moeda(s) de R$ 0.01\n",N/0.01);
        N%=0.01;
         
    }
    
}
