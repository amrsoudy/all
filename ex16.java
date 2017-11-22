import java.util.Scanner;


public class nn {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("donne moi le num ");
		int m = kb.nextInt();
		
		System.out.println("donne moi le num ");
		int n = kb.nextInt();
		
		System.out.println(fab(m));
		System.out.println(fab(n));

		System.out.println(fab(m-n));


		double total = fab(m) /(fab(m - n) *fab(n)) ;
		
		System.out.println(total);
		

	}
	
	public static double fab(int n){
		double fabt = 1 ;
		
		
		for(int i=n;i>=1;i--){
			
			fabt =i*fabt;

			
		}
		
		return fabt ;
		
		
		
		
		
		
	}

	
}
