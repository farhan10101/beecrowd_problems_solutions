 
package problemsolving;

 import java.util.Scanner;
public class sixodd {
    public static void main(String[] args) {
         int X;
        Scanner input=new Scanner(System.in);
        X=input.nextInt();
        
         
        
        
        for(int i=X;i<=(X+12);i++){
            
            if(i%2!=0){
                System.out.printf("%d\n",i);
            }
        }
        
    }
    
}
