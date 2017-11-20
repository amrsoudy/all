package excercie;
public class test {
public static void main(String[] args) {   
 int [][]a = new int[10][10];    
 for(int i = 0; i < 10; i++)
   {
      for(int j = 0; j < 10; j++)
      {
         System.out.printf("%2d ", a[i][j]);
      }
      System.out.println();
   }
 
 
 int count = 0;
 for (int i = 0 ; i<100;i++){
	   
	 System.out.print("-"+"   ");
	 count+=1;
	 if (count == 10 ){
		 count = 0 ;
		 System.out.println();
		 
	 }
	 
 }
}
}