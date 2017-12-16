import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		
		int[] x = new int[10];
		
		int [][] y = new int [2][5];
		
		
		
		Random rand = new Random();
		int z =0 ;
		for(int i = 0 ;i<y.length;i++){
			
			for (int j=0;j<y[i].length;j++){
				z= rand.nextInt(10+1-0)+0;
				y[i][j] = z;
				
			}
			
			
		}		System.out.println(Arrays.deepToString(y));

		
			
		}
		
		
		
		
	}

			
			
			
		

			
			

			
	
	
	
	

