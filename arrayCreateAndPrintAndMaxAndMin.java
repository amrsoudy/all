package excercie;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		
		

		
		int a[] = {22,33,66,88,11};
		min(a);
		max(a);		
		//pour  crée Array 
		int[]  b = new int[3];
		System.arraycopy(a, 0, b, 0, 3);
		//pour print le array 
		System.out.println(Arrays.toString(b));

	}
	static void min(int arr[]){
		
		int min = arr[0];
		for (int i = 1 ;i<arr.length;i++){
			
			if (min>arr[i]){
				
				min = arr[i];
				
			}
			
		}System.out.println(min);
		
		
	}
	static void max(int arr[]){

		
		int max = arr[0];
		for (int i = 1;i<arr.length;i++){
			
			if (max<arr[i]){
				
				max = arr[i]	;			
			}
			
			
		}System.out.println(max);
		
	}

	//pour copy 1 arr a l'autre 
	

	
	
}
