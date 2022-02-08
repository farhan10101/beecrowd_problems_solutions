 
package problemsolving;

import java.util.Scanner;

 
public class multiplicationTable {
    public static void main(String[] args) {
        int N;
        Scanner input=new Scanner(System.in);
        N=input.nextInt();
        for(int i=1;i<=10;++i){
            System.out.printf("%d x %d = %d\n",i,N,i*N);
            
        }
        
        
    }
    
}
