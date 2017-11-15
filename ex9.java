

import java.util.Random;
import java.util.Scanner;
public class Exercise9 {
  public static void main(String[] args)
    {



int i = 0;
	  int rest ;
	  Scanner input = new Scanner(System.in);
	  

	  while (i  <  3){
		  Random rand = new Random();
		  int n = rand.nextInt(10);
		  System.out.println(n);

		  
		  System.out.println("Donner  nomber enter 0 a 9 ");
			
		  int  nom1 = input.nextInt();
		  
		  if (nom1 >= 0 && nom1 <10){
			  
			  if (nom1 < n){
				  System.out.println("votre nombre est plus que la random  " );
				  
				  rest =   nom1 - n ;
				  if (rest <= 2 ){
					  System.out.println("cest  froid ");
					  
					  
				  }
				  
				  System.out.println("le different est :   "+rest );
				  System.out.println(n);
				  
			  }else if (nom1 > n){
				  System.out.println("votre nombre est moin que la random  " );
				  rest =  nom1 - n  ;
				  if (rest <= 2 ){
					  System.out.println("cest  choud ");
					  
					  
				  }
				  
				  System.out.println("le different est :   "+rest );
				  
				  System.out.println(n);
  
			  }else if (nom1 == n){
				  
				  System.out.println("il ya egality  et tu gagner   " );
				  
				  System.out.println("le different est : 0  " );
				  
				  System.out.println(n);
				  
				  
			  }
			  
		  }
		  else {
			  
			  System.out.println("enter nomber correct enter 0 - 9  Svp ");
		  }



}
    }
}