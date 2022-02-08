 
package problemsolving;
import java.util.Scanner;
 
public class evenBetween5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,even=0;
        
        
         int i ;
        
        for(i=1;i<=5;i++){
            n=input.nextInt();
            
            if(n%2==0){
                even++;
              
                 
            }
            
        }
        System.out.printf("%d valores pares\n",even);

    }
}
