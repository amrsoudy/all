

import java.util.Scanner;
public class Exercise7 {
 public static void main(String[] args)
    {





	Scanner input = new Scanner(System.in);
	System.out.println("Donner moi le prim nomber ");
	
	double nom1 = input.nextDouble();
	System.out.println("Donner moi le deuxieme  nomber ");
	
	double nom2 = input.nextDouble();
	
	
	int quotient = 0 ; 
	
	while (nom1 >= nom2)
	{
		
		nom1 = nom1 - nom2 ;
		quotient ++;
		
		
	}
	System.out.println("quotient is "+quotient);
	System.out.println("rest de la division "+nom1);


}
}