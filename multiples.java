 
package problemsolving;
 import java.util.Scanner;
public class multiples {
    public static void main(String[] args) {
        
        int A,B;
        Scanner input=new Scanner(System.in);
        A=input.nextInt();
        B=input.nextInt();
        
        if(A%2==0 && B%2==0){
            System.out.println("Nao sao Multiplos");
        }
        else{
            System.out.println("Sao Multiplos");
            
        }
    }
    
}
