 
package problemsolving;

  import java.util.Scanner;
public class bhashkara {
    public static void main(String[] args) {
        
        double a,b,c, s;
        Scanner input=new Scanner(System.in);
        a=input.nextDouble();
        b=input.nextDouble();
        c=input.nextDouble();
       if(((b * b) - 4 * a * c) < 0 || a == 0){
                System.out.printf("Impossivel calcular\n");
            }
            else{
                s = Math.sqrt((b * b) - 4 * a * c);
                System.out.printf("R1 = %.5f\nR2 = %.5f\n", ((-b + s) / (2 * a)), ((-b - s) / (2 * a)));
            }
        
    }
    
}
