 
package problemsolving;

 import java.util.Scanner;
public class positive_average {
    
    public static void main(String[] args) {
        
           double n;
         double x=0,average;
        int positive=0,i;
        Scanner input=new Scanner(System.in);
           
       
        for(i=0;i<6;++i){
             n=input.nextDouble();
            
            if(n>0){
                positive++;
                
                 x+=n;
                 
                
            }
            
              
        }
        average=x/positive;
      System.out.printf("%d valores positivos\n",positive);
        
      
             System.out.printf("%.1f\n",average);
             
      
       
      
   
      }
}
    
    

