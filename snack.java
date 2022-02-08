 
package problemsolving;

 import java.util.Scanner ;
public class snack {
     
     
    
     
        
        public static void main(String[] args) {
            double price[]={4.00, 4.50, 5.00, 2.00, 1.50 };
            
            Scanner input = new Scanner(System.in);
            int X,Y;
            X = input.nextInt();
            Y = input.nextInt();
            //if(price.length>=X){
            System.out.printf("TOTAL: R$ %.2f\n",price[X-1]*Y);
            
            //}
            
            
        }
        
    }
    
   
    
 
