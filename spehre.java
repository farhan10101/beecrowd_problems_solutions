 
package problemsolving;

 import java.util.Scanner;

public class spehre {
    public static void main(String[] args) {
        double R,VOLUME;
        Scanner input=new Scanner(System.in);
        R=input.nextDouble();
        VOLUME=(double)(4.0/3)*3.14159*(R*R*R);
        System.out.printf("VOLUME = %.3f\n",VOLUME);
        
    }
    
}
