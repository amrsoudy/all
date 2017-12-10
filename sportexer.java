package dev2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		int [] NomDeSport = new int [1500] ;
		int randnom ;
		
		for(int i = 0 ;i<1500;i++){
			Random rand = new Random();
			NomDeSport[i] = rand.nextInt(4+1-1)+1;

				
			
		}
		
		System.out.println(Arrays.toString(NomDeSport));
		int [] total = new int [4]; 
		String [] noms = new String [4];

		
		
		for (int n:NomDeSport){
			if (n == 1){
				total[0]=total[0]+1;
				noms[0] = "Soccer" ;
				
			}else if (n == 2){
				
				total[1] = total[1]+1;
				noms[1] = "Basket";
				
				}else if (n == 3){
					
					total[2] = total[2]+1;
					noms[2]="Hockey";
				
				}else{
					total[3] = total[3]+1;
					noms[3] = "Football";
					
				}
		
		}
		int [] totalapressort = Arrays.copyOf(total, 4); 

		System.out.println(Arrays.toString(totalapressort));
		System.out.println(Arrays.toString(noms));

		
		Arrays.sort(total);
		
		System.out.println(Arrays.toString(total));

		for (int i  = 0 ; i <4;i++){
			for(int j = 0 ; j <4;j++){
			if(total[i] == totalapressort[j]){
				
				System.out.println(noms[j]+" est  : "+total[i]);
				
			}
			
			}
			
		}
				
				
			}
			
		
		
		
		
		
	}

