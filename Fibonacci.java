

import java.util.ArrayList;

public class ex14 {

	public static void main(String[] args) {
		
	       /* for (int i = 0; i <= 6; i++)
	            System.out.print( fab(i)+"  "); 
		
		
	}

	public static long fab(int n){//2
		if (n<=1) return n;
		return fab(n-1)+fab(n-2);*/
		
		
		int n1=0,n2=1,n3,count= 6 ;
		System.out.print(n1+" "+n2);

		
		
		for (int i =2;i<=count;i++){
			
			n3 =n1+n2;//0+1 = 1  * 1+1=2 //1+2=3//2+3=5//3+5=8
			n1 = n2 ;// 1 -//1//2//3
			n2 =n3 ;//1		//2//3//5
			System.out.print("  "+n3+"  ");
			
		}
		
		
		
		
	}
}
