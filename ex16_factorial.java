import java.util.Scanner;


public class ex15 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("donne moi le num ");
		int value = kb.nextInt();
		int fab = 1 ;
		
		for(int i=value;i>0;i--){//5-0 //4//33
			
			fab =i*fab;
			System.out.println(fab);
			
		}

	}

}
