 
package problemsolving;

 import java.util.Scanner;
public class ConsecutiveEven {
    public static void main(String[] args) {
        
         int X,Y,sum=0;
    Scanner input=new Scanner(System.in);
    X=input.nextInt();
    Y=input.nextInt();
     for(int i=Y+1;i<X;i++){
         if(i%2!=0){
             sum=sum+i;
              
         }
     }
     System.out.printf("%d\n",sum);
     
    }
}
