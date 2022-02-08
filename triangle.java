 
package problemsolving;

  import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        double A,B,C,area,peramiter;
        Scanner input=new Scanner(System.in);
        A=input.nextDouble();
        B=input.nextDouble();
        C=input.nextDouble();
        if(A+B>C && B+C>A && C+A>B)
        {
            System.out.printf("Perimetro = %.1f\n",A+B+C);
        }
        else{
            System.out.printf("Area = %.1f",0.5*(A+B)*C);
        }
        
        
        
    }
}
