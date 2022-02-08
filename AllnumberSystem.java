 
package problemsolving;

import java.util.Scanner;

 
public class AllnumberSystem {
    public static void main(String[] args) {
        
         Scanner input=new Scanner(System.in);
        int n,even=0,odd=0,positive=0,negative=0;
        
        
         int i ;
        
        for(i=1;i<=5;i++){
            n=input.nextInt();
            
            if(n%2==0){
                even++;
              
                 
            }
            if(n%2!=0){
                odd++;
                
            }
            if(n>0){
                positive++;
            }
            if(n<0){
                negative++;
            }
            
        }
        System.out.printf("%d valores pares\n",even);
        System.out.printf("%d odd\n",odd);
        System.out.printf("%d positive\n",positive);
        System.out.printf("%d negative\n",negative);
    }
}

    
    

