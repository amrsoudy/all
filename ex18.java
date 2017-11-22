import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Ex171 {

	public static void main(String[] args) {
		Scanner kb =new Scanner(System.in);
		
		int [][] a = new int [3][3] ;
	
		int choix =0 ;
		int pos1 = 0;
		int pos2 = 0 ;
		int count = 0 ;
		
		
		for (int x = 0 ; x <3;x++){
			for (int f =  0;f <3 ;f++){
				
				System.out.println("choisir num enter 1-3");
				pos1 = kb.nextInt() ;
				System.out.println("choisir num enter 1-3");
				pos2 = kb.nextInt() ;
				System.out.println("Écrire votre choix 0 ou 1");
				choix = kb.nextInt();
				a[pos1][pos2] = choix;
				count ++;
				
				 System.out.println("  0  " + a[0][0] + "|" + a[0][1] + "|" + a[0][2]);
				 System.out.println("    --+-+--");
				 System.out.println("  1  " + a[1][0] + "|" + a[1][1] + "|" + a[1][2]);
				 System.out.println("    --+-+--");
				 System.out.println("  2  " + a[2][0] + "|" + a[2][1] + "|" + a[2][2]);
				 System.out.println("     0 1 2 ");				
					
				}
			
				
					}
		
		
			
				}
			
				
			
			

	
	public static void printg(){
		int cou = 0; 
		
		for (int x = 0 ; x <3;x++){
			for (int f =  0;f <3 ;f++){
					
				
				System.out.printf("| ");

				System.out.printf("- ");
				cou++;
				if (cou == 3){
					cou = 0;
					System.out.printf("| ");
					System.out.println();
					
				}
		
		


	}			System.out.println("------------- ");

}
		
		
	}

}


