// Write a Java program to sort a numeric array and a string array

package excercie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		double somme =0 ;
		
		Scanner kb  = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList();
		double i = 1;
		
		while (i !=0){
			
			System.out.println("Write the price ");
			
			i = kb.nextDouble();
			if (i !=0){
				list.add(i);

				
			}
						
		}
		for(Double n :list){
			
				System.out.println("Produit"+(list.indexOf(n)+1)+"............"+n);
				somme+=n;
				System.out.println();
				System.out.println();
				System.out.println();
				
				System.out.println("Sous-total : "+somme);
				System.out.println("TPS : "+somme*.05);


			
			
			
			
		}
		

		

	}

}
