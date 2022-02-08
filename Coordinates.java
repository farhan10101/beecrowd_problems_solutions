 
package problemsolving;

 import java.util.Scanner;
public class Coordinates {
    public static void main(String[] args) {
        double x,y;
        Scanner input=new Scanner(System.in);
        x=input.nextDouble();
        y=input.nextDouble();
       if(x == 0 && y == 0){
   System.out.printf("Origemn\n");
  }else if(x == 0){
   System.out.printf("Eixo Y\n");
  }else if(y == 0){
   System.out.printf("Eixo X\n");
  }else if(x > 0 && y > 0){
   System.out.printf("Q1\n");
  }else if(x > 0 && y < 0){
   System.out.printf("Q4\n");
  }else if(x < 0 && y > 0){
   System.out.printf("Q2\n");
  }else{
   System.out.printf("Q3\n");
  }
    }
    
}
