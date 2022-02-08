 

package problemsolving;
import java.util.Scanner;

  class positive {
      public static void main(String[] args) {
          
           double n;
        int positive=0,i;
        Scanner input=new Scanner(System.in);
       
        for(i=0;i<6;++i){
              n=input.nextDouble();
            if(n>0){
                positive++;
                
            }
        }
      System.out.printf("%d valores positivos",positive);
      }}
    
 
