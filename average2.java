/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolving;

import java.util.Scanner;

 
 
public class average2 {
    public static void main(String[] args) {
        
          float A,B,C,MEDIA;
        Scanner input=new Scanner(System.in);
        A=input.nextFloat();
        B=input.nextFloat();
        C=input.nextFloat();
        MEDIA=(float)((A/10*2)+(B/10*3)+(C/10*5));
        System.out.printf("MEDIA = %.1f", MEDIA);
    }
    
}
