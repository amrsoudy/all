package intra;

import java.util.Scanner;

//Question ||.1

public class Main {

	public static void main(String[] args) {
		double a ,b ;
		Scanner kb =new Scanner(System.in);
		System.out.println("saisir le primére number ");
		a = kb.nextDouble();
		System.out.println("saisir le primére number ");
		b = kb.nextDouble();
	
		affichage(calculePuissance(a,b));

	}
	
	public static double  calculePuissance(double a ,double b ){
		
		
		double puissance = 1 ;
		for (int i = 0 ; i <b;i++ ){
			puissance = a*puissance ;
			
			
		}return puissance ;
		
	
		
	}
	
	public static void affichage(double puissance){
		
		System.out.println("le puissance va Etre  :     "+puissance);
		
		
		
		
	}
	

}
