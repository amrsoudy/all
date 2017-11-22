package tests;
import java.util.Random;
import java.util.Scanner;
public class Exercise8 {
  public static void main(String[] args)
    {

int i = 0;
	  int rest ;
	  Scanner input = new Scanner(System.in);
	  

	 
		  Random rand = new Random();
		  int n = rand.nextInt(20)+20;
		  int choix = 0;
		  System.out.println(n);

		  do{
		  System.out.println("Donner  nomber enter 20 a 40 ");
			
		  int  nom1 = input.nextInt();
		  
		  if (nom1 >= 20 && nom1 <40){
			  
			  if (nom1 < n){
				  System.out.println("votre nombre est plus que la random  " );
				  rest =   nom1 - n ;
				  System.out.println("le different est :   "+rest );
				  System.out.println(n);
				  
			  }else if (nom1 > n){
				  System.out.println("votre nombre est moin que la random  " );
				  rest =  nom1 - n  ;
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
		  }while(choix != n);
    }
}
			  
			  
			  




