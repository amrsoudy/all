
import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;


public class EX10 {
	

	public static void main(String[] args) {
		// pour Creé  le list integer 		
		ArrayList<Integer> mylist = new ArrayList<Integer>();
		
		Scanner kb = new Scanner(System.in);
		
	for(int i = 0 ; i < 10 ;i++ ){
		System.out.println("enter le nombre pour comperé ");
				
		mylist.add(kb.nextInt()) ;
		
				
	}
	int max = mylist.get(0);
	
	
	for (int i = 0 ; i < mylist.size();i++)
	
	{
		if (mylist.get(i) > max )
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

					
	