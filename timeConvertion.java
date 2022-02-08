 
package problemsolving;

 import java.util.Scanner;
public class timeConvertion {
    public static void main(String[] args) {
        
        int N,hour,minute,second;
        Scanner input=new Scanner(System.in);
        N=input.nextInt();
        hour=N/3600;
         N=N-(hour*3600);
        minute=N/60;
        N=N-(minute*60);
        
        
        System.out.printf("%d:%d:%d\n",hour,minute,N);
        
        
    }
    
}
