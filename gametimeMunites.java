 
package problemsolving;

 import java.util.Scanner;
public class gametimeMunites {
    public static void main(String[] args) {
        
        int start_hour,end_hour,end_minute,start_minute,minute=0,hour=0;
        Scanner gametime=new Scanner(System.in);
        start_hour=gametime.nextInt();
        end_hour=gametime.nextInt();
        start_minute=gametime.nextInt();
        end_minute=gametime.nextInt();
        
       if (start_hour >= 0 && start_hour <= 24 && end_hour >= 0
                && end_hour <= 24 && start_minute >= 0 && start_minute <= 60
                && end_minute >= 0 && end_minute <= 60) {
           
           
                        if (end_minute > start_minute) {
                minute = end_minute - start_minute;
            } else if (end_minute < start_minute) {
                minute = end_minute - start_minute + 60;
                end_hour = end_hour - 1;
            }
            if (end_hour >= start_hour) {
                hour = end_hour - start_hour;
            } else if (end_hour < start_hour) {
                hour = end_hour - start_hour + 24;
            }
            if (hour == 0 && minute == 0) {
                hour = 24;
            }
        }
        System.out.println("O JOGO DUROU " + hour + " HORA(S) E " + minute + " MINUTO(S)");
    }
    
}
