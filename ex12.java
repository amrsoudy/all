import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class EX10 {
	

	public static void main(String[] args) {
		ArrayList<Integer> mylist = new ArrayList<Integer>();
		
		Scanner kb = new Scanner(System.in);
		
	for(int i = 0 ; i < 4 ;i++ ){
		System.out.println("enter le nombre pour comperé ");
				
		mylist.add(kb.nextInt()) ;
		System.out.println(mylist);
		
	}
	
		
	Collections.sort(mylist);		
	System.out.println("le list en sort method "+mylist);

	Collections.reverse(mylist);
	System.out.println("le list en reverce method : "+mylist);
	Collections.sort(mylist);

	
	if (((mylist.size())/ 2) % 2 == 0){
		int f = (mylist.size())/ 2 -1  ;
		System.out.println("position moyanne   : "+mylist.get(f)+ ":"+mylist.get(f+1));
	}else {
		
		int f = (mylist.size())/ 2   ;
		System.out.println("position moyanne   : "+mylist.get(f));
		
	}
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
	System.out.println("le moyanne sur le total  nB est  : "+moyanne);
	}
	


}
