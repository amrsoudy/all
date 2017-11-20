package excercie;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
public static void main(String[] args) {   
	
	
		
	int[] list = {1789, 2035, 1899, 1456, 2013, 
	        1458, 2458, 1254, 1472, 2365, 
	        1456, 2265, 1457, 2456};
	System.out.println(contains(list,2013));
	System.out.println(contains(list,2015));
		
		
	}

public static boolean contains(int arr[],int item) {
	
	
	for(int n : arr){
		
		if (item == n ){
			
			return true;
						
		}	
	
	}
	return false;
	
	
	
	
}


	


	
   

	 
 }
