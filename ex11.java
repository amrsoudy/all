import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class EX10 {
	

	public static void main(String[] args) {
		ArrayList<Integer> mylist = new ArrayList<Integer>();
		
		Scanner kb = new Scanner(System.in);
		
	for(int i = 0 ; i < 10 ;i++ ){
		System.out.println("enter le nombre pour comperé ");
				
		mylist.add(kb.nextInt()) ;
		System.out.println(mylist);
		
	}
	
	
	Collections.sort(mylist);
	int f = (mylist.size())/ 2 -1 ;
	System.out.println("le plus grande  nB est  : "+mylist.get(f));

	
	
	
	
	int max = mylist.get(0);
	double somme = 0 ;
	
	
	for (int i = 0 ; i < mylist.size();i++)
	
	{
		
		somme = somme +mylist.get(i) ;
		
		
		
		if (mylist.get(i) > max )
		{
			max = mylist.get(i);
			
			
			
		}
		else
		{
			max = max ;
			
			
		}
			
					
		}
	
	double moyanne = somme / mylist.size() ; 
	
	System.out.println("le plus grande  nB est  : "+max);
	System.out.println("le plus grande  nB est  : "+moyanne);
	}
	


}
