/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolving;

 
public class Base {
    public void display(){
        System.out.println("Base");
    }
   
    }
class Derived extends Base{
        public void display(){
            System.out.println("Derived");
        }
        
        
    }
public class Main{
    public static void doDislplay(Baso o){
        o.display();
    }
    public static void main(String[] args) {
        Base y= new Derived();
        doDisplay();
    }
    
}
