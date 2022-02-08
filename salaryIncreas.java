 
package problemsolving;
 import java.util.Scanner;
public class salaryIncreas {
    public static void main(String[] args) {
       double salary,new_salary = 0;
       int percentage = 0;
       
      
        Scanner input=new Scanner(System.in);
        salary=input.nextDouble();
        if(salary>=0 && salary<=400.00){
            new_salary=salary*.15;
            percentage=15;
        }
        else if(salary>=400.01 && salary<=800.00){
            new_salary=salary*.12;
            percentage=12;
        }
        else if(salary>=800.01 && salary<=1200.00){
            new_salary=salary*.10;
            percentage=10;
        }
        else if(salary>=1200.01 && salary<=2000.00){
            new_salary=salary*.7;
            percentage=7;
        }
        else if(salary>2000.00)  {
             
            percentage=4;
            
        }
         
        
        System.out.printf("Novo salario: %.2f\n",new_salary+salary);
        System.out.printf("Reajuste ganho: %.2f\n",new_salary);
        System.out.printf("Em percentual: %d %%\n",percentage);
    }
    
}
