 
package problemsolving;

 import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        int N;
        Scanner input=new Scanner(System.in);
        N=input.nextInt();
        int y=N/365;
        int m=(N%365)/30;
        int d=(N%365)%30;
        System.out.printf("%d ano(s)\n",y);
        System.out.printf("%d mes(es)\n",m);
        System.out.printf("%d dia(s)\n",d);
    }
}
