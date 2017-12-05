package quiz2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		double prix ;
		double rab ;
		double total ;
		
		double [] mont = new double [4];  
		mont[0] = 0 ;
		mont[1] = 50 ;
		mont[2] = 200;
		mont[3] = 500 ;
		
		double [] rabais = new double [4];  
		rabais[0] = 0 ;
		rabais[1] = .05 ;
		rabais[2] = .10;
		rabais[3] = .20 ;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Veuillez saisir le montant dépensé");
		prix = kb.nextDouble();
		
		
		rab=funcLeRabais(mont,rabais,prix);
		total = prix * (1-rab);
		
		System.out.println("Le mountant  tu a écrire est  : "+prix);
		System.out.println("le rabais il va etre  : "+rab);
		System.out.println("le total apres rabais est   : "+total);
		
	}
	
	public static double funcLeRabais(double [] mont,double [] rab,double prix){
		
		double rabais = 0 ;
						
		if (prix >=0 & prix <50){
			rabais = rab[0] ;
			
			
			
		}else if (prix >=50 & prix < 200){
			
			rabais =  rab[1] ; 
			
		}else if (prix >= 200 & prix < 500){
			
			rabais = rab[2];
		}
		else if (prix>=500){
			
			rabais = rab[3] ;
			
		}
				
		return rabais ;
						
		}
	public static double funcLeTotal(double rabais,double prix){
		
		
		double total = prix *(1-(rabais));
						
		return total ;
		
		
	}
	
		
	}



