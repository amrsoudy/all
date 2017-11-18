package javapractice;
import java.util.Scanner;
public class Exercise8 {
 
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in); 
    System.out.print("Input the investment amount: ");
 	double investment = in.nextDouble();
 	System.out.print("Input the rate of interest: ");
	double rate = in.nextDouble();
	System.out.print("Input number of years: ");
	int year = in.nextInt();
	
	rate *= 0.01;	
	System.out.println("Years    FutureValue");
	for(int i = 1; i <= year; i++) {
    	int formatter = 19;
	    if (i >= 10) formatter = 18;
	    if(i >=100) formatter = 17 ;
		System.out.printf(i + "%"+formatter+".2f\n", futureInvestmentValue(investment, rate/12, i));
		//%18.2f\n
       }
	 }
 
 public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
	 	System.out.print(monthlyInterestRate);
		return investmentAmount * Math.pow(1+monthlyInterestRate, years * 12);
	}
}

/* we multiply rate * .01  same like  10 /100 then divide it by 12  to get the monthly rate 
//we organize the spaces between the number of year and the result 
// we calculate monthly amount *(monthly amount + (rate monthly pow py the number of monthes passed )
// if amount 1000   rate  = 10  and the number of years 5  
so = 1000 *(number of rates thought the passed months )// like 1000* (1.00833333333331 ^ 12 ) // 1000 * (1.0083333333332  ^ 24)


*/