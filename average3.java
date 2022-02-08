 
package problemsolving;

import java.util.Scanner;

 
public class average3 {
    
    public static void main(String[] args) {
        double N1,N2,N3,N4,N5,Media,n;
        Scanner input=new Scanner(System.in);
         
        N1=input.nextDouble();
        N2=input.nextDouble();
        N3=input.nextDouble();
        N4=input.nextDouble();
        
        
        
        Media=(float)((N1/10*2)+(N2/10*3)+(N3/10*4)+(N4/10*1));
        
        
        if(Media>=7.0){
             System.out.printf("Media: %.1f\n",Media);
            
            System.out.printf("Aluno aprovado.\n");
            
        }
        else if(Media<5){
            System.out.printf("Aluno reprovado.\n");
        }
        else if(Media>=5.0 &&Media<=6.9){
            System.out.printf("Aluno em exame\n");
        }
        N5=input.nextDouble();
        System.out.printf("Nota do exame: %.1f\n",N5);
        n=(N5+Media)/2;
        if(n>=5.0){
            System.out.printf("Aluno reprovado.\n");
        }
        else if(Media<=4.9){
            System.out.println("Aluno reprovado.\n");
            System.out.printf("Media final: %.1f\n",Media);
        }
        else
        {
            System.out.printf("Aluno reprovado.\n");
        }
            
        
    }
    
}
