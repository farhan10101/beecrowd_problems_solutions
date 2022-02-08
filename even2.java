 
package problemsolving;

 import java.util.Scanner;
public class even2 {
    public static void main(String[] args) {
        
        int a,i,b,c,d,e,n;
         
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        d=input.nextInt();
        e=input.nextInt();
        n=input.nextInt();
       
        
        
         
        for(i=1;i<=n;i++){
            
            if(i%2==0){
               
                System.out.printf("valores pares ",i);
            }
        }
        
        
    }
     
            
    
}
