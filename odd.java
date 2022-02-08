 
package problemsolving;

 import java.util.Scanner;
public class odd {
    public static void main(String[] args) {
        int X,i;
        Scanner input=new Scanner(System.in);
       X=input.nextInt();
       if(X>=0 && X<=1000){
       
       
               for(i=1;i<X;i++){
                   if(i%2!=0){
                       System.out.println(""+i);
                   }
                   
               }
    
    
    }}
}