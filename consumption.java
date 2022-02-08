 
package problemsolving;

 import java.util.Scanner;
public class consumption {
    public static void main(String[] args) {
        int X ;
        float Y,average;
        
        Scanner input=new Scanner(System.in);
        X=input.nextInt();
        Y=input.nextFloat();
         
        System.out.printf("km/l %.3f",X/Y);
        
        
    }
    
}
