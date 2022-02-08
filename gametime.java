 
package problemsolving;

import java.util.Scanner;

 
public class gametime {
    public static void main(String[] args) {
        int s,e;
        Scanner gametime=new Scanner(System.in);
        s=gametime.nextInt();
        e=gametime.nextInt();
        if(s>e){
            System.out.println("O JOGO DUROU "+(24-s+e)+" HORA(S)");
        }
        else if(s<e){
            System.out.println("O JOGO DUROU "+(e-s)+" HORA(S)");
            
        }
        else if(s==e){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        
    }
    
}
