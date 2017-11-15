import java.util.Scanner;
public class Exercise5 {
public static void main(String[] args)
    {





	   Scanner in = new Scanner(System.in);
        	
           
        	System.out.println("Input la année : ");
            int a = in.nextInt();
            
            double b = a % 400;
            double r = b % 100 ;
            if (b == 0 ){
            	
            	System.out.println("le annéee bissextile");
            	
            }
            else if (b % 100 == 0 ){
            	System.out.println("le annéee pas bissextile");

            	          	           	
            	
            }
            else if (r % 4 == 0 ){
            	System.out.println("le annéee  bissextile");

            	          	           	
            	
            }else {
            	
            	System.out.println("le annéee pas bissextile");

            	
            }

}
}