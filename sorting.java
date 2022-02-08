 
package problemsolving;

import java.util.Arrays;
 import java.util.Scanner;
public class sorting {
    public static void main(String[] args) {
         
        int a,b,c;
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        
           int value[] = {a,b,c};
           int number[] = {a,b,c};
           
          Arrays.sort(value);
          
          for(int i=0;i<value.length;i++){
          System.out.println(value[i]);
          }
         
          for(int i=0;i<number.length;i++){
              System.out.println(number[i]);
               
          }
          
        
         
    }
    
    
}
