 
package problemsolving;
import java.util.Scanner;
 
public class dist {
    public static void main(String[] args) {
         double x1,x2,y1,y2,dist;
        Scanner input=new Scanner(System.in);
        x1=input.nextDouble();
          x2=input.nextDouble();
            y1=input.nextDouble();
              y2=input.nextDouble();
        dist=Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
        System.out.printf("%.4f\n",dist);
    }
   
           
    
}
