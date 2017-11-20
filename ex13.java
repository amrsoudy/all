// Write a Java program to sort a numeric array and a string array

package excercie13;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		double somme =0 ;
		Scanner kb  = new Scanner(System.in);
		
		ArrayList<Double> mylist = new ArrayList<Double>();  
		
		double i = 1.0;
		
		while (i !=0){
			
			System.out.println("Write the price ");
			
		
			i = kb.nextDouble();
			
			
			if (i !=0){
				mylist.add(i);
				
			}
						
		}
		for(Double n :mylist){
			
				System.out.println("Produit"+(mylist.indexOf(n)+1)+"............"+n);
				somme+=n;
	
		}
        DecimalFormat formatter = new DecimalFormat("#.###");

		
		double tps = somme*0.05;
		double tvq = somme * 0.09975;
		double total = somme+tps+tvq;
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Sous-total : "+formatter.format(somme)+"$");
		System.out.println("TPS : "+formatter.format(tps)+"$");
		System.out.println("TVQ : "+formatter.format(tvq)+"$");
		System.out.println("total : "+formatter.format(total)+"$");
	
	}

}