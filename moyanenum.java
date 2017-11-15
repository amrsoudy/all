import java.util.Scanner;

public class moy    {
	

	public static void main(String[] args) {

		Scanner LectureAuClavier = new Scanner(System.in) ;
		
		System.out.print("donner moi le prim nombre ");
		double value1  = LectureAuClavier.nextInt();
		System.out.println("donner moi le deuxieme  nombre ");
		double value2  = LectureAuClavier.nextInt();
		System.out.println("donner moi le troisieme   nombre ");
		double value3  = LectureAuClavier.nextInt();
		float  resulte  =  (float)(( value1+value2+value3) / 3.0);
		
		System.out.println("le resulta de  le moyanne est  "+resulte);
		
		
	}

}
