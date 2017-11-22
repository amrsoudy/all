// Write a Java program to sort a numeric array and a string array

package excercie13;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		
		int[] a  = new int[10];
		
		Scanner kb = new Scanner(System.in);
		System.out.println("entre le nombre ");
		a[0] = kb.nextInt();
		int min = a[0];
		
		for (int i = 1 ;i < 10 ;i++){
			System.out.println("entre le nombre ");

			a[i] =kb.nextInt();

			if (min >a[i]){
				
				min = a[i];
				
				
			}else {
				
				min = min ;
			}
			
			
			
		
			
		}System.out.println(min);
		System.out.println(Arrays.toString(a));
		
		
		
		
	}
}
