package tictacteo;

import java.util.Scanner;

public class Other {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Saiser le nombre :");
		double prix = kb.nextDouble();
		
		double[][] mont = new double[2][4];
		mont[0][0] = 0 ;
		mont[0][1] = 50 ;
		mont[0][2] = 200;
		mont[0][3] = 500 ;
		mont[1][0] = 0 ;
		mont[1][1] = 5 ;
		mont[1][2] = 10 ;
		mont[1][3] = 20;
		System.out.println(calcultoux(mont,prix));
		double total = calcuTotal(calcultoux(mont,prix),prix);
		System.out.println(total);
		
	}
	
	public static double calcultoux(double [][] mont,double prix ){
		
		double rabais = 0 ;
		for (int i = 0 ;i<mont[0].length;i++){
			if (prix>=mont[0][i]){
				 rabais = mont[1][i];
				
				
				
			}
								
				
				
			}
		
		return rabais;
			
		}
	
	public static double calcuTotal(double rabais,double prix){
		
		
		double total = prix *(1-rabais/100);
		
		return total;
	}
	
	
		
		
		
		
	}


