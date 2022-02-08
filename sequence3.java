 
package problemsolving;
 
public class sequence3 {
    public static void main(String[] args) {
         for (int i = 1,j =7; i <= 9; i += 0.2,j += 0.2) {
			for (int l = i, k = j; k >= (j-2); k--) {
				System.out.println("I="+l+" J="+k);
			}
		}
    }}
    

