import java.util.Scanner ;
public class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double [] prix = new double[5] ;
		prix[0]= 11;
		prix[1]= 22;
		prix[2]= 33;
		prix[3]= 44;
		prix[4]= 55;
		String [] noms = new String [5];
		noms[0]="soup";
		noms[1]="formage";
		noms[2]="viande";
		noms[3]="poule";
		noms[4]="pizza";
		afficheMenu(prix,noms);
		int[] compine = new int [5];

		int i = 1;
		int quentite = 0;
		int count = 0 ;
		System.out.println("tu peux finir le comande avec presse   0  ");

		while (i!=0 && count < 5){
			System.out.print("choisir le plate par numbre 1-5  :       ");
			i = kb.nextInt();
			if (i>=1 && i<=5){
				
				System.out.print("le quantite de ca SVP :       ");
				quentite = kb.nextInt();
				compine[i-1]=quentite;
				count ++;
				
			}
			
					
			
		
			}
		
		
		affichagefact(noms,compine,prix);
		
		
		}
	public static void affichagefact(String [] noms , int [] compine,double [] prix ){
		System.out.println("-----------------------------------");
		System.out.println("Votre Facture   :  ");
		int count = 0 ;
		for (int i =0 ;i<prix.length;i++){
			
			if (compine[i]!=0){
				count++;
				System.out.println("produit "+(count)+": "+noms[i]+"  x  "+compine[i]+"........."+prix[i]+"............."+(prix[i]*compine[i]));

				
				
			}
			

	}
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.printf("le soustotal est  :"+"%4.2f\n",soustotal(compine,prix));
		System.out.printf("le tps  est :  "+"%4.2f\n",caltps(soustotal(compine,prix)));
		System.out.printf("le tvq  est :  "+"%4.2f\n",caltvq(soustotal(compine,prix)));
		System.out.printf("le total est  :"+"%4.2f\n",(soustotal(compine,prix)+caltps(soustotal(compine,prix))+caltvq(soustotal(compine,prix))));
		
		
	}
	public static void afficheMenu(double []prix,String[]noms){
		System.out.println("produit nom.........prix");

		
		for(int i = 0;i<noms.length;i++){
			
			System.out.printf((i+1)+"   "+noms[i]+"%12.2f\n",prix[i]);
				
				
				
			}
			
			
			
		}
	public static double soustotal(int [] compine , double [] prix){
		double somme = 0 ;
		for (int i = 0 ;i<compine.length;i++){
			
			somme +=compine[i]*prix[i]; 
			
		}
		
		
		
		return somme ;
	}
	public static double caltps(double  soustotal){
		double tps = 0 ;
		tps = soustotal * 0.05;
		
		return tps;
	}	
		
	public static double caltvq(double  soustotal){
		double tvq = 0 ;
		tvq =  soustotal * 0.0973;
		
		return tvq;
	}	
	}	


		
		
	

