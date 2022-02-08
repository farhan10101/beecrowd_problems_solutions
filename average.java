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
public class average {
    
    public static void main(String[] args) {
         float A,B,MEDIA;
        Scanner input=new Scanner(System.in);
        A=input.nextFloat();
        B=input.nextFloat();
       
        MEDIA=(float)((A/11*3.5)+(B/11*7.5));
        System.out.printf("MEDIA = %.5f\n",MEDIA);
    }
    
}
