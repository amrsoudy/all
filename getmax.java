
import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;


public class cast {
	

	public static void main(String[] args) {
		// pour Creé  le list integer 		
		ArrayList<Integer> mylist = new ArrayList<Integer>();
		
		Scanner kb = new Scanner(System.in);
		
	for(int i = 0 ; i < 3 ;i++ ){
		System.out.println("enter le nombre pour comperé ");
		
		//pour Add en la list le value qui venir de le scanner 
		
		mylist.add(kb.nextInt()) ;
		
				
	}
	int max = mylist.get(0);
	
	
	for (int i = 0 ; i < mylist.size();i++)
	
	{
		if (mylist.get(i) < max )
		{
			max = mylist.get(i);
			
			
			
		}
		else
		{
			max = max ;
			
			
		}
			
					
		}
	System.out.println(max);
	}
	


}
					
		

	


		
	
		

	


