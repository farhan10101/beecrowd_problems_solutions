/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolving;

import java.util.Scanner;

/**
 *
 * @author FCS
 */
public class salary {
    
    public static void main(String[] args) {
         int N,H,NUMBER;
        float S,SALARY;
        Scanner input=new Scanner(System.in);
         N=input.nextInt();
         H=input.nextInt();
         S=input.nextFloat();
         NUMBER=N;
         System.out.println("NUMBER = "+NUMBER);
         SALARY=H*S;
         System.out.printf("SALARY = U$ %.2f\n",SALARY);
         
         
         
    }
    
}
