 
package problemsolving;

import java.util.Scanner;

 
public class bonus {
    public static void main(String[] args) {
        String name;
        double salary,value,TOTAL;
        Scanner input=new Scanner(System.in);
        name=input.nextLine();
        salary=input.nextDouble();
        value=input.nextDouble();
        
        System.out.println(name);
        TOTAL=(double)(salary+value*0.15);
        System.out.printf("TOTAL = R$ %.2f\n",TOTAL);
        
        
    }
}
